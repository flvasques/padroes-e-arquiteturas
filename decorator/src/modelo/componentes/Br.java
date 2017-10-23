
package modelo.componentes;

import modelo.Componente;
import modelo.Html;

public class Br extends Componente {
    public Br(Html htl, boolean u){
        super();
        super.pagina = htl;
        super.ultimo = u;
    }

    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
    }
    
    @Override
    public String preview(){
        return super.preview() + "\t\t<br />\n" + (super.ultimo ? "\t</body>\n" : "");
    } 
}
