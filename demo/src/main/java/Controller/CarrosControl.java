package Controller;

import java.util.List;

import javax.swing.JOptionPane;
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
        if (validarEntradas(ano, placa, valor)) {
            new CarrosDAO().cadastrar(modelo, marca, ano, valor, placa);
            // Chama o método de cadastro no banco de dados
            atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
        } else {
            // Exibe uma mensagem de erro para o usuário
            JOptionPane.showMessageDialog(null, "Entradas inválidas. Por favor, verifique se foi colocado Modelo, Marca , Ano(xxxx), Placa(xxx-xxxx) e valor (R$0,00).",
                    "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validarEntradas(String ano, String placa, String valor) {
        placa = placa.trim();
        // Verifica se o ano contém apenas números e tem comprimento 4
        if (!ano.matches("\\d{4}") && !placa.matches("[A-Z]{3}-\\d{4}") && !valor.matches("[0-9]+")) {
            return false;
        }
        // Se passar por ambas as verificações, consideramos as entradas válidas
        return true;
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
