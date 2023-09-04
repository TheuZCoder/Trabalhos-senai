import javax.swing.JTabbedPane;

/**
 * JtabbedPane
 */
public class JtabbedPane extends JTabbedPane {
    public JtabbedPane() {
        super();
        this.add("Calculadora 1",new calculadora1());
        this.add("Calculadora 2",new calculadora2());
        this.add("Calculadora 3",new calculadora3());
    }

    
}