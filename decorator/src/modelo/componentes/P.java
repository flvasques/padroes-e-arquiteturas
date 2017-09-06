
package modelo.componentes;

import modelo.Componente;
import modelo.Html;

public class P extends Componente{
    
    public P(Html htl, String texto, boolean u){
        super();
        super.pagina = htl;
        super.attr = texto;
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
        return super.preview() + "\t\t<body" + super.getArgs() + ">" + super.attr +"</body>\n" + (super.ultimo ? "\t</body>\n" : "");
    } 
}
