
package modelo;


public abstract class Item{
    protected int id;
    protected String nome;
    protected int qualidade;
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQualidae() {
          return " " + this.qualidade; 
    }

    public void setQualidade(int q) {
        this.qualidade = q;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
