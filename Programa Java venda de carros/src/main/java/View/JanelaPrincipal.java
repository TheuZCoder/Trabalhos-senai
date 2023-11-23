package View;

import javax.swing.JFrame;

import Model.Login;


public class JanelaPrincipal extends JFrame {
    public JanelaPrincipal(Login logado) {
        super("Carros");

        this.add(new TabbedApp(logado));

        //Setando janela
        this.setBounds(550, 250, 1200, 500);
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
}