
package negocio;

public class Projetor {
    private DvdPlayer dvdplayer;
    private boolean ligado;
    
    public void on(){
        this.ligado = (!this.ligado) ? true :  this.ligado;
    }
    
    public void off(){
        this.ligado = (this.ligado) ? false :  this.ligado;
    }
    
    public void tvModel(){
        if(this.ligado) System.out.println("Modo TV");
    }
    
    public void wideSecreenModel(){
        if(this.ligado) System.out.println("Modo Wide Secreen");
    }

    public DvdPlayer getDvdplayer() {
        return  (this.ligado)? dvdplayer : null;
    }

    public void setDvdplayer(DvdPlayer dvdplayer) {
         if(this.ligado)this.dvdplayer = dvdplayer;
    }
    
}
