package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionFactory;
import Model.Vendas;

public class VendasDAO {

    // Conexão com o banco de dados
    private Connection connection;

    // Lista de vendas
    private List<Vendas> vendas;

    // Construtor que obtém uma conexão com o banco de dados
    public VendasDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // Método para criar a tabela no banco de dados se não existir
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS vendas_lojacarros (DATA VARCHAR(255),CLIENTE VARCHAR(255),VALOR VARCHAR(255),CARRO VARCHAR(255) PRIMARY KEY)";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro na criação da tabela
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            // Fecha a conexão
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Método para listar todas as vendas no banco de dados
    public List<Vendas> listAll() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        vendas = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM vendas_lojacarros");
            rs = stmt.executeQuery();

            // Preenche a lista de vendas com os dados do banco de dados
            while (rs.next()) {
                Vendas venda = new Vendas(
                    rs.getString("data"),
                    rs.getString("cliente"),
                    rs.getString("valor"),
                    rs.getString("carro"));
                vendas.add(venda);
            }
        } catch (SQLException ex) {
            // Exibe uma mensagem de erro em caso de exceção SQL
            System.out.println(ex);
        } finally {
            // Fecha a conexão e os recursos do banco de dados
            ConnectionFactory.closeConnection(connection, stmt, rs);
        }
        // Retorna a lista de vendas
        return vendas;
    }

    // Método para cadastrar uma nova venda no banco de dados
    public void cadastrar(String cliente, String data, String carro, String valor) {
        PreparedStatement stmt = null;

        String sql = "INSERT INTO vendas_lojacarros (cliente, data, carro, valor) VALUES (?, ?, ?, ?)";
        try {
            // Executa a inserção no banco de dados
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente);
            stmt.setString(2, data);
            stmt.setString(3, carro);
            stmt.setString(4, valor);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro na inserção
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            // Fecha a conexão
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Método para atualizar informações de uma venda existente no banco de dados
    public void update(String data, String cliente, String valor, String carro) {
        PreparedStatement stmt = null;

        String sql = "UPDATE vendas_lojacarros SET data = ?, cliente = ?, valor = ? WHERE carro = ?";
        try {
            // Executa a atualização no banco de dados
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, data);
            stmt.setString(2, cliente);
            stmt.setString(3, valor);
            stmt.setString(4, carro);
            stmt.executeUpdate();

            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro na atualização
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            // Fecha a conexão
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Método para apagar uma venda existente no banco de dados
    public void delete(String carro) {
        PreparedStatement stmt = null;

        String sql = "DELETE FROM vendas_lojacarros WHERE carro = ?";
        try {
            // Executa a exclusão no banco de dados
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, carro);
            stmt.executeUpdate();
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro na exclusão
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            // Fecha a conexão
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
}