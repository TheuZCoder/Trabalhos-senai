package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Model.Usuario;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CadastroUsuarios extends JFrame {
    // atributos

    private JButton cadastrarButton, atualizarButton, apagarButton, apagarTodosButton, salvarButton;
    private JPanel inputPanel = new JPanel();
    private JTextField inputNome;
    private JTextField inputIdade;
    private DefaultTableModel tableModel;
    private JTable table;

    private List<Usuario> usuarios = new ArrayList<>();
    private int linhaSelecionada = -1;

    public CadastroUsuarios() {
        setTitle("Cadastro de Usuários");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nome");
        tableModel.addColumn("Idade");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // criar os componentes
        cadastrarButton = new JButton("Cadastrar");
        atualizarButton = new JButton("Atualizar");
        apagarButton = new JButton("Apagar");
        apagarTodosButton = new JButton("Apagar Todos");
        salvarButton = new JButton("Salvar");

        inputNome = new JTextField(20);
        inputIdade = new JTextField(5);

        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(inputNome);
        inputPanel.add(new JLabel("Idade:"));
        inputPanel.add(inputIdade);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(apagarTodosButton);
        inputPanel.add(salvarButton);

        //set do layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

       
    }
 
    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getNome(), usuario.getIdade() });
        }
    }
    public void run(){
        pack();
        setVisible(true);
    }
}
