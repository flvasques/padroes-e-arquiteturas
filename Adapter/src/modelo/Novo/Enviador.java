
package modelo.Novo;

public class Enviador implements EnviadorSMS {

    @Override
    public void enviarSMS(String destino, String origem, String[] msgs) throws SMSExecption {
        for (int i = 0; i < msgs.length; i++) {
            System.out.printf("De: " + origem + "\nPara: " + destino + "\nDisse:\n" + msgs[i] + ">\n"); 
        }
    }
    
}
