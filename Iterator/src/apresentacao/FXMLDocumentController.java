
package apresentacao;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import modelo.Menu;
import modelo.MenuItem;


public class FXMLDocumentController implements Initializable {
    Menu cardapio = new Menu();
    @FXML
    ComboBox comboCategoria;
    @FXML
    ListView listaMenu;
    
    @FXML
    private void changeMenu(ActionEvent event) {
       int i = this.comboCategoria.getSelectionModel().getSelectedIndex(); 
       this.listaMenu.getItems().clear();
       ArrayList<String> lista= new ArrayList<>();
       MenuItem item;
       Iterator papa = null;       
       switch(i){
           case 0:
               Stack itens = cardapio.getAll();
               while(!itens.empty()){
                   item = (MenuItem)itens.pop();
                   lista.add(item.getName()+ "\n- " + item.getDescriptio() + "\n \t R$" + item.getPrice() + " " + (item.isVegetarian() ? "(Vegano)" : ""));
               }
               break;
           case 1:
               papa = cardapio.getCafe();
               break;
           case 2:
               papa = cardapio.getPancake();
               break;
           case 3:
               papa = cardapio.getDiner();
               break;
       }
       if(i > 0){
           while(papa.hasNext()){
                   item = (MenuItem)papa.next();
                   lista.add(item.getName()+ "\n- " + item.getDescriptio() + "\n \t R$" + item.getPrice() + " " + (item.isVegetarian() ? "(Vegano)" : ""));
               }
       }
       listaMenu.getItems().addAll(lista);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       comboCategoria.getItems().addAll(
            "Todos",
            "Café",
            "Pankecas",
            "Jantar"
        );
       
    }    
    
}
