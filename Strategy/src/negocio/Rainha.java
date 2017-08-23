
package negocio;

import negocio.Interfaces.Arma;

public class Rainha extends Personagem {
    
    public Rainha(String nome){
        super.ataque = 9;
        super.defesa = 8;
        super.nome = nome;
        super.vida = 100;
    }
    
    @Override
    public String getNome() {
        return super.nome;
    }

    @Override
    public void setNome(String nome) {
        super.nome = nome;
    }

    @Override
    public Arma getEquipado() {
        return super.equipado;
    }

    @Override
    public void setEquipado(Arma equipado) {
        super.equipado = equipado.equipar();
    }

    @Override
    public int getAtaque() {
        return super.ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        super.ataque = ataque;
    }

    @Override
    public int getDefesa() {
        return super.defesa;
    }

    @Override
    public void setDefesa(int defesa) {
        super.defesa = defesa;
    }

    @Override
    public int getVida() {
       return super.vida; 
    }

    @Override
    public void setVida(int vida) {
        super.vida += vida;
    }

    @Override
    public int atacar() {
        System.out.print(super.nome+" Atacando com...");
        return super.ataque + super.equipado.atacar();
    }

    @Override
    public String receberAtaque(int ataque) {
        String ret = null;
        int dano = ataque - defesa;
        super.vida -= (dano > 0 ) ? dano : 0;
        ret = "Ataque: " + ataque + ", minha defesa: " + super.defesa + " dano sofriso: " + dano + "\n";
        if(super.vida <= 0){
            super.vivo = false;
            ret+="A Virtuosa Rainha " + super.nome + "caiu\n";
        }
        System.out.printf(ret);
        return ret;
    }
    
    @Override
    public boolean vivo() {
        return super.vivo;
    }
}
