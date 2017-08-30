
package observer;

import negocio.*;
import negocio.Interfaces.*;

public class Loader {
    public static void main(String[] args) {
       new Loader();
    }
    Inicio inicio;
    Leilao leilao;
    ILeiloeiro ll;
    public Loader(){
        IParticipante p1 = new Participante("Joao");
        IParticipante p2 = new Participante("Jopo");
        IParticipante p3 = new Participante("Jose");
        IParticipante p4 = new Participante("Juca");
        ll = new Leiloeiro();
        ll.setPai(this);
        p1.entrar(ll);
        p2.entrar(ll);
        p3.entrar(ll);
        p4.entrar(ll);    
        this.inicio = new Inicio(ll);
    }
    
    public void call(Lance lance){
        this.leilao.addLance(lance);
    }
    public void setLaeilao(Leilao l){
        this.leilao = l;   
    }
    public void reset(){
        this.leilao.dispose();
        this.inicio =  new Inicio(this.ll);
    }
}
