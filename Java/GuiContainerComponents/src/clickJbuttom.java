import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class clickJbuttom extends JFrame {
    //atributos
    int cont=0;
    public clickJbuttom() {
        super("Click");
        JPanel painel1 = new JPanel();
        //criar componentes painel
        JButton botao1 = new JButton("Clique aqui");
        painel1.add(botao1);
        JLabel texto1 = new JLabel("N° de Cliques");
        painel1.add(texto1); 
        botao1.addActionListener(e->{
            cont++;
            texto1.setText("numero de cliques: "+cont);
            this.pack();
        });
        this.getContentPane().add(painel1);
        //setdo frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}
