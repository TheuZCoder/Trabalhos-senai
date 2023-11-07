package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConnectionDAO {
    private Connection connection;

    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS MINHA_TABELA (ID SERIAL PRIMARY KEY,NOME VARCHAR(255),EMAIL VARCHAR(255))";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void apagarTabela() {
        String sql = "DROP TABLE MINHA_TABELA";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabela apagada com sucesso.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao apagar tabela.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void inserir(String nome, String email) throws SQLException {
        String sql = "INSERT INTO MINHA_TABELA (NOME, EMAIL) VALUES (?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        try{
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection, stmt);
        }
    }
    //Apagar um dado da tabela
    public void apagarId(int id) throws SQLException{
        String sql = "DELETE FROM MINHA_TABELA WHERE ID = ?" ;
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch(Exception e){
            JOptionPane.showMessageDialog( null, "aaaaa");
        }         
    }
    //Atualizar um dado da tabela
    public void atualizarID(int id, String novoNome, String novoEmail){
        String sql = "UPDATE MINHA_TABELA SET nome = ? , email = ? WHERE ID = ?";//UPDATE nomeDaTabela SET 
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, novoNome);
            stmt.setString(2, novoEmail);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }
    //Listar todos os valores cadastrados
    public void listarTodos() { // Colocar na tabela
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM minha_tabela";

        try {
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {

                System.out.println("id : "+rs.getInt("id")+
                " nome: "+rs.getString("nome")+
                " email: "+rs.getString("email")); 
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }
}
