
package modelo;

import modelo.Novo.EnviadorSMS;
import modelo.Novo.SMSExecption;
import modelo.Padrao.SMS;
import modelo.Padrao.SMSSender;

public class AdapterPadrao implements SMSSender {
    
    private EnviadorSMS enviador;
    
    private AdapterPadrao() {}
    
    public AdapterPadrao(EnviadorSMS e){
        this.enviador = e;
    }
    
    @Override
    public boolean senderSMS(SMS sms) {
       int tam = ((int)(sms.getTexto().length() / 10) == 0) ? 1 : (int)(sms.getTexto().length() / 10);
       String[] msgs = new String[tam];
       String origem = sms.getOrigem();
       String destino = sms.getDestino();
       if(sms.getTexto().length() <= 10){
          msgs[0] = sms.getTexto();
       } else {
           for(int i = 0, trecho = 0; i < msgs.length; i++){ 
               msgs[i] = sms.getTexto().substring(trecho, trecho + 10);
               trecho = (trecho + 10 <= sms.getTexto().length())? trecho + 10 : sms.getTexto().length();
               
            }
       }
        try {
            this.enviador.enviarSMS(destino, origem, msgs);
            return true;
        } catch (SMSExecption ex) {
            return false;
        }
    }
  
}
