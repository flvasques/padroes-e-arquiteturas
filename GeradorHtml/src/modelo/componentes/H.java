
package modelo.componentes;

import modelo.Componente;
import modelo.enumeradores.HTipo;

public class H extends Componente {
    private HTipo tipo;
    private String texto = "&nbsp", outros;

    private H(){}
    public H (HTipo tipo) {
        this.tipo = tipo;
    }
    public HTipo getTipo() {
        return tipo;
    }

    public void setTipo(HTipo tipo) {
        this.tipo = tipo;
    }

    public String getInnerTexto() {
        return texto != null ? texto : "";
    }

    public void setInnerTexto(String texto) {
        this.texto = texto;
    }

    public String getOutros() {
        return outros != null ? outros : "";
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    @Override
    public String getTexto() {
        return"<" + this.tipo + " "+ getOutros() +">" + getInnerTexto() + "</" + this.tipo + ">";
    }
}
