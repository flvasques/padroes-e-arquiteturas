package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Cliente;

public class ClienteDao extends ConectaDao {

    public ClienteDao() {
    }
    
    public int inserir (Cliente entidade) throws SQLException{
        Connection con = super.conectar();
        String sql = "insert into cliente (nome) values(?) returning id";
        try {
            PreparedStatement cmd = con.prepareStatement(sql);
            cmd.setString(1, entidade.getNome());
            ResultSet rs = cmd.executeQuery();
            rs.next();
            int id = rs.getInt("id");
            con.close();
            return id;
        } catch (SQLException ex) {
            Log.salvaLog("Erro ao Salvar Registro: " + ex.toString());
            JOptionPane.showMessageDialog(null, "Houve um erro, favor entre em contato com o suporte e informe: Cn02!", "Agenda", JOptionPane.ERROR_MESSAGE); 
            con.close();
            return 0;
        }   
    }
    
    public Cliente carregar(int id) throws SQLException{
        Connection con = super.conectar();
        String sql = "select * from cliente where id = ?";
        try {
            PreparedStatement cmd = con.prepareStatement(sql);
            cmd.setInt(1, id);
            ResultSet rs = cmd.executeQuery();
            Cliente c = new Cliente();
            if(rs.next()){
               c.setId(rs.getInt("id"));
               c.setNome(rs.getString("nome")); 
            }
            con.close();
            return c;
            
        } catch (SQLException ex) {
           Log.salvaLog("Erro pesquisar item: " + ex.toString());
           JOptionPane.showInternalMessageDialog(null, "Houve um erro, favor entre em contato com o suorte e informe: Cn03");
            con.close();
            return null;
        }
    }
    
    public Cliente carregar(String nome) throws SQLException{
        Connection con = super.conectar();
        String sql = "select * from cliente where nome = ?";
        try {
            PreparedStatement cmd = con.prepareStatement(sql);
            cmd.setString(1, nome);
            ResultSet rs = cmd.executeQuery();
            Cliente c = new Cliente();
            if(rs.next()){
               c.setId(rs.getInt("id"));
               c.setNome(rs.getString("nome")); 
            }
            con.close();
            return c;
            
        } catch (SQLException ex) {
           Log.salvaLog("Erro pesquisar item: " + ex.toString());
           JOptionPane.showInternalMessageDialog(null, "Houve um erro, favor entre em contato com o suorte e informe: Cn03");
            con.close();
            return null;
        }
    }
    
    public ArrayList<Cliente> listar() throws SQLException{
        Connection con = super.conectar();
        if(con != null){
            String sql = "select * from cliente";
            try {
                PreparedStatement cmd = con.prepareStatement(sql);
                ResultSet rs = cmd.executeQuery();

                ArrayList<Cliente> lista = new ArrayList<>();

                while (rs.next()) {
                    Cliente c = new Cliente();
                    c.setId(rs.getInt("id"));
                    c.setNome(rs.getString("nome"));
                    lista.add(c);
                }
                con.close();
                return lista;
            } catch (SQLException ex) {
                Log.salvaLog("Erro ao Listar: " + ex.toString());
                JOptionPane.showMessageDialog(null, "Houve um erro, favor entre em contato com o suporte e informe: Cn04!", "Agenda", JOptionPane.ERROR_MESSAGE);
                con.close();
                return null;
            }
        }
        return null;
    }
    
    public boolean alterar(Cliente entidade) throws SQLException{
        Connection con = super.conectar();
        String sql = "update cliente set nome = ? where id = ?";
        try {
            PreparedStatement cmd = con.prepareStatement(sql);
            cmd.setString(1, entidade.getNome());
            cmd.setInt(2, entidade.getId());
            int rs = cmd.executeUpdate();
            con.close();
            return rs == 1;
        } catch (SQLException ex) {
            Log.salvaLog("Erro ao Listar: " + ex.toString());
            JOptionPane.showMessageDialog(null, "Houve um erro, favor entre em contato com o suporte e informe: Cn05!", "Agenda", JOptionPane.ERROR_MESSAGE);
            con.close();
            return false;
        }
    }
    
    public boolean excluir(int id) throws SQLException{
        Connection con = super.conectar();
        String sql = "delete from cliente where id = ?";
        try {
            PreparedStatement cmd = con.prepareStatement(sql);
            cmd.setInt(1, id);
            int rs = cmd.executeUpdate();
            con.close();
            return rs == 1;
        } catch (SQLException ex) {
            Log.salvaLog("Erro ao Listar: " + ex.toString());
            JOptionPane.showMessageDialog(null, "Houve um erro, favor entre em contato com o suporte e informe: Cn06!", "Agenda", JOptionPane.ERROR_MESSAGE);
            con.close();
            return false;
        }
    }
}
