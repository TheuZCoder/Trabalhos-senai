import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class exeploCard extends JFrame {
    public exeploCard() {
        super("Exemplo card Layout");
        //criando um painel
        JPanel painel1 = new JPanel();
        //criando um comboBox
        String comboBoxItens[] = {"card1","card2"};
        JComboBox cb = new JComboBox(comboBoxItens);
        painel1.add(cb);

        //criar os cards
        JPanel cards1 = new JPanel();
        cards1.add(new JButton("botão 1"));
        cards1.add(new JButton("botão 2"));
        cards1.add(new JButton("botão 3"));
        
        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField",20));
        //painel que vai conter os meus cards
        
        JPanel cards = new JPanel();
        cards.add(cards1,"card1");
        cards.add(card2,"card2");
        this.add(painel1);
        painel1.add(cards);

        //set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        cb.addItemListener(e->{
            CardLayout cl = (CardLayout) (cards.getLayout());
            cl.show(cards,(String) e.getItem());
        }
        );
    }
}
