
package modelo.componentes;

import modelo.Componente;
import modelo.Html;
import modelo.enumeradores.HTipo;

public class H extends Componente {
    private HTipo tipo;
    
    public H(Html htl, String texto,HTipo h, boolean u){
        super();
        super.pagina = htl;
        super.attr = texto;
        super.ultimo = u;
        this.tipo = h;
    }

    public HTipo getTipo() {
        return tipo;
    }

    public void setTipo(HTipo tipo) {
        this.tipo = tipo;
    }
    
    public String getTexto() {
        return attr != null ? attr : "";
    }

    public void setTexto(String attr) {
        this.attr = attr;
    }
     @Override
    public String preview(){
        return super.preview() + "\t\t<"+ getTipo() + " " + super.getArgs()
                + ">" + getTexto() + "</"+ getTipo() +">\n" + (super.ultimo ? "\t</body>\n" : "");
    }
}
