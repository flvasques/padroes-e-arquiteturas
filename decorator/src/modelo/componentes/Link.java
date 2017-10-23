
package modelo.componentes;

import modelo.Componente;
import modelo.Html;

public class Link extends Componente {
    private String rel = "", type;
    
    public Link(Html htl, String a, String rel, boolean u){
        super();
        super.pagina = htl;
        super.attr = a;
        this.rel = rel;
        super.ultimo = u;
    }

    public String getType() {
        return type != null ? type : "";
    }

    public void setType(String type) {
        this.type = type;
    }
        
    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
    }
    @Override
    public String preview(){
        return super.preview() + "\t\t<link href=\"" + super.attr + "\" "
                + getType() + " " + super.getArgs()+ "/>" + "\n"
                + (super.ultimo ? "\t</head>\n" : "");
    }
}
