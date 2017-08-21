
package negocio.Itens;

import negocio.Interfaces.*;
import negocio.Item;

public class Arco extends Item implements Arma, LongoAlcance {
   private int alcance;
   private int modifacador;

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
    public Item equipar() {
        return this;
    }

    @Override
    public int disparar(Municao m) {
        return this.modifacador + m.getModificador();
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
