
package negocio;

class DvdPlayer {
   private Amplificador amplifier;
   private boolean ligado = false;
   private boolean hasDisco = false;
   private char status = 's'; 
   private String disco = null;
   private char somTipo = 's';
    
    public void on(){
        this.ligado = (!this.ligado) ? true :  this.ligado;
    }
    
    public void off(){
        this.ligado = (this.ligado) ? false :  this.ligado;
    }
    
    public void setDisco(String d){
        this.disco = d;
    }
    public String eject(){
        if(this.ligado){
            String d = this.disco;
            this.disco = null;
            this.status = 's';
            return d;
        }
        return null;
    }
    
    public void pause(){
        if(this.status == 'r' && this.ligado){
            System.out.println("Disco em pausa!");
            this.status = 'p';
        }
    }
    
    public void play(){
        if(this.status == 's' && this.ligado){
            this.status = 'r';
            System.out.println("Continuado repodução CD: " + this.disco);
        }else if(this.status == 'p' && this.ligado){
            this.status = 'r';
            System.out.println("Iniciando Perpodução do CD: " + this.disco);
        }
    }
    
    public void stop(){
         if(this.status == 's' || this.status == 'r' && (this.ligado)){
            this.status = 'p';
            System.out.println("Repordução interrompida");
        }
    }
    
    public void setSteroSound(){
        if(this.ligado){
            this.somTipo = 's';
            System.out.println("Stero Sound");
        }
    }
    
    public void setSourondSound(){
        if(this.ligado){
            this.somTipo = 'u';
            System.out.println("Sourond Sound");
        }
    }
}
