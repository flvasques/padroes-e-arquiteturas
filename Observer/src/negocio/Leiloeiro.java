
package negocio;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import negocio.Interfaces.*;
import observer.Loader;

public class Leiloeiro implements ILeiloeiro {
    private Lance vencedor;
    private ArrayList<IParticipante> participantes = new ArrayList<>();
    private int cont = 0;
    
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
            notificar(false);
            novo();
        }
    }
    @Override
    public void iniciar(double v){
        this.vencedor = new Lance(v);
        notificar(false);
    }
    public void finalizar(){
        notificar(true);
        JOptionPane.showMessageDialog(null, "Item Vendido para: " + this.vencedor.getDono().getNome(), "Arremate.JAVA", JOptionPane.OK_OPTION);
        this.cont = 0;
    }
    private void notificar(boolean fim){
        for (int i = 0; i < this.participantes.size(); i++) {
            this.participantes.get(i).adamento(this.vencedor, fim); 
        }
    }
    private void novo(){
         Random n = new Random();
         int i;
         i = n.nextInt((this.participantes.size() - 2) - 0);
         if(this.participantes.get(this.participantes.size() -1).equals(this.vencedor.getDono())){
            if(this.cont <= 5){
                this.cont++;
               this.participantes.get(i).darLance(this.vencedor.getValor() + 100);   
            }else{
                if(n.nextBoolean()){
                     this.participantes.get(i).darLance(this.vencedor.getValor() + 100);
                }else{
                    finalizar();
                }
            }
         }
    }
}
