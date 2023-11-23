package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Carros;
import Model.Vendas;

public class VendasControl {

    // Lista de vendas
    private List<Vendas> vendas;

    // Modelo de tabela padrão para a GUI
    private DefaultTableModel tableModel;

    // Tabela associada na GUI
    private JTable table;

    // Construtor da classe VendasControl
    public VendasControl(List<Vendas> vendas, DefaultTableModel tableModel, JTable table) {
        this.vendas = vendas;
        this.tableModel = tableModel;
        this.table = table;
    }

    // Método privado para atualizar a tabela na GUI com os dados da lista de vendas
    private void updateTable() {
        // Limpa todas as linhas existentes na tabela
        tableModel.setRowCount(0);

        // Obtém a lista atualizada de vendas do banco de dados
        vendas = new VendasDAO().listAll();

        // Adiciona cada venda na lista à tabela na GUI
        for (Vendas venda : vendas) {
            tableModel.addRow(
                new Object[] { venda.getData(), venda.getCliente(), venda.getValor(), venda.getTipoCarro() });
        }
    }

    // Método público para cadastrar uma nova venda
    public void cadastrar(String data, String cliente, String valor, String carro) {
        // Chama o método de cadastro na classe DAO para inserir a venda no banco de dados
        new VendasDAO().cadastrar(data, cliente, valor, carro);

        // Atualiza a tabela na GUI com os dados atualizados do banco de dados
        updateTable();
    }

    // Método público para atualizar informações de uma venda existente
    public void atualizar(String data, String cliente, String valor, String carro) {
        // Chama o método de atualização na classe DAO para modificar os dados no banco de dados
        new VendasDAO().update(data, cliente, valor, carro);

        // Atualiza a tabela na GUI com os dados atualizados do banco de dados
        updateTable();
    }

    // Método público para apagar uma venda existente
    public void apagar(String carro) {
        // Chama o método de exclusão na classe DAO para remover a venda do banco de dados
        new VendasDAO().delete(carro);

        // Atualiza a tabela na GUI com os dados atualizados do banco de dados
        updateTable();
    }
}