
package modelo.componentes;

import modelo.Componente;
import modelo.Html;

public class MetaTag extends Componente {
    private String content;  
    public MetaTag(Html htl, String a, boolean u){
        super();
        super.pagina = htl;
        super.attr = a;
        super.ultimo = u;
    }

    public String getContent() {
        return content != null ? "content=\"" + content + "\"" : "";
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
    }
    @Override
    public String preview(){
        return super.preview() + "\t\t<meta "+ super.attr + " " + getContent() +"/>\n"
                + (super.ultimo ? "\t</head>\n" : "");
    }
}
