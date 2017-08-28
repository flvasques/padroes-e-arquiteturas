
package negocio;

import java.util.ArrayList;
import negocio.Interfaces.*;

public class Leiloeiro implements ILeiloeiro {
    private Lance vencedor;
    private ArrayList<IParticipante> participantes = new ArrayList<>();
    
    @Override
    public void entar(IParticipante p){
        participantes.add(p);
    }
    @Override
    public void desistir(IParticipante p){
        this.participantes.remove(p);
    }
    @Override
    public void receberLance(Lance l){
        if(l.getValor() > vencedor.getValor()){
            this.vencedor = l;
            notificar();
        }
    }
    @Override
    public void iniciar(double v){
        this.vencedor = new Lance(v);
        notificar();
    }
    public Lance finalizar(){
        notificar();
        return this.vencedor;
    }
    private void notificar(){
        for (int i = 0; i < participantes.size(); i++) {
            this.participantes.get(i).adamento(this.vencedor); 
        }
    }
}
