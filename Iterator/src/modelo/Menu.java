
package modelo;

import java.util.Iterator;
import java.util.Stack;
import modelo.cafeMenu.*;
import modelo.dinerMenu.*;
import modelo.pancakeHouse.*;

public class Menu {
    private CafeMenu cafe = new CafeMenu();
    private DinerMenu diner = new DinerMenu();
    private PancakeHouseMenu pancake = new PancakeHouseMenu();
    
    public Iterator getCafe(){
        return cafe.createInterator();
    }
    
    public Iterator getDiner(){
        return cafe.createInterator();
    }
    
    public Iterator getPancake(){
        return pancake.createInterator();
    }
    
    public Stack getAll(){
       Stack<MenuItem> pilha = new Stack();
       Iterator colecao = getCafe();
       while(colecao.hasNext()){
           pilha.push((MenuItem)colecao.next());
       }
       colecao = getDiner();
       while(colecao.hasNext()){
           pilha.push((MenuItem)colecao.next());
       }
       colecao = getPancake();
       while(colecao.hasNext()){
           pilha.push((MenuItem)colecao.next());
       }
       return pilha;
    }
    
}
