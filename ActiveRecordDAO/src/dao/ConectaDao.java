package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public abstract class ConectaDao {

    private final String host = "localhost",
        user =  "postgres",
        password = "",
        database = "agenda",
        port = "5432";  

   protected Connection conectar() {
       String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.database;
        try {
            Connection con = DriverManager.getConnection(url, this.user, this.password);
            return con;
            
        } catch (SQLException e) {
            Log.salvaLog("Erro de Conexão: " + e.toString());
            JOptionPane.showMessageDialog(null, "Houve um erro, favor entre em contato com o suporte e informe: Cn01!", "Agenda", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

