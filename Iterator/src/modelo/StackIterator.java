
package modelo;

import java.util.Iterator;
import java.util.Stack;

public class StackIterator implements Iterator {
    Stack<MenuItem> pilha;
    
    public StackIterator(Stack<MenuItem> p){
        this.pilha = p;
    }
    @Override
    public boolean hasNext() {
        return (!this.pilha.isEmpty());
    }

    @Override
    public Object next() {
        if(!this.pilha.isEmpty()) return this.pilha.pop(); 
        else return null;
    }
    
}
