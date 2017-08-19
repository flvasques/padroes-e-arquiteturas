
package negocio;

public abstract class Item {
    private String nome;
    private int qualidade;
    
    protected abstract Item equipar();
    protected abstract String getNome();
    protected abstract void setNome(String nome);
    protected abstract String getQualidae();
    protected abstract void setQualidade(int q);
    
}
