
package negocio;

import java.util.ArrayList;
import persistencia.LoadInMock;

public class Garagem {
    private Veiculo[][] vagas;
    private ArrayList<FuncionarioProxy> funcionarios;
    private ArrayList<Veiculo> entrada = new ArrayList<>();
    private ArrayList<Veiculo> saida = new ArrayList<>();
    
    public Garagem(){
        vagas = new Veiculo[3][3];
        LoadInMock loader = new LoadInMock();
        funcionarios = loader.loadFuncionario();
        ArrayList<Veiculo> v = loader.loadVeiculos();
        saida.add(v.get(0));
        entrada.add(v.get(1));
        vagas[0][0] = v.get(2);
    }
    
    public void entrar(Veiculo v){
        entrada.add(v);
    }
    
    public void estacionar(Veiculo[][] matriz, Veiculo v){
        boolean ret = false;
        int i = 0;
        entrada.remove(v);
        while(!ret){
            ret = funcionarios.get(i).estacionar(matriz, v);
            i++;
        }
    }
    
    public void retirar(String placa){
        boolean ret = false;
        int i = 0;
        Veiculo v = null;
        for(int x = 0; x < vagas.length; x++){
            for(int y = 0; y < vagas[x].length; y++){
                if(vagas[x][y] != null){
                    if(placa.compareToIgnoreCase(placa) == 0){
                        v = vagas[x][y];
                        break;
                    }
                }
            }
        }
        while(!ret){
            ret = funcionarios.get(i).estacionar(vagas, v);
            i++;
        }
    }
    
    public Veiculo sair(String placa){
        if(saida.get(0).getPlaca().compareToIgnoreCase(placa) == 0){
            Veiculo v = saida.get(0);
            saida.remove(0);
            return v;
        }
        return null;
    }
    
}