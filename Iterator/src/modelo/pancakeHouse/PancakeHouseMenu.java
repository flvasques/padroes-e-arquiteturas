
package modelo.pancakeHouse;

import modelo.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItens;
    
    public PancakeHouseMenu() {
        this.menuItens = new ArrayList();
        addItem("K&B's Pancake BreaKfast", 
                "Pancakes with scrambled eggs, and toast", 2.99,false);
        addItem("Regular Pancake BreaKfast", 
                "Pancakes with fried eggs, sauge", 2.99,false);
        addItem("Waffles", 
                "Waffles with your choice of bluebrreis or strawberries", 3.59,true);
        addItem("K&B's Pancake BreaKfast", 
                "Pancakes with scrambled eggs, and toast", 2.99,true);
    }
    
    public void addItem(String name, String description, double price, boolean vegetarian){
        this.menuItens.add(new MenuItem(name, description, price, vegetarian));
    }
    
    public ArrayList getMenuItens(){
        return this.menuItens;
    }
    
    public Iterator createInterator(){
        return this.menuItens.iterator();
    }
    
}
