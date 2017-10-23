
package modelo.componentes;

import modelo.Componente;
import modelo.Html;
import modelo.enumeradores.InputTipo;

public class Input extends Componente {
   private InputTipo type;
   private String value, name, id;
   public Input(Html htl,InputTipo t, String nome, boolean u){
        super();
        super.pagina = htl;
        super.ultimo = u;
        this.type = t;
        this.name = nome;
        this.id = nome+"_id";
   }

    public InputTipo getType() {
        return type;
    }

    public void setType(InputTipo type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name != null ? name : "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id != null ? id : "";
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String preview(){
        return super.preview() + "\t\t\t<input type=\"" + getType() + "\" name=\"" + getName() + "\""
                + " id=\"" + getId() + "\" " + super.getArgs() + "/>\n" + (super.ultimo ? "\t\t</form>\n" : "");
    }
}
