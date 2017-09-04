
package modelo.componentes;

import modelo.Componente;


public class A extends Componente {
    
    public String href = "", outros;
    
    public A(String h){
        this.href = h;
    }

    public String getHref() {
        return href != null ? href : "";
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getOutros() {
        return outros != outros ? outros : "";
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }
    
    @Override
    public String getTexto() {
        return "<a "+ this +"href=\"" + getHref() +"\">aqui vai um link</a>";
    }
}
