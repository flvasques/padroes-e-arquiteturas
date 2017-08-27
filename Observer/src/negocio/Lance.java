
package negocio;

public class Lance {
    private double valor;
    private Participante dono;
    
    private Lance(){}
    
    public Lance(double valor){
        this.valor = valor;
    }
    
    public Lance(double valor, Participante dono){
        this.valor = valor;
        this.dono = dono;
    }

    public double getValor() {
        return valor;
    }
    public Participante getDono() {
        return dono;
    }
    
}
