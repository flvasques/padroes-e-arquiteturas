
package modelo.componentes;

import modelo.Componente;

public class Link extends Componente {
    private String href = "", rel = "", type;
    
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getTexto() {
        return "<link href=\"" + this.href + "\" "+ (this.type != null ? this.type : "") 
                + " rel=\""+ this.rel +"\" />";
    }   
}
