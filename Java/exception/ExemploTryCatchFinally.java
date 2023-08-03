package exception;

import javax.swing.JOptionPane;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        String frase = null;
        String fraseUpper = null;
        frase = JOptionPane.showInputDialog("Digite uma Frase");
        if (frase.equals("")) {
            frase=null;
        }
        try {
            fraseUpper = frase.toUpperCase();
        } catch (NullPointerException e) {
            JOptionPane.showInputDialog(null, "Erro - String vazia");
            frase = "A Frase estava Vazia";
        } finally {
            fraseUpper = frase.toUpperCase();
            JOptionPane.showMessageDialog(null, fraseUpper);
        }
    }
}
