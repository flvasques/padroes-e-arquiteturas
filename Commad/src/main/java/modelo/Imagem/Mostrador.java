
package modelo.Imagem;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Joystick;

public class Mostrador implements Joystick {
    JFileChooser pegaArquivo = new JFileChooser();
    File arquivo = null;
    String nomeArquivo;
    BufferedImage img;
    
    @Override
    public void prinmeiraAcao(Graphics2D gc) {
        abrirArquivo();
        mostrarAquivo(gc);
    }
    
    @Override
    public void segundaAcao(Graphics2D gc) {
       if (img != null && nomeArquivo != null) {
           gc.setColor(java.awt.Color.BLACK);
           gc.drawString(nomeArquivo, 0, 10);
           
           // Rotacionar a imagem 40 graus
           AffineTransform transform = new AffineTransform();
           transform.translate(175, 150); // Centro da área de desenho
           transform.rotate(Math.toRadians(40));
           transform.translate(-175, -150); // Voltar para o centro
           
           Graphics2D g2d = (Graphics2D) gc.create();
           g2d.setTransform(transform);
           g2d.drawImage(img, 0, 50, 350, 200, null);
           g2d.dispose();
       }
    }
    
    private void abrirArquivo(){
        pegaArquivo.setDialogTitle("Escolha Imagem");
        pegaArquivo.setFileFilter(new FileNameExtensionFilter("All Images", "jpg", "jpeg", "gif", "bmp", "png"));
        pegaArquivo.addChoosableFileFilter(new FileNameExtensionFilter("JPG", "jpg", "jpeg"));
        pegaArquivo.addChoosableFileFilter(new FileNameExtensionFilter("GIF", "gif"));
        pegaArquivo.addChoosableFileFilter(new FileNameExtensionFilter("BMP", "bmp"));
        pegaArquivo.addChoosableFileFilter(new FileNameExtensionFilter("PNG", "png"));
        
        int resultado = pegaArquivo.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            arquivo = pegaArquivo.getSelectedFile();
            nomeArquivo = arquivo.getName();
        }
    }
    
    private void mostrarAquivo(Graphics2D gc){
        if(arquivo != null){
            try {
                img = ImageIO.read(arquivo);
                gc.drawImage(img, 0, 50, 350, 200, null);
                gc.drawString(nomeArquivo, 0, 10);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, 
                    ex.toString(), 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public BufferedImage getImage() {
        return img;
    }
    
    public String getNomeArquivo() {
        return nomeArquivo;
    }
    
}
