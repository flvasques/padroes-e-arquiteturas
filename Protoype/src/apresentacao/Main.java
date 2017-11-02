
package apresentacao;

import java.util.Timer;
import modelo.Ciclo;

public class Main {
    public static void main(String[] args) {
        Timer experimento = new Timer();
        experimento.schedule(new Ciclo(), 1000, 1000);
    }
}
