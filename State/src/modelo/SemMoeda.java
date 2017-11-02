
package modelo;

public class SemMoeda implements MaquinaGomaEstado {
    private MaquinaGoma controlada;
    
    public SemMoeda(MaquinaGoma c){
        this.controlada = c;
    }
    @Override
    public MaquinaGomaEstado insereMoeda(int g) {
        if(g > 0){
            System.out.println("Aceitei a moeda");
            return new RecebeuMoeda(controlada);
        }else{
            return ejetaMoeda();
        }
           
    }

    @Override
    public MaquinaGomaEstado ejetaMoeda() {
        System.out.println("Estou sem goma devolvondo moeda");
        return this;
    }

    @Override
    public MaquinaGomaEstado acionaAlavanca(int g) {
        System.out.println("Estou sem moeda alavanca travda");
        return this;
    }

    @Override
    public MaquinaGomaEstado entregaGoma(int g) {
        System.out.println("Estou sem moeda não entrego nada");
        return this;
    }
    
}
