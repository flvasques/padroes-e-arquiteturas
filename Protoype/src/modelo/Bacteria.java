
package modelo;

import modelo.dna.DNA;

public class Bacteria {
    private DNA nucleo;
    private String forma;
    private int movimento;
    private int tamanho;
   
    private double energia;
    private int posX;
    private int posY;
  
    public Bacteria(DNA dna, int x, int y){
        this.nucleo = dna;
        this.forma = dna.getForma();
        this.movimento = dna.getMovimento();
        this.tamanho = dna.getTamanho();
        this.posX = x;
        this.posY = y;
        
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
    public Bacteria clonar(){
        return new Bacteria(this.getNucleo().clonar(),this.posX, this.posY);
    }
}
