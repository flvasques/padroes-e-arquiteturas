
package negocio;

import negocio.Interfaces.Arma;

public abstract class Item  implements Arma{
    protected int id;
    protected String nome;
    protected int qualidade;
    
    public abstract int getId();
    public abstract void setId(int id);
    public abstract String getNome();
    public abstract void setNome(String nome);
    public abstract String getQualidae();
    public abstract void setQualidade(int q);
    
}
