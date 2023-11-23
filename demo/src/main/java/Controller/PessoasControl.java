package Controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Pessoas;

public class PessoasControl {
    // Atributos
    private List<Pessoas> pessoas;
    private DefaultTableModel tableModel;
    private JTable table;

    // Construtor
    public PessoasControl(List<Pessoas> pessoas, DefaultTableModel tableModel, JTable table)
    {

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
        new PessoasDAO().cadastrarPessoa(nome, endereco, numtele, cpf);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
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
