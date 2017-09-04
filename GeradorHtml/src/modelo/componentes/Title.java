
package modelo.componentes;

import modelo.Componente;

public class Title extends Componente {
    String texto;

    public String getInnerTexto() {
        return texto != null ? texto : "";
    }

    public void setInnerTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String getTexto() {
        return "<title>" + getInnerTexto() + "</title>";
    }
}
