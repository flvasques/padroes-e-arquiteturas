 package negocio;

import negocio.Interfaces.*;

public class Participante implements IParticipante{
    private String nome;
    private ILeiloeiro leilao;
    
    private Participante(){}
    
    public Participante(String n){
        this.nome = n;
    }

    @Override
    public void darLance(double v){
        leilao.receberLance(new Lance(v,this));
    }
    
    @Override
    public void entrar(ILeiloeiro leilao){
        this.leilao = leilao;
        this.leilao.entar(this);
    }
    @Override
    public void sair(){
        leilao.desistir(this);
    }
    
    @Override
    public void adamento(Lance l) {
        System.out.println("Lance de " + l.getDono() + " por R$" + l.getValor());
    } 
}
