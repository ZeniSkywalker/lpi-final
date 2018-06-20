/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiza
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection conectar() throws SQLException {
        String servidor = "localhost";
        String porta = "3306";
        String database = "projeto";
        String usuario = "root";
        String senha = "root";
        return DriverManager
                .getConnection("jdbc:mysql://" + servidor + ":" + porta + "/" + database + "?user=" + usuario + "&password=" + senha);
    }
}
