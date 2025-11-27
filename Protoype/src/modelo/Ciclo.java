
package modelo;

import java.util.ArrayList;
import java.util.TimerTask;
import modelo.dna.A;

public class Ciclo extends TimerTask {
    
    private ArrayList<Bacteria> colonia;
    private ArrayList<Comida> nicho;
    private double largura, altura;
    
    
    public Ciclo(){
        colonia = new ArrayList<>();
        nicho = new ArrayList<>();
        this.altura = 100;
        this.largura = 100;
        
        colonia.addAll(Bacteria.criarBacteriasIniciais(new A(), 0, 0, (int)largura, 0));
        
        System.out.println("Tamaho inicial da colonia: " + colonia.size());
        System.out.println("===========");
    }
    
    @Override
    public void run() {
        reporduzir();
    }
    
    private void reporduzir() {
        ArrayList<Bacteria>novos = new ArrayList<>();
        for ( int i = 0; i < colonia.size(); i++ ){
            novos.add(colonia.get(i).clonar());
        }
        for( int i = 0; i < novos.size(); i++ ) {
            colonia.add(novos.get(i));
        }
        System.out.println("Tamaho autal da colonia: " + colonia.size());
        System.out.println("++++++++++");
    }
}
