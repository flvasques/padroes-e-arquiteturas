
package modelo.dna;

public class A implements DNA {

    private String forma;
    private int movimento;
    private int tamanho;
    private double energia;

    public A(){
        forma = "trinagulo";
        movimento = 5;
        tamanho = 5;
        energia = 100;
    }
    
    @Override
    public String getForma() {
        return this.forma;
    }

    @Override
    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public int getMovimento() {
        return this.movimento;
    }

    @Override
    public void setMovimento(int movimento) {
            this.movimento = movimento;
    }

    @Override
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public double getEnergia() {
        return this.energia;
    }

    @Override
    public void setEnergia(double energia) {
        this.energia = energia;
    }

    @Override
    public DNA clonar() {
        DNA proto = new A();
        proto.setEnergia(energia);
        proto.setForma(forma);
        proto.setMovimento(movimento);
        proto.setTamanho(tamanho);
        return proto;
    }
    
    
    
}
