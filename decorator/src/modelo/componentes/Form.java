
package modelo.componentes;

import modelo.Componente;
import modelo.Html;

public class Form extends Componente {
    private String action;
    public Form(Html htl, String method, String action, boolean u){
        super();
        super.pagina = htl;
        super.attr = method;
        super.ultimo = u;
        this.action = action;
    }

    public String getAction() {
        return action != null? action : "";
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMethod() {
        return attr != null ? super.attr : "";
    }

    public void setMethod(String attr) {
        this.attr = attr;
    }
    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
    }
    @Override
    public String preview(){
        return super.preview() + "\t\t<form method=\"" + getMethod() + "\" action=\"" + getAction() + "\""
                + super.getArgs() + ">\n" + (super.ultimo ? "\t\t</form>\n" : "");
    }
}
