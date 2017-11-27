
package negocio;

public class Tela {
    private boolean status = false;
    public void up(){
        if(status){
            status = false;
            System.out.println("Recolhendo tela");
        }
    }
    
    public void down(){
        if(!status){
            status = true;
            System.out.println("Baixando tela");
        }
    }
}
