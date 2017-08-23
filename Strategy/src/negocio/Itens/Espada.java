
package negocio.Itens;

import negocio.Interfaces.Arma;
import negocio.Interfaces.CurtoAlcance;
import negocio.Item;

public class Espada extends Item implements Arma, CurtoAlcance {
    private int dano;
    private int defesa;
    
    public Espada(){
        super.id = 4;
        super.nome = "Espada Longa";
        super.qualidade = 10;
        this.dano  = 20;
        this.defesa = 20;
    }
    
    @Override
    public int getId() {
        return super.id;
    }

    @Override
    public void setId(int id) {
        super.id = id;
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
    public String getQualidae() {
        return "classe" + super.qualidade;
    }
    @Override
    public void setQualidade(int q) {
        super.qualidade = q;
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
