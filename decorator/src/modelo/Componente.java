
package modelo;


public abstract class Componente extends Html {
    protected Html pagina;
    protected String outros;
    protected boolean ultimo;
    
    public String getArgs() {
        return outros != null ? outros : "";
    }

    public void setArgs(String outros) {
        this.outros = outros;
    }
    
    @Override
    public String preview(){
        return pagina.preview();
    }
  
}
