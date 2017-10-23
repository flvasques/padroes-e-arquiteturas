
package modelo.Animacao;

import java.util.Timer;
import javafx.scene.canvas.GraphicsContext;
import modelo.Joystick;

public class Andando implements Joystick {
    Timer timer = null;
    Job anima = null;
    boolean pause = true;
    
    @Override
    public void prinmeiraAcao(GraphicsContext gc) {
        if(pause){
            timer = new Timer();
            anima = new Job(gc);
            timer.schedule(anima, 50, 50);
            pause = false;
        }
    }

    @Override
    public void segundaAcao(GraphicsContext gc) {
        pause = true;
        timer.cancel();
    }
    
}
