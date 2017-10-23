
package negocio;

import negocio.enumeradores.VeiculoStatus;

public class Veiculo {
    private String placa, modelo;
    private VeiculoStatus status;
    private int x,y;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        this.status = VeiculoStatus.Entrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public VeiculoStatus getStatus() {
        return status;
    }

    public void setStatus(VeiculoStatus status) {
        this.status = status;
    }
    
    public int[] getVaga(){
        int a[] = {x,y};
        return a;
    }
    public void setVaga(int x, int y){
         this.x = x;
         this.y = y;
     }
    
}
