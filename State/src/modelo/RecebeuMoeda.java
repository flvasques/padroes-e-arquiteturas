
package modelo;

public class RecebeuMoeda implements MaquinaGomaEstado {
    
    private MaquinaGoma controlada;
    
    public RecebeuMoeda(MaquinaGoma c){
        this.controlada = c;
    }
    
    @Override
    public MaquinaGomaEstado insereMoeda(int g) {
        System.out.println("tenho moeda engoli essa");
        return this;
    }

    @Override
    public MaquinaGomaEstado ejetaMoeda() {
        System.out.println("Devolvi a moeda");
        return new SemMoeda(controlada);
    }

    @Override
    public MaquinaGomaEstado acionaAlavanca(int g) {
        return entregaGoma(g);
    }

    @Override
    public MaquinaGomaEstado entregaGoma(int g) {
        controlada.setGoma();
        if(g > 0){
            System.out.println("Entregando Goma");
            return new SemMoeda(controlada);
        }else{
            System.out.println("Entregando a ultima Goma");
            return new SemGoma(controlada);
        }
    }
    
}
