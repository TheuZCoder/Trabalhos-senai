package View;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.PessoasControl;
import Controller.PessoasDAO;
import java.awt.AWTException;
import java.awt.GridLayout;
import java.awt.Robot;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import Model.Pessoas;

public class JanelaPessoas extends JPanel {
    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField carNomeField, carEnderecoField, carNumteleField, carCpfField;
    private List<Pessoas> pessoas;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor(GUI-JPanel)
    public JanelaPessoas() {
        super();

        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Pessoas"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Nome"));
        carNomeField = new JTextField(20);
        inputPanel.add(carNomeField);
        inputPanel.add(new JLabel("Endereço"));
        carEnderecoField = new JTextField(20);
        inputPanel.add(carEnderecoField);
        inputPanel.add(new JLabel("Numero Telefone"));
        carNumteleField = new JTextField(20);
        inputPanel.add(carNumteleField);
        inputPanel.add(new JLabel("CPF"));
        carCpfField = new JTextField(20);
        inputPanel.add(carCpfField);
        add(inputPanel);
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));

        add(botoes);
        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Nome", "Endereço", "Numero Telefone", "Cpf"});
        table = new JTable(tableModel);
        jSPane.setViewportView(table);
        table.setCellSelectionEnabled(false);

        // Cria o banco de dados caso não tenha sido criado
        new PessoasDAO().criaTabela();

        // incluindo elementos do banco na criação do painel
        atualizarTabela();

        // tratamento de Eventos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    carNomeField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    carEnderecoField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    carNumteleField.setText((String) table.getValueAt(linhaSelecionada, 2));
                    carCpfField.setText((String) table.getValueAt(linhaSelecionada, 3));
                    atualizarTabela();
                }
            }
        });

        // Cria um objeto operacoes da classe CarrosControl para executar operações no
        // banco de dados
        PessoasControl operacoes = new PessoasControl(pessoas, tableModel, table);

        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco de dados
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama o método "cadastrar" do objeto operacoes com os valores dos campos de
                // entrada
                operacoes.cadastrar(carNomeField.getText(), carEnderecoField.getText(), carNumteleField.getText(),
                        carCpfField.getText());

                // Limpa os campos de entrada após a operação de cadastro
                carNomeField.setText("");
                carEnderecoField.setText("");
                carNumteleField.setText("");
                carCpfField.setText("");
                atualizarTabela();
            }
        });

        // Configura a ação do botão "editar" para atualizar um registro no banco de
        // dados
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                operacoes.atualizar(carNomeField.getText(), carEnderecoField.getText(), carNumteleField.getText(),
                        carCpfField.getText());
                // Limpa os campos de entrada após a operação de atualização
                carNomeField.setText("");
                carEnderecoField.setText("");
                carNumteleField.setText("");
                carCpfField.setText("");
                atualizarTabela();
            }
        });

        // Configura a ação do botão "apagar" para excluir um registro no banco de dados
        apagar.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                if (!carCpfField.equals(null)) {
                    operacoes.apagar(carCpfField.getText());
                    // Chama o método "apagar" do objeto operacoes com o valor do campo de entrada
                    // "Cpf"
    
                    // Limpa os campos de entrada após a operação de exclusão
                    carNomeField.setText("");
                    carEnderecoField.setText("");
                    carNumteleField.setText("");
                    carCpfField.setText("");
                    atualizarTabela();
                    
                } else {
                   JOptionPane.showMessageDialog(null, "Selecione um carro a ser apagado!!");
                }
            }
            
        });

    }

    // atualizar Tabela de Carros com o Banco de Dados
    private void atualizarTabela() {
        // atualizar tabela pelo banco de dados
        tableModel.setRowCount(0);
        pessoas = new PessoasDAO().listarTodos();
        for (Pessoas pessoa : pessoas) {
            tableModel.addRow(new Object[] { pessoa.getNome(), pessoa.getEndereco(), pessoa.getNumtele(), pessoa.getCpf()});
        }

    }
}
