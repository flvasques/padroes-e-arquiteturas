
package negocio;

class Sintonizador {
    private Amplificador amplifier;
    private double estacao = 100;
    private boolean ligado;
    private String tipo;
    
    public void on(){
        this.ligado = (!this.ligado) ? true :  this.ligado;
    }
    
    public void off(){
        this.ligado = (this.ligado) ? false :  this.ligado;
    }
    
    public void setAm(){
        if(this.ligado) this.tipo = "AM"; 
    }
    
    public void setFm(){
         if(this.ligado) this.tipo = "FM";
    }
    
    public void setFrequency(double f){
        if(this.ligado) {
            this.estacao = f;
            System.out.println("Estou na frequencia" + this.estacao + this.tipo);
        }
    }
}
