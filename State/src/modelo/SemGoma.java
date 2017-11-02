
package modelo;

public class SemGoma implements MaquinaGomaEstado{

     private MaquinaGoma controlada;
    
    public SemGoma(MaquinaGoma c){
        this.controlada = c;
    }
    
    @Override
    public MaquinaGomaEstado insereMoeda(int g) {
        System.out.println("Estou sem goma engolia moeda");
           return this;
    }

    @Override
    public MaquinaGomaEstado ejetaMoeda() {
        System.out.println("Estou sem goma devolvondo moeda");
        return this;
    }

    @Override
    public MaquinaGomaEstado acionaAlavanca(int g) {
        System.out.println("Estou sem goma alavanca travda");
        return this;
    }

    @Override
    public MaquinaGomaEstado entregaGoma(int g) {
        System.out.println("Estou sem goma alavanca travda chame o gerente");
        return this;
    }
    
}
