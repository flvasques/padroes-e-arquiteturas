package modelo.Itens;

import modelo.Interfaces.Arma;
import modelo.Interfaces.CurtoAlcance;
import modelo.Item;

public class Faca extends Item implements Arma, CurtoAlcance {
    private int dano;
    private int defesa;
    
    public Faca() {
        super.id = 3;
        super.nome = "Faca oculta";
        super.qualidade = 10;
        this.dano  = 20;
        this.defesa = 5;
    }

    @Override
    public Arma equipar() {
        return this;
    }

    @Override
    public int atacar() {
        System.out.println("Facadaaa! Cuxim...");
        return this.dano;
    }

    @Override
    public int aparar() {
        return this.defesa;
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
}
