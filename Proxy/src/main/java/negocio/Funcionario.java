
package negocio;

import negocio.enumeradores.Cargo;
import negocio.enumeradores.*;

public class Funcionario {
    String nome;
    Cargo cargo;
     private ManobristaStatus status;

    public Funcionario(String nome, Cargo cargo,ManobristaStatus status) {
        this.nome = nome;
        this.cargo = cargo;
        this.status = status;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCago() {
        return cargo;
    }

    public void setCago(Cargo cargo) {
        this.cargo = cargo;
    }
    
   public void  estacionar(Veiculo[][] matriz, Veiculo v){
       for(int i = 0; i < matriz.length; i++){
           for(int j = 0; j < matriz[i].length; j++){
               if(matriz[i][j] == null){
                   matriz[i][j] = v;
                   v.setStatus(VeiculoStatus.Estacionado);
                   v.setVaga(i, j);
                   return;
               }
           }
       }
   }
   public void retirar(Veiculo[][] matriz, Veiculo v){
       int p[] = v.getVaga();
       matriz[p[0]][p[1]] = null;
       v.setStatus(VeiculoStatus.Saida);
   }
}
