package negocio;

import dao.EnderecoDao;
import java.sql.SQLException;
import java.util.ArrayList;

public class Endereco {
    private int id;
    private String numero;
    private String bairro;
    private String logradouro;
    private String complemento;
    private int clienteId;
    
    public Endereco (){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    
    public void salvar() throws SQLException{
        this.id = new EnderecoDao().inserir(this);
    }
    
    public boolean atualizar() throws SQLException {
        return new EnderecoDao().alterar(this);
    }
    
    public static Endereco carregar(int id) throws SQLException{
        return new EnderecoDao().carregar(id);
    }
    
    public static ArrayList<Endereco> listar(int id) throws SQLException{
        return new EnderecoDao().listar(id);
    }
    
    public boolean excluir() throws SQLException {
        return new EnderecoDao().excluir(this.id);
    }
}
