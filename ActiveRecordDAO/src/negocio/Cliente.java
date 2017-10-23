package negocio;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.ArrayList;


public class Cliente {

   
    private int id;
    private String nome;
    private ArrayList<Endereco> endereco = null;
    
    public Cliente(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList getEndereco() {
        return this.endereco;
    }

    public void setEndereco(ArrayList endereco) {
        this.endereco = endereco;
        for (int i = 0; i < this.endereco.size(); i++){
                this.endereco.get(i).setDono(this);
        }
    }
    
    public void setEndereco(Endereco item){
        if(this.endereco !=  null){
            item.setDono(this);
             this.endereco.add(item);
        }else {
            this.endereco = new ArrayList<>();
            item.setDono(this);
            this.endereco.add(item);
            
        }
       
    }

    @Override
    public String toString() {
        return this.id + ": " + this.nome;
    }
    
    public void salva() throws SQLException{
        this.id = new ClienteDao().inserir(this);
    }
    
    public boolean atualizar() throws SQLException{
        return new ClienteDao().alterar(this);
    }
    public boolean excluir() throws SQLException{
        return new ClienteDao().excluir(this.id);
    }
    
    public static ArrayList<Cliente> listar() throws SQLException{
        return new ClienteDao().listar();
    }
    
    public static Cliente carregar(int id) throws SQLException{
        return new ClienteDao().carregar(id);
    }
     public static Cliente carregar(String nome) throws SQLException {
        return new ClienteDao().carregar(nome);
    }
}
