
package modelo.Animacao;

import java.util.TimerTask;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Job extends TimerTask {
    
    GraphicsContext contexto;
    double largura, altura;
    int posX = 0, posY = 0;
    boolean indoX = true, indoY = true;
    
    public Job (GraphicsContext c) {
        this.contexto = c;
        this.altura = this.contexto.getCanvas().getHeight();
        this.largura = this.contexto.getCanvas().getWidth();
    }
    
    @Override
    public void run() {
        limpar();
        calcular();
        desenhar();
    }
    
    private void desenhar(){
        contexto.setStroke(Color.BLUE);
        contexto.fillOval(posX, posY, 30, 30);
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
    private void limpar(){
        contexto.clearRect(0, 0, largura, altura);
    }
    
}
