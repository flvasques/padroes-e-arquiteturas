
package modelo.Imagem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.SnapshotParameters;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;


import modelo.Joystick;

public class Mostrador implements Joystick {
    FileChooser pegaArquivo = new FileChooser();
    File arquivo = null;
    String nomeArquivo;
    Image img;
    
    @Override
    public void prinmeiraAcao(GraphicsContext gc) {
        limpar(gc);
        abrirArquivo();
        mostrarAquivo(gc);
    }
    
    @Override
    public void segundaAcao(GraphicsContext gc) {
       limpar(gc);
       ImageView iv = new ImageView(img);
       gc.fillText(nomeArquivo, 0, 10);
       iv.setRotate(40);
       SnapshotParameters params = new SnapshotParameters();
       params.setFill(Color.TRANSPARENT);
       img = iv.snapshot(params, null);
       gc.drawImage(img, 0, 50, 350, 200);
    }
    
    private void abrirArquivo(){
        pegaArquivo.setTitle("Escolha Imagem");
        pegaArquivo.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All Images", "*.*"),
            new FileChooser.ExtensionFilter("JPG", "*.jpg"),
            new FileChooser.ExtensionFilter("GIF", "*.gif"),
            new FileChooser.ExtensionFilter("BMP", "*.bmp"),
            new FileChooser.ExtensionFilter("PNG", "*.png")
        );
        arquivo = pegaArquivo.showOpenDialog(null);
        nomeArquivo = arquivo.getName();
    }
    private void mostrarAquivo(GraphicsContext gc){
        if(arquivo != null){
        BufferedImage bImg;
            try {
                bImg = ImageIO.read(arquivo);
                img = SwingFXUtils.toFXImage(bImg, null);
                gc.drawImage(img, 0, 50, 350, 200);
                gc.fillText(nomeArquivo, 0, 10);
            } catch (IOException ex) {
                Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
                dialogoErro.setTitle("Erro");
                dialogoErro.setHeaderText("Desu ruim");
                dialogoErro.setContentText(ex.toString());
                dialogoErro.showAndWait();
            }
        
        }
    }
    private void limpar(GraphicsContext gc){
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }
    
}
