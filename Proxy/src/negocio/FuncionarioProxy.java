
package negocio;

import negocio.enumeradores.*;

public class FuncionarioProxy {
    private String nome;
    private Cargo cargo;
    private ManobristaStatus status;

    public FuncionarioProxy(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
        if(this.cargo == Cargo.MANOBIRSTA) this.status = ManobristaStatus.LIVRE;
    }
    
    
    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public ManobristaStatus getStatus() {
        return this.cargo == Cargo.MANOBIRSTA ? status : null;
    }

    public void setStatus(ManobristaStatus status) {
        if(this.cargo == Cargo.MANOBIRSTA) this.status = status;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean estacionar(Veiculo[][] matriz, Veiculo v){
        if(this.cargo == Cargo.MANOBIRSTA){
            this.status = ManobristaStatus.OCUPADO;
            new Funcionario(this.nome, this.cargo, this.status).estacionar(matriz, v);
            this.status = ManobristaStatus.LIVRE;
            return true;
        }else {
            return false;
        }
    }
    
    public boolean retirar(Veiculo[][] matriz, Veiculo v){
        if(this.cargo == Cargo.MANOBIRSTA){
            this.status = ManobristaStatus.OCUPADO;
            new Funcionario(this.nome, this.cargo,this.status).retirar(matriz, v);
            this.status = ManobristaStatus.LIVRE;
            return true;
        }else{
            return false;
        }
    }
    
}
