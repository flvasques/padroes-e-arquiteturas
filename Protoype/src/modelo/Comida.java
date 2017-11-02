
package modelo;

public class Comida {
    private double energia;
    private int posX;
    private int posY;
    
    public Comida(double e){
        this.energia = e;
    }
    public int[] getPos(){
        int[] pos = {posX, posY};
        return pos;
    }
    public void setPos(int x, int y){
        posX = x;
        posY = y;
    }
    
    public double getEnergia(){
        return this.energia;
    }
}
