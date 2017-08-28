
package observer;

import negocio.*;
import negocio.Interfaces.*;

public class Loader {

    public static void main(String[] args) {
        ILeiloeiro ll = new Leiloeiro();
        IParticipante p1 = new Participante("Joao");
        IParticipante p2 = new Participante("Jopo");
        IParticipante p3 = new Participante("Jose");
        IParticipante p4 = new Participante("Juca");
        
        p1.entrar(ll);
        p2.entrar(ll);
        p3.entrar(ll);
        p4.entrar(ll);
        ll.iniciar(50.5);
        p1.darLance(60);
    }
    
}
