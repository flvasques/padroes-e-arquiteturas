
package negocio.Itens;

import negocio.Interfaces.*;
import negocio.Item;

public class Arco extends Item implements Arma{
   private int alcance;
   private int modifacador;
   
    public Arco(){
        super.id = 1;
        super.nome = "Arco Longo";
        super.qualidade = 10;
        this.alcance  = 100;
        this.modifacador = 30;
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
          return ""+super.qualidade; 
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
        System.out.println("Tiro de arco! Tcho");
        return this.modifacador;
    }

    @Override
    public int getId() {
        return super.id;
    }

    @Override
    public void setId(int id) {
        super.id = id;
    }
}
