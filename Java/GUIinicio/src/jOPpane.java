import javax.swing.JOptionPane;

public class jOPpane extends JOptionPane {
    //atributo
    String informacao = "Minha Dialog JOPane";
    //metodo
    public jOPpane() {
        super();
        this.showMessageDialog(getComponentPopupMenu(),informacao,informacao,0);                        
    }
}
