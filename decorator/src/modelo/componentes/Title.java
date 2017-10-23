
package modelo.componentes;

import modelo.Componente;
import modelo.Html;

public class Title extends Componente {

    public Title(Html htl, String titulo, boolean u){
        super();
        super.pagina = htl;
        super.attr = titulo;
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
        return super.preview() + "\t\t<title>" + super.attr +"</title>\n" + (super.ultimo ? "\t</head>\n" : "");
    }

}
