
package observer;

import modelo.Participante;
import modelo.Leiloeiro;
import negocio.Interfaces.*;

public class Loader {
    public static void main(String[] args) {
        IParticipante p1 = new Participante("Joao");
        IParticipante p2 = new Participante("Jopo");
        IParticipante p3 = new Participante("Jose");
        IParticipante p4 = new Participante("Juca");
        ILeiloeiro ll = new Leiloeiro();
        p1.entrar(ll);
        p2.entrar(ll);
        p3.entrar(ll);
        p4.entrar(ll);    
        new Inicio(ll);
    }
    
}
