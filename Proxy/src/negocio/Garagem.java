
package negocio;

import java.util.ArrayList;

public class Garagem {
    private Veiculo[][] vagas;
    private ArrayList<FuncionarioProxy> funcionarios;
    private ArrayList<Veiculo> entrada = new ArrayList<>();
    private ArrayList<Veiculo> saida = new ArrayList<>();
    
    public Garagem(){
        vagas = new Veiculo[3][3];
    }
    
    private void entrar(Veiculo v){
        entrada.add(v);
    }
    
    private void estacionar(Veiculo[][] matriz, Veiculo v){
        boolean ret = false;
        int i = 0;
        entrada.remove(v);
        while(!ret){
            ret = funcionarios.get(i).estacionar(matriz, v);
            i++;
        }
    }
    
    private void retirar(String placa){
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
    
    private Veiculo sair(String placa){
        if(saida.get(0).getPlaca().compareToIgnoreCase(placa) == 0){
            Veiculo v = saida.get(0);
            saida.remove(0);
            return v;
        }
        return null;
    }
    
}