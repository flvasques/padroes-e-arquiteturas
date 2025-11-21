
package modelo.Animacao;

import java.awt.Graphics2D;
import java.util.Timer;
import modelo.Joystick;

public class Andando implements Joystick {
    Timer timer = null;
    Job anima = null;
    boolean pause = true;
    Runnable repaintCallback;
    int largura, altura;
    
    public void setRepaintCallback(Runnable callback) {
        this.repaintCallback = callback;
    }
    
    public void setDimensions(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public void prinmeiraAcao(Graphics2D gc) {
        if(pause){
            timer = new Timer();
            anima = new Job(largura, altura, repaintCallback);
            timer.schedule(anima, 50, 50);
            pause = false;
        }
    }

    @Override
    public void segundaAcao(Graphics2D gc) {
        pause = true;
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }
    
    public Job getJob() {
        return anima;
    }
    
}
