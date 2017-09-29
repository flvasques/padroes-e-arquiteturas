
package modelo.Padrao;

public class Sender implements SMSSender{

    @Override
    public boolean senderSMS(SMS sms) {
        System.out.printf("De: " + sms.getOrigem() + "\nPara: " + sms.getDestino() + "\nDisse:\n" + sms.getTexto()); 
        return true;
    }
    
}
