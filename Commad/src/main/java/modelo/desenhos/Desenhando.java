
package modelo.desenhos;

import java.awt.Color;
import java.awt.Graphics2D;
import modelo.Joystick;

public class Desenhando implements Joystick {

    @Override
    public void prinmeiraAcao(Graphics2D gc) {
        gc.setColor(Color.BLUE);
        gc.fillOval(150, 90, 30, 30);
    }

    @Override
    public void segundaAcao(Graphics2D gc) {
        // Limpar será feito pelo componente que chama
    }


    
}
