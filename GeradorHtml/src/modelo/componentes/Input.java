
package modelo.componentes;

import modelo.Componente;
import modelo.enumeradores.InputTipo;

public class Input extends Componente {
   private InputTipo type;
   private String value, name, id, outros;
   
   private Input(){}
   public Input(InputTipo type, String name){
       this.type = type;
       this.name = name;
       this.id = name + "_id";
   }

    public String getValue() {
        return value != null ? value : "";
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

    public String getOutros() {
        return outros != null ? outros : "";
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public InputTipo getType() {
        return type;
    }

    @Override
    public String getTexto() {
        return "<input type=\""+ this.type +"\" " + getOutros()+ " name=\""+ getName() 
                + "\" id=\""+ getId() +"\" value=\""+ getValue() + "\" />";
    } 
}
