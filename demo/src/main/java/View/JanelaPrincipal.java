package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaPrincipal extends JFrame{
     // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;

    public JanelaPrincipal() {
        jTPane = new JTabbedPane();
        add(jTPane);
        // criandos as tabs
        // tab1 carros
        JanelaCarros tab1 = new JanelaCarros();
        JanelaPessoas tab2 = new JanelaPessoas();
        JanelaVendas tab3 = new JanelaVendas();
      
        jTPane.add("Carros", tab1);
        jTPane.add("Pessoas", tab2);
        jTPane.add("Vendas", tab3);

        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //métodos para tornar a janela visível
    public void run(){
        this.setVisible(true);
     }
}
