import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class contarinersComponente extends JFrame {

    public contarinersComponente() {
        super("Minha Janela Principal");
        // adicionar outro container
        JPanel painel1 = new JPanel();
        this.getContentPane().add(painel1);
        // adicionar componentes ao painel
        // Jpanel ja vem com o Flow
        painel1.add(new JLabel("Informe um N°"));
        // criar um JTesxt field
        JTextField campo1 = new JTextField(25);
        painel1.add(campo1);
        JButton botao1 = new JButton("Enviar");
        painel1.add(botao1);
        botao1.addActionListener(e -> {

            String valorCampo1 = campo1.getText();
            int quantidade = Integer.parseInt(valorCampo1);

            for (int i = 0; i < quantidade; i++) {
                painel1.add(new JButton("" + i));
            }
            this.pack();
        });
        // set frame
        this.pack();
        this.setVisible(true);

        this.setDefaultCloseOperation(2);
    }
}
