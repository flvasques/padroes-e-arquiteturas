
package negocio;

public class LuzAmbiente {
    public int intencidade;
    private boolean ligado;
    
    public void on(){
        if(!this.ligado){
            this.ligado = true;
            this.intencidade = 100;
            System.out.println("Lingando luzes");
        }
    }
    
    public void off(){
        if(this.ligado){
            this.ligado = false;
            this.intencidade = 0;
            System.out.println("Desligando luzes");
        }
    }
    
    public void dim(int n){
        if(this.ligado){
            this.intencidade = n;
            System.out.println("Ajustando Luzes");
        }
    }
    
    
}
