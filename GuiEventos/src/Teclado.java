import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Teclado extends JFrame {
    JPanel painel = new JPanel(new GridLayout(0, 1));
    JTextField digitarTexto;

    JLabel copiaTexto;

    public Teclado() {
        super("keylistenner");
        this.setBounds(100, 100, 300, 200);
        this.setDefaultCloseOperation(2);
        this.add(painel);
        digitarTexto = new JTextField("digite algo para ser replicado");
        painel.add(digitarTexto);
        copiaTexto = new JLabel();
        painel.add(copiaTexto);
        this.setVisible(true);
    }

    public class handler implements KeyListener {
        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            copiaTexto.setText(digitarTexto.getText());
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }
    }
}
