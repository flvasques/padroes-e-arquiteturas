
package com.commad.commad;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import modelo.Animacao.Andando;
import modelo.Imagem.Mostrador;
import modelo.Joystick;
import modelo.desenhos.Desenhando;

public class FXMLDocumentController implements Initializable {
    
    GraphicsContext contexto;
    Joystick[] jogo = {new Desenhando(), new Andando(), new Mostrador()};
    int pos = 0;
    
    @FXML
    private Canvas tela;
    @FXML
    ComboBox jogos;
    
    @FXML
    private void clickA(ActionEvent event) {
        jogo[pos].prinmeiraAcao(contexto);
    }
    @FXML
    private void clickB(ActionEvent event) {
        jogo[pos].segundaAcao(contexto);
    }
    @FXML
    private void escolher(ActionEvent event) {
        contexto.clearRect(0, 0, tela.getWidth(), tela.getHeight());
        pos = jogos.getSelectionModel().getSelectedIndex(); 
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        contexto = tela.getGraphicsContext2D();
        jogos.getItems().addAll(
            "Desenhando",
            "Andando",
            "Mostrador"
        );
    }    
    
}
