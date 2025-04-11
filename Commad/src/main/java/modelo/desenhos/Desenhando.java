
package modelo.desenhos;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import modelo.Joystick;

public class Desenhando implements Joystick {

    @Override
    public void prinmeiraAcao(GraphicsContext gc) {
        gc.setFill(Color.BLUE);
        gc.setStroke(Color.BLUE);
        gc.fillOval(150, 90, 30, 30);
    }

    @Override
    public void segundaAcao(GraphicsContext gc) {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }


    
}
