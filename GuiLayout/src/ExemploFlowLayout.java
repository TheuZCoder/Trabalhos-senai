import javax.swing.*;
import java.awt.*;

/**
 * ExemploFlowLayout
 */
public class ExemploFlowLayout {

    public ExemploFlowLayout() {
        JFrame janela = new JFrame("Janela Principal");
        //mudar layout padrão (GRID)-> Flow
        FlowLayout flow = new FlowLayout();
        janela.setLayout(flow); //mudei layout
        //adicionar componentes no layout
        janela.add(new JLabel("Informe o Valor:"));
    }
}