
package negocio.Itens;

import negocio.Interfaces.Municao;
import negocio.Item;

public class Flecha extends Item implements Municao {

    private int modificador;
    
    
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
        return "classe: "+super.qualidade;
    }

    @Override
    public void setQualidade(int q) {
        super.qualidade = q;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int getModificador() {
        return modificador;
    }
    @Override
    public void setModificador(int modificador) {
        this.modificador = modificador;
    }

    @Override
    public Item equipar() {
        return this;
    }

    @Override
    public Municao carregar() {
        return this;
    }
    
}
