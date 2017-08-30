 package negocio;

import negocio.Interfaces.*;
import observer.Inicio;
import observer.Leilao;

public class Participante implements IParticipante{
    private String nome;
    private ILeiloeiro leilao;
    private Leilao telaLeilao = null;
    
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
    public void adamento(Lance l, boolean fim) {
        System.out.println("Lance " 
        + (l.getDono() == null ?( "INICIAL " ): ( "de " + l.getDono().getNome()))
        + " por R$" + l.getValor());
        if(this.telaLeilao != null)this.telaLeilao.addLance(l);
        if(fim && this.telaLeilao != null){
            this.leilao.desistir(this);
            new Inicio(this.leilao);
            this.telaLeilao.dispose();
            this.telaLeilao = null;
            this.leilao = null;
        }
    }

    public Leilao getTelaLeilao() {
        return telaLeilao;
    }
    
    @Override
    public void setTelaLeilao(Leilao telaLeilao) {
        this.telaLeilao = telaLeilao;
    }
    
}
