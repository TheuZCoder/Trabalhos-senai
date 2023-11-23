package Controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Pessoas;

public class PessoasControl {
    // Atributos
    private List<Pessoas> pessoas;
    private DefaultTableModel tableModel;
    private JTable table;

    // Construtor
    public PessoasControl(List<Pessoas> pessoas, DefaultTableModel tableModel, JTable table) {

        this.pessoas = pessoas;
        this.tableModel = tableModel;
        this.table = table;
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        pessoas = new PessoasDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Pessoas pessoa : pessoas) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { pessoa.getNome(), pessoa.getEndereco(),
                    pessoa.getNumtele(), pessoa.getCpf() });
        }
    }

    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String nome, String endereco, String numtele, String cpf) {
        if (validarEntradas(numtele, cpf)) {
            new PessoasDAO().cadastrarPessoa(nome, endereco, numtele, cpf);
            // Chama o método de cadastro no banco de dados
            atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
        } else {
            // Exibe uma mensagem de erro para o usuário
            JOptionPane.showMessageDialog(null,
                    "Entradas inválidas. Por favor, verifique se foi colocado Modelo, Marca , Ano(xxxx), Placa(xxx-xxxx) e valor (R$0,00).",
                    "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validarEntradas(String numtele, String cpf) {
        numtele = numtele.trim();
        // Verifica se o ano contém apenas números e tem comprimento 4
        if (!cpf.matches("\\d{4}") && !numtele.matches("[A-Z]{3}-\\d{4}")) {
            return false;
        }
        // Se passar por ambas as verificações, consideramos as entradas válidas
        return true;
    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String nome, String endereco, String numtele, String cpf) {
        new PessoasDAO().atualizarPessoa(nome, endereco, numtele, cpf);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String cpf) {
        new PessoasDAO().apagar(cpf);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}
