
package negocio;

public class MaquinaPipoca {
    private boolean ligado = false;
    public void on(){
        this.ligado = (!this.ligado) ? true :  this.ligado;
    }
    
    public void off(){
        this.ligado = (this.ligado) ? false :  this.ligado;
    }
    
    public void pop(){
        if(ligado){
            System.out.println("Fazendo pipoca!");
        }
    }
    
}
