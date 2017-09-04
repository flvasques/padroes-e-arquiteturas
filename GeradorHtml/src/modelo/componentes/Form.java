
package modelo.componentes;

import java.util.ArrayList;
import modelo.Componente;

public class Form extends Componente {
    private String method, action, outros;
    private ArrayList<Componente> itens = new ArrayList<>();
 
    public Form(){
        
    }

    public String getMethod() {
        return method != null ? method : "";
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAction() {
        return action != null ? action : "";
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getOutros() {
        return outros != null ? outros : "";
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public ArrayList<Componente> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Componente> itens) {
        this.itens = itens;
    }

    @Override
    public String getTexto() {
        String ret = "<form method=\"" + getMethod() +"\" actio=\"" +getAction() +"\" >\n" ;
        for(int i = 0; i < this.itens.size(); ret += this.itens.get(i).getTexto() + "\n", i++);
        ret += "</form>\n";
        return ret;
    }
}
