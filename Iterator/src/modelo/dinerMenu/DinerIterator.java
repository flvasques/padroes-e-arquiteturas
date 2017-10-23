
package modelo.dinerMenu;

import java.util.Iterator;


public class DinerIterator implements Iterator {
    DinerMenu lista;
    int atual = 0;
    public DinerIterator(DinerMenu l){
        this.lista = l;
    }
    
    @Override
    public boolean hasNext() {
        return this.atual < this.lista.getMenuItens().length;
    }

    @Override
    public Object next() {
        return this.lista.getMenuItens()[atual++];
    }
    
}
