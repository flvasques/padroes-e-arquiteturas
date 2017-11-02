
package modelo.dna;

public interface DNA {

    String getForma();

    void setForma(String forma);

    int getMovimento();

    void setMovimento(int movimento);

    int getTamanho();

    public void setTamanho(int tamanho);

    double getEnergia();

    void setEnergia(double energia);
    
    DNA clonar();
}
