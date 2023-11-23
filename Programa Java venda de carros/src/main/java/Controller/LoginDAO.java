package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Connection.ConnectionFactory;

public class LoginDAO {
    //-----===| ATRIBUTOS |===-----//
    private Connection connection; // Conexão

    //-----===| CONSTRUTOR |===-----//
    public LoginDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    //-----===| MÉTODOS |===-----//
    public boolean consulta(String nome, String cpf) throws SQLException{
        ResultSet resultSet = null;

        String query = "SELECT * FROM pessoas_lojacarros WHERE nome = ? AND cpf = ?;";
        PreparedStatement preparedStatement = connection.prepareCall(query);
        try {
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, cpf);

            resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
            // Vai retornar False por "default" em caso de erro
            return false;
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }

    }
}