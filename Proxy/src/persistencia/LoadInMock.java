
package persistencia;

import java.util.ArrayList;
import negocio.*;
import negocio.enumeradores.Cargo;
import negocio.enumeradores.VeiculoStatus;

public class LoadInMock {
    public ArrayList<FuncionarioProxy> loadFuncionario(){
        ArrayList<FuncionarioProxy> lista = new ArrayList<>();
        FuncionarioProxy f = new FuncionarioProxy("Joana", Cargo.ADM );
        lista.add(f);
        f = new FuncionarioProxy("Juliana", Cargo.ESTAGIARIO);
        lista.add(f);
        f = new FuncionarioProxy("Jeiza", Cargo.MANOBIRSTA);
        lista.add(f);
        return lista;
    }
    public ArrayList<Veiculo> loadVeiculos(){
        ArrayList<Veiculo> lista = new ArrayList<>();
        Veiculo v = new Veiculo("xyz - 0000", "gol");
        v.setStatus(VeiculoStatus.Saida);
        lista.add(v);
        v = new Veiculo("xyz - 0001", "clio");
        v.setStatus(VeiculoStatus.Entrada);
        lista.add(v);
        v = new Veiculo("xyz - 0002", "fusca");
        v.setStatus(VeiculoStatus.Estacionado);
        v.setVaga(0, 0);
        lista.add(v);
        return lista;
    }
    
}
