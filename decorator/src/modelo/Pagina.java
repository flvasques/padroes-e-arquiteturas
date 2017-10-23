
package modelo;


public class Pagina extends Html {
   
    public Pagina(String a){
       super();
       super.attr = a;
   }

    public String getAttr() {
        return attr != null ? " " + attr : "";
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }
    
    @Override
    public String preview() {
        String htm = "<!DOCTYPE html>\n<html" + getAttr() + ">\n";
        return htm;
    }
}
