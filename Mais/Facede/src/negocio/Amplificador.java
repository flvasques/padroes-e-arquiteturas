
package negocio;

public class Amplificador {
    private Sintonizador tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private int volume = 7;
    private boolean ligado = false;

    public Amplificador() {
        this.dvdPlayer = new DvdPlayer();
        this.cdPlayer = new CdPlayer();
    }
    
    
    public void on(){
        this.ligado = (!this.ligado) ? true :  this.ligado;
    }
    
    public void off(){
        this.ligado = (this.ligado) ? false :  this.ligado;
    }
    
    public void setSteroSound(){
        if(this.ligado) this.dvdPlayer.setSteroSound();
    }
    
    public void setSourondSound(){
        if(this.ligado) this.dvdPlayer.setSourondSound();
    }
    
    public void setTunner(Sintonizador t){
        if(this.ligado) this.tuner = t;   
    }
    
    public void setVolume(int i){
        if(this.ligado) this.volume = i;
    }

    public Sintonizador getTuner() {
        return (this.ligado)? tuner : null;
    }

    public void setTuner(Sintonizador tuner) {
        if(this.ligado) this.tuner = tuner;
    }

    public DvdPlayer getDvdPlayer() {
        return (this.ligado)? dvdPlayer : null;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        if(this.ligado) this.dvdPlayer = dvdPlayer;
    }

    public CdPlayer getCdPlayer() {
        return (this.ligado)? cdPlayer : null;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        if(this.ligado) this.cdPlayer = cdPlayer;
    }
    
}
