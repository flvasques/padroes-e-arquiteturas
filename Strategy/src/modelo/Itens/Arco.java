
package modelo.Itens;

import modelo.Interfaces.*;
import modelo.Item;

public class Arco extends Item implements Arma{
   private int alcance;
   private int modifacador;
   
    public Arco() {
        super.id = 1;
        super.nome = "Arco Longo";
        super.qualidade = 10;
        this.alcance  = 100;
        this.modifacador = 30;
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
}
