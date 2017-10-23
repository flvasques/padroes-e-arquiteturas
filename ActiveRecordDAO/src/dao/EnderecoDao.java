
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Endereco;

public class EnderecoDao extends ConectaDao {
    public int inserir (Endereco entidade) throws SQLException{
       Connection con = super.conectar();
        String sql = "insert into endereco (numero, bairro, logradouro, complemento, cliente_id) values(?, ?, ?, ?, ?) returning id";
        try {
            PreparedStatement cmd = con.prepareStatement(sql);
            cmd.setString(1, entidade.getNumero());
            cmd.setString(2, entidade.getBairro());
            cmd.setString(3, entidade.getLogradouro());
            cmd.setString(4, entidade.getComplemento());
            cmd.setInt(5, entidade.getClienteId());
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
    
    public Endereco carregar(int id) throws SQLException{
        Connection con = super.conectar();
        String sql = "select * from endereco where id = ?";
        try {
            PreparedStatement cmd = con.prepareStatement(sql);
            cmd.setInt(1, id);
            ResultSet rs = cmd.executeQuery();
            Endereco e = new Endereco();
            if(rs.next()){
               e.setId(rs.getInt("id"));
               e.setNumero(rs.getString("numero"));
               e.setBairro(rs.getString("bairro"));
               e.setLogradouro(rs.getString("logradouro"));
               e.setComplemento(rs.getString("complemento"));
            }
            con.close();
            return e;
            
        } catch (SQLException ex) {
           Log.salvaLog("Erro pesquisar item: " + ex.toString());
           JOptionPane.showInternalMessageDialog(null, "Houve um erro, favor entre em contato com o suorte e informe: Cn03");
            con.close();
            return null;
        }
    }
    
    public ArrayList<Endereco> listar(int id) throws SQLException{
        Connection con = super.conectar();
        if(con != null){
            String sql = "select * from endereco where cliente_id = ?";
            try {
                PreparedStatement cmd = con.prepareStatement(sql);
                cmd.setInt(1, id);
                ResultSet rs = cmd.executeQuery();

                ArrayList<Endereco> lista = new ArrayList<>();

                while (rs.next()) {
                    Endereco e = new Endereco();
                    e.setId(rs.getInt("id"));
                    e.setNumero(rs.getString("numero"));
                    e.setBairro(rs.getString("bairro"));
                    e.setLogradouro(rs.getString("logradouro"));
                    e.setComplemento(rs.getString("complemento"));
                    lista.add(e);
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
    
    public boolean alterar (Endereco entidade) throws SQLException{
        Connection con = super.conectar();
        String sql = "update endereco set numero = ?," + 
                "bairro = ?, logradouro = ?, complemento = ? where id = ?";
        try {
            PreparedStatement cmd = con.prepareStatement(sql);
            cmd.setString(1, entidade.getNumero());
            cmd.setString(2, entidade.getBairro());
            cmd.setString(3, entidade.getLogradouro());
            cmd.setString(4, entidade.getComplemento());
            cmd.setInt(5, entidade.getId());
            
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
    
    public boolean excluir (int id) throws SQLException{
        Connection con = super.conectar();
        String sql = "delete from endereco where id = ?";
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
