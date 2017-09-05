
package modelo;


public class Head extends Componente {
    
    public Head(Html htl){
        super();
        super.pagina = htl;
    }
    
    @Override
    public String preview(){
        return super.preview() + "\t<head>\n";
    }
}
