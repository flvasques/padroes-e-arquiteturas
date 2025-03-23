
package modelo.Itens;

import modelo.Interfaces.Arma;
import modelo.Interfaces.CurtoAlcance;
import modelo.Item;

public class Espada extends Item implements Arma, CurtoAlcance {
    private int dano;
    private int defesa;
    
    public Espada() {
        super.id = 4;
        super.nome = "Espada Longa";
        super.qualidade = 10;
        this.dano  = 20;
        this.defesa = 20;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public Arma equipar() {
        return this;
    }

    @Override
    public int atacar() {
        System.out.println("Espadada! Squint");
        return this.dano;
    }
    
    @Override
    public int aparar() {
        return this.defesa;
    }
    
}
