
package modelo;

import modelo.Novo.EnviadorSMS;
import modelo.Novo.SMSExecption;
import modelo.Padrao.SMS;
import modelo.Padrao.SMSSender;

public class AdapterNovo implements EnviadorSMS {
    
    private SMSSender send;
    
    private AdapterNovo() {}
    
    public AdapterNovo(SMSSender s){
        this.send = s;
    }
    
    @Override
    public void enviarSMS(String destino, String origem, String[] msgs){
        SMS msg = new SMS();
        msg.setDestino(destino);
        msg.setOrigem(origem);
        String texto = "";
        for(int i = 0; i < msgs.length; i++){
            texto += msgs[i];
        }
        msg.setTexto(texto);
        this.send.senderSMS(msg);
    }
    
}
