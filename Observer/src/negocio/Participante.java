 package negocio;

import negocio.Interfaces.*;

public class Participante implements IParticipante{
    private String nome;
    private ILeiloeiro leilao;
    
    private Participante(){}
    
    public Participante(String n){
        this.nome = n;
    }
    
    public String getNome(){
        return this.nome;
    }

    @Override
    public Lance darLance(double v){
        Lance l = new Lance(v,this);
        leilao.receberLance(l);
        return l;
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
    public Lance adamento(Lance l) {
        System.out.println("Lance " 
        + (l.getDono() == null ?( "INICIAL " ): ( "de " + l.getDono().getNome()))
        + " por R$" + l.getValor());
        return l;
    } 
}
