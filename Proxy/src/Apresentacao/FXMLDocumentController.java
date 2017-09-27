
package Apresentacao;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import negocio.*;
import negocio.enumeradores.VeiculoStatus;

public class FXMLDocumentController implements Initializable {
    Garagem garajao;
    
    @FXML Label lbltitulo, lblVeiculo, lblplaca, lblmodelo;
    @FXML TextField textoPlaca, textoModelo;
    @FXML Button cmdAdd;
    @FXML
    private void addVaiculo(ActionEvent event) {
       String p = textoPlaca.getText(), m = textoModelo.getText();
       Veiculo v = new Veiculo(p,m);
       v.setStatus(VeiculoStatus.Entrada);
       garajao.entrar(v);
        System.out.println(p);
        System.out.println(m);
    }

    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
       
    
}
