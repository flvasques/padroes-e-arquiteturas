
package modelo;

import java.util.ArrayList;
import modelo.dna.DNA;

public class Bacteria {
    private static Bacteria instance;
    private DNA nucleo;
    private String forma;
    private int movimento;
    private int tamanho;
   
    private double energia;
    private int posX;
    private int posY;
  
    private Bacteria() {
        // Construtor privado para Singleton
    }
    
    public static Bacteria getInstance() {
        if (instance == null) {
            instance = new Bacteria();
        }
        return instance;
    }
    
    public void inicializar(DNA dna, int x, int y) {
        this.nucleo = dna;
        this.forma = dna.getForma();
        this.movimento = dna.getMovimento();
        this.tamanho = dna.getTamanho();
        this.posX = x;
        this.posY = y;
    }
    
    public static ArrayList<Bacteria> criarBacteriasIniciais(DNA dna, int x1, int y1, int x2, int y2) {
        Bacteria singleton = getInstance();
        singleton.inicializar(dna, x1, y1);
        
        ArrayList<Bacteria> bacterias = new ArrayList<>();
        bacterias.add(singleton.clonar());
        
        Bacteria segunda = singleton.clonar();
        segunda.setPos(x2, y2);
        bacterias.add(segunda);
        
        return bacterias;
    }
    public DNA getNucleo() {
        return nucleo;
    }

    public void setNucleo(DNA nucleo) {
        this.nucleo = nucleo;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getMovimento() {
        return movimento;
    }

    public void setMovimento(int movimento) {
        this.movimento = movimento;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }
    
    public int[] getPos(){
        int[] pos = {posX, posY};
        return pos;
    }
    public void setPos(int x, int y){
        posX = x;
        posY = y;
    }
    public Bacteria clonar() {
        Bacteria clone = new Bacteria();
        clone.nucleo = this.getNucleo().clonar();
        clone.forma = this.forma;
        clone.movimento = this.movimento;
        clone.tamanho = this.tamanho;
        clone.energia = this.energia;
        clone.posX = this.posX;
        clone.posY = this.posY;
        return clone;
    }
}
