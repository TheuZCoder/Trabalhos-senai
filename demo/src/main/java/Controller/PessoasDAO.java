package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Connection.ConnectionFactory;
import Model.Pessoas;

/**
 * PessoasDAO
 */
public class PessoasDAO {

    // atributo
    private Connection connection;
    private List<Pessoas> pessoas;

    // construtor
    public PessoasDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    //criar Tabela
    public void criaTabela() {

        String sql = "CREATE TABLE IF NOT EXISTS pessoas_lojacarros (NOME VARCHAR(255),ENDERECO VARCHAR(255),NUMTELE VARCHAR(255),CPF VARCHAR(255), PRIMARY KEY(CPF))";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Listar todos os valores cadastrados
    public List<Pessoas> listarTodos() {
        PreparedStatement stmt = null; // Declaração do objeto PreparedStatement para executar a consulta
        ResultSet rs = null; // Declaração do objeto ResultSet para armazenar os resultados da consulta
        pessoas = new ArrayList<>(); // Cria uma lista para armazenar os carros recuperados do banco de dados
    
        try {
            stmt = connection.prepareStatement("SELECT * FROM pessoas_lojacarros"); 
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery(); 
            // Executa a consulta e armazena os resultados no ResultSet
            
            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto Carros com os valores do registro
                Pessoas pessoa = new Pessoas(
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("numtele"),
                    rs.getString("cpf")
                );
                pessoas.add(pessoa); // Adiciona o objeto Carros à lista de carros
            }
        } catch (SQLException ex) {
            System.out.println(ex); // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return pessoas; // Retorna a lista de carros recuperados do banco de dados
    }

    //Cadastrar Carro no banco
    public void cadastrarPessoa(String nome, String endereco, String numtele, String cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO pessoas_lojacarros (nome, endereco, numtele, cpf) VALUES (?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, numtele);
            stmt.setString(4, cpf);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection,stmt);
        }
    }
    //Atualizar dados no banco
    public void atualizarPessoa(String nome, String endereco, String numtele, String cpf ) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para atualizar dados pela cpf
        String sql = "UPDATE pessoas_lojacarros SET nome = ?, endereco = ?, numtele = ?,WHERE cpf = ?,";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, numtele);
            //cpf é chave primaria não pode ser alterada.
            stmt.setString(4, cpf);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Apagar dados do banco
    public void apagar(String cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para apagar dados pela cpf
        String sql = "DELETE FROM pessoas_lojacarros WHERE cpf = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

}