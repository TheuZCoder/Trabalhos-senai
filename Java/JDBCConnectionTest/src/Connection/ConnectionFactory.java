package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ConnectionFactory
 */
public class ConnectionFactory {
    //atributos
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";
    //metódos
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL,USUARIO,SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter conexão com o banco", e);
        }
    }
    public static void closeConnection(Connection connection){
        try {
            if (!connection.equals(null) ) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void closeConnection(Connection connection, PreparedStatement stmt){
        try {
            if (!connection.equals(null) && !stmt.equals(null) ) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}