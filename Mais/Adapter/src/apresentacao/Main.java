
package apresentacao;

import modelo.AdapterMoto;
import modelo.moto.cg125;

public class Main {

    public static void main(String[] args) {
        AdapterMoto adaptado = new AdapterMoto(new cg125());
        adaptado.Volante();
        adaptado.quatroRodas();
    }
}
