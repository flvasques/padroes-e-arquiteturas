
package modelo;

public class Body extends Componente {
       
    public Body(Html htl, String a){
        super();
        super.pagina = htl;
        super.attr = a;
    }
    public String getAtributos(){
        return attr != null ? " " + attr : "";
    }
    
    @Override
    public String preview(){
        return super.preview() + "\t<body"+ getAtributos() +">\n";
    }
}
