
package negocio;

import negocio.Interfaces.Arma;


public abstract class Personagem {
    protected String nome;
    protected Arma equipado;
    protected int ataque;
    protected int defesa;
    protected int vida;
    protected boolean vivo = true;
    
    public abstract String getNome();
    public abstract void setNome(String nome);
    public abstract Arma getEquipado();
    public abstract void setEquipado(Arma equipado);
    public abstract int getAtaque();
    public abstract void setAtaque(int ataque);
    public abstract int getDefesa();
    public abstract void setDefesa(int defesa);
    public abstract int getVida();
    public abstract void setVida(int vida);
    public abstract int atacar();
    public abstract String receberAtaque(int ataque);
    public abstract boolean vivo();
    
}