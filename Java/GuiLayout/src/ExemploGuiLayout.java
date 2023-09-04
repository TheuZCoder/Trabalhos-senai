import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * ExemploGuiLayout
 */
public class ExemploGuiLayout extends JFrame {
    String valores[] = {"7", "8", "9", "/", "6", "5", "4", "*", "3", "2", "1", "-", "+","0",".","="};
    public ExemploGuiLayout() {
        super("Calculadora");
        JPanel painel1 = new JPanel(new BorderLayout());
        this.add(painel1);

        painel1.add(new JTextField(15),BorderLayout.NORTH);

        JPanel painel2 = new JPanel(new GridLayout(4,4));
        painel1.add(painel2,BorderLayout.CENTER);
        for (int i = 0; i < valores.length; i++) {
            painel2.add(new JButton(valores[i]));
        }
        this.pack();
        this.getDefaultCloseOperation();
        this.setVisible(true);

    }
}