import javax.swing.JFrame;

public class Jframe extends JFrame{
    public Jframe() {
        super("SA3 GUI LAYOUT");
        this.add(new JtabbedPane());

        this.setBounds(500, 250, 500, 500);
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
}
