
package negocio;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import negocio.Interfaces.*;
import observer.Loader;

public class Leiloeiro implements ILeiloeiro {
    private Lance vencedor;
    private ArrayList<IParticipante> participantes = new ArrayList<>();
    private Loader pai;
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
            notificar();
            if(l.getDono().equals(this.participantes.get(this.participantes.size() -1)))novo();
        }
    }
    @Override
    public void iniciar(double v){
        this.vencedor = new Lance(v);
        notificar();
    }
    public Lance finalizar(){
        notificar();
        JOptionPane.showMessageDialog(null, "Item Vendido para: " + this.vencedor.getDono().getNome(), "Agenda", JOptionPane.OK_OPTION);
        this.pai.reset();
        return this.vencedor;
    }
    private void notificar(){
        this.pai.call(vencedor);
        for (int i = 0; i < this.participantes.size(); i++) {
            this.participantes.get(i).adamento(this.vencedor); 
        }
    }
    @Override
    public void setPai(Loader l){
        this.pai = l;
    }
    @Override
    public Loader getPai(){
        return this.pai;
    }
    private void novo(){
         Random n = new Random();
         int i;
         i = n.nextInt((this.participantes.size() - 2) - 0);
         if(this.cont <= 5){
             this.cont++;
            this.participantes.get(i).darLance(this.vencedor.getValor() + 100);   
         }else{
             if(n.nextInt(1 - 0) == 1){
                  this.participantes.get(i).darLance(this.vencedor.getValor() + 100);
             }else{
                 finalizar();
                 this.cont = 0;
             }
         }
         
    }
}
