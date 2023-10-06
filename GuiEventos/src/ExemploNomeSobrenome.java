import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ExemploNomeSobrenome
 */
public class ExemploNomeSobrenome extends JFrame{
    private JTextField caixaNome;
    private JTextField caixaSobrenome;
    private JLabel texto;

    //construtor                
    public ExemploNomeSobrenome(){
        super("Exemplo 1 - Eventos");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 200);
        //criar painel principal -> grid layoyut 3x2

        JPanel mainPanel = new JPanel(new GridLayout(3,2));
        this.add(mainPanel);
        //criar os componentes
        mainPanel.add(new JLabel("Nome:"));
        caixaNome = new JTextField();
        mainPanel.add(caixaNome);
        mainPanel.add(new JLabel("Sobrenome:"));
        caixaSobrenome = new JTextField();
        mainPanel.add(caixaSobrenome);
        JButton botao = new JButton("concatenar");
        mainPanel.add(botao);
        texto = new JLabel();
        mainPanel.add(texto);
        //set do frame
        this.setVisible(true);
        //tratamento de eventos 3 formas
        // 1° forma: e->{evento} /callback
        // botao.addActionListener(e->{//listener(ouvinte/fofoqueira)
        //     //evento
        //     texto.setText(caixaNome.getText() +" "+ caixaSobrenome.getText());
        //     caixaNome.setText("");
        //     caixaSobrenome.setText("");
        // });
        // 2° forma: "new ActionListener" -> actionPerformed(ActionEvent)
        // botao.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
        //     texto.setText(caixaNome.getText() +" "+ caixaSobrenome.getText());
        //     caixaNome.setText("");
        //     caixaSobrenome.setText("");
        //     }
        // });
        // 3° forma: Handler(manipulador)
        // criar uma classe para tratar o evento -> chamar o listener
    }
    //criar o handler
    public class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            texto.setText(caixaNome.getText() +" "+ caixaSobrenome.getText());
            caixaNome.setText("");
            caixaSobrenome.setText("");
        }
    }
}