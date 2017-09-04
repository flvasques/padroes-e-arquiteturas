
package modelo;

import persistencia.Escritor;

public abstract class Componente extends Html {
    
    public abstract String getTexto();
    
    @Override
    public void bild(){
       Escritor.bild(getTexto());
    }
}
