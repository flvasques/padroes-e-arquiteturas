
package modelo.Novo;

public class Enviador implements EnviadorSMS {

    @Override
    public void enviarSMS(String destino, String origem, String[] msgs) throws SMSExecption {
        for (String msg : msgs) {
            System.out.printf("De: " + origem + "\nPara: " + destino + "\nDisse:\n" + msg); 
        }
    }
    
}
