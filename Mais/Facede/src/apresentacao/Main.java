
package apresentacao;

import negocio.HomeTeater;
import negocio.HomeTeaterFacede;

public class Main {

    public static void main(String[] args) {
       HomeTeaterFacede controle = new HomeTeater();
       controle.wacthMovie("Star Wars IV");
       controle.endMovie();
       controle.listenToCd("Metalica");
       controle.endCd();
       controle.listemRadio();
       controle.endRadio();
    }
    
}
