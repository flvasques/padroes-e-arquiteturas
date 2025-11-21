
package modelo.Animacao;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.TimerTask;

public class Job extends TimerTask {
    
    int largura, altura;
    int posX = 0, posY = 0;
    boolean indoX = true, indoY = true;
    Runnable repaintCallback;
    
    public Job (int largura, int altura, Runnable repaintCallback) {
        this.altura = altura;
        this.largura = largura;
        this.repaintCallback = repaintCallback;
    }
    
    @Override
    public void run() {
        calcular();
        if (repaintCallback != null) {
            repaintCallback.run();
        }
    }
    
    public void desenhar(Graphics2D g2d){
        g2d.setColor(Color.BLUE);
        g2d.fillOval(posX, posY, 30, 30);
    }
    
    private void calcular(){
        if(indoX){
            posX += 5;
            indoX = posX <= 320;
        } else{
            indoX = posX <= 0;
            posX -= 5;
        }
        if(indoY){
            posY += 5;
            indoY = posY <= 170;
        }
        else{
            posY -= 5;
            indoY = posY <= 0;
        }
    }
    
    public int getPosX() {
        return posX;
    }
    
    public int getPosY() {
        return posY;
    }
    
}
