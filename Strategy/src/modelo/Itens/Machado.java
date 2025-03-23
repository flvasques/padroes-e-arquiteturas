
package modelo.Itens;

import modelo.Interfaces.Arma;
import modelo.Interfaces.CurtoAlcance;
import modelo.Item;

public class Machado extends Item implements Arma, CurtoAlcance {
    private int dano;
    private int defesa;
    
    public Machado() {
        super.id = 2;
        super.nome = "Macahdo de guerra";
        super.qualidade = 10;
        this.dano  = 25;
        this.defesa = 10;
    }

    @Override
    public Arma equipar() {
        return this;
    }

    @Override
    public int atacar() {
        System.out.println("Machadada! Quelerct!");
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
