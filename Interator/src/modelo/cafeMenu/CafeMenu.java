
package modelo.cafeMenu;

import java.util.HashMap;
import modelo.MenuItem;
import java.util.Iterator;

public class CafeMenu {
    HashMap menuItens = new HashMap();
    
    public CafeMenu(){
        addItem("Veggie Burger and Air Fries",
                "Veggie burgie on a whole wheat bun, Zelluce, tomato, and fies", 3.99, true);
        addItem("Soup of the day",
                "A cup of soup of the day, with a side said", 3.69, false);
        addItem("Burrito", "A large burrito, with whole pinte beans, salsa, guacample", 4.29, true);
    }
    
    public void addItem(String name, String description, double price, boolean vegetarian){
        this.menuItens.put(name, new MenuItem(name, description, price, vegetarian));
    }
    
    public HashMap getMenuItens(){
        return this.menuItens;
    }
    
    public Iterator createInterator(){
        return this.menuItens.values().iterator();
    }
}