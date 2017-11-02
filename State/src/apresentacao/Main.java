
package apresentacao;

import modelo.MaquinaGoma;

public class Main {

    public static void main(String[] args) {
        MaquinaGoma maquina = new MaquinaGoma();
        maquina.recebeMoeda();
        maquina.alavancaAcionada();
        maquina.alavancaAcionada();
        maquina.recebeMoeda();
        maquina.alavancaAcionada();
        maquina.recebeMoeda();
        
    }
    
}
