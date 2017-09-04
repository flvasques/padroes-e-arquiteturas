
package modelo;

public class Body extends Componente {
    private String atributos;

    public String getAtributos() {
        return atributos != null ? atributos : "";
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }
    
    
    
    @Override
    public String getTexto() {
        String ret = "<body " + getAtributos() + " >\n";
        ret += "</body>";
                
        return ret;
    }
}
