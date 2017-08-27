package negocio;

import negocio.Interfaces.*;

public class Participante implements IParticipante{
    private String nome;
    private Leiloeiro leilao;

    public void darLance(double v){
        leilao.receberLance(new Lance(v,this));
    }
    
    @Override
    public void adamento(Lance l) {
        System.out.println("Lance de " + l.getDono() + " por R$" + l.getValor());
    } 
}
