package exception;

import javax.swing.JOptionPane;

/**
 * ExemploThrow
 */
public class ExemploThrow {

    public static void main(String[] args) {
        //
        try {
            JOptionPane.showMessageDialog(null, "Welcome to SENAI");
            String login = JOptionPane.showInputDialog("Informe seu Login");
            String senha = JOptionPane.showInputDialog("Informe sua Senha de 6 Digitos");
            if (senha.length() != 6) {
                throw new Exception("Senha deve ter 6 Digitos");
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}