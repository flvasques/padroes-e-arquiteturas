
package modelo;

import modelo.carro.Carro;
import modelo.moto.Moto;

public class AdapterMoto implements Carro{

    Moto moto;
    
    public AdapterMoto(Moto m){
        this.moto = m;
    }
    
    @Override
    public void quatroRodas() {
        this.moto.duasRodas();
    }

    @Override
    public void Volante() {
        this.moto.guidao();
    }
    
}
