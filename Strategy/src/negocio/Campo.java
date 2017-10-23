
package negocio;

public class Campo {
    private Personagem defensor;
    private Personagem atacante;
    private boolean finalizado = false;
    private int round = 0;
    public Campo(Personagem atacante, Personagem defensor){
        this.atacante = atacante;
        this.defensor = defensor;        
    }
    
    public void novoRound(){
        String ret = "";
        if(!this.finalizado){
            this.round++;
            this.defensor.receberAtaque(this.atacante.atacar());
            if(!this.fim()){
                this.atacante.receberAtaque(this.defensor.atacar()); 
            }
        }
        this.fim();
    }
    
    private boolean fim(){
        if(!this.defensor.vivo()){
            this.finalizado = true;
            System.out.println("Fim de luta com " + this.round + " rounds!");
            return true;
        }
        if(!this.atacante.vivo()){
            this.finalizado = true;
            System.out.println("Fim de luta com " + this.round + " rounds!");
            return true;
        }
        return false;
    }
    public boolean getFim(){
        return this.finalizado;
    }
}
