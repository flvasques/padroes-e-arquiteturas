
package modelo.componentes;

import modelo.Componente;
import modelo.Html;


public class A extends Componente {
    private String texto;
    
    public A(Html htl, String href, String texto, boolean u){
        super();
        super.pagina = htl;
        super.attr = href;
        this.texto = texto;
        super.ultimo = u;
    }

    public String getTexto() {
        return texto != null ? texto : "";
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getHref() {
        return attr;
    }

    public void setHref(String attr) {
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
        return super.preview() + "\t\t<a href=\"" + super.attr + "\" "+ getArgs()
                + ">" + getTexto() + "</a>\n" + (super.ultimo ? "\t</body>\n" : "");
    }
}
