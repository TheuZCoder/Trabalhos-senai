package Controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Carros;

public class CarrosControl {
    // Atributos
    private List<Carros> carros;
    private DefaultTableModel tableModel;
    private JTable table;

    // Construtor
    public CarrosControl(List<Carros> carros, DefaultTableModel tableModel, JTable table)
    {

        this.carros = carros;
        this.tableModel = tableModel;
        this.table = table;
    }
    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        carros = new CarrosDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Carros carro : carros) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { carro.getModelo(), carro.getMarca(),

                    carro.getAno(), carro.getValor(), carro.getPlaca() });
        }
    }

    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String modelo, String marca, String ano, String valor, String placa) {
        new CarrosDAO().cadastrar(modelo, marca, ano, valor, placa);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String modelo, String marca, String ano, String valor, String placa) {
        new CarrosDAO().atualizar(modelo, marca, ano, valor, placa);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String placa) {
        new CarrosDAO().apagar(placa);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}
