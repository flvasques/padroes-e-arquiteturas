
package modelo;

import modelo.Interfaces.Arma;


public abstract class Personagem {
    protected String nome;
    protected Arma equipado;
    protected int ataque;
    protected int defesa;
    protected int vida;
    protected boolean vivo = true;
    protected String msgDerrota = null;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Arma getEquipado() {
        return this.equipado;
    }

    public void setEquipado(Arma equipado) {
        this.equipado = equipado.equipar();
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
       return this.vida; 
    }

    public void setVida(int vida) {
        this.vida += vida;
    }

    public int atacar() {
        System.out.print(this.nome + " Atacando com...");
        return this.ataque + this.equipado.atacar();
    }
    
    protected String calcularDanoRecebido(int ataque) {
        int dano = ataque - this.defesa;
        this.vida -= (dano > 0 ) ? dano : 0;
        return "Ataque: " + ataque + ", minha defesa: " + this.defesa + " dano sofrido: " + dano + "\n";  
    }
    
    public String receberAtaque(int ataque) {
        String ret = this.calcularDanoRecebido(ataque);
        if(this.vida <= 0){
            this.vivo = false;
            ret += this.msgDerrota;
        }
        System.out.printf(ret);
        return ret;
    }
    
    public boolean vivo() {
        return this.vivo;
    }
    
}