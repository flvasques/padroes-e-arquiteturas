
package modelo.dinerMenu;

import java.util.Iterator;
import javafx.scene.control.Alert;
import modelo.MenuItem;

public class DinerMenu {
    private static final int MAX_ITENS = 6;
    private int numberOfItens = 0;
    private MenuItem[] menuItens;
    
    public DinerMenu(){
        this.menuItens = new MenuItem[MAX_ITENS];
        addItem("Vegetarian BLT",
                "('Fakin') Bacon with lettude & tomato whole wheat", 2.99, true);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", 2.99, false);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad ", 3.29, false);
        addItem("Hotd dog",
                "A hot dog, with saurkraut, relish, onion, topped wiht cheese", 3.05, false);
    }
    
     public void addItem(String name, String description, double price, boolean vegetarian){
        if(numberOfItens < MAX_ITENS) {
            this.menuItens[numberOfItens] = new MenuItem(name, description, price, vegetarian);
            numberOfItens++;
        }else{
            Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
            dialogoErro.setTitle("Desculpe");
            dialogoErro.setHeaderText("Não é possivel inserir novo item, seu menu esta cheio");
            dialogoErro.showAndWait();
        }
    }
    
    public MenuItem[] getMenuItens(){
        return this.menuItens;
    }
     public Iterator createInterator(){
        return new DinerIterator(this);
    }
}
