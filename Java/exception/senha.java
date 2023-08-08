package exception;

import javax.swing.JOptionPane;

public class senha {

    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite a senha:");

        if (senha.length() < 8) {
            JOptionPane.showMessageDialog(null, "A senha deve conter pelo menos 8 caracteres.");
            return;
        }

        if (!senha.matches(".*[a-z].*")) {
            JOptionPane.showMessageDialog(null, "A senha deve conter pelo menos uma letra minúscula.");
            return;
        }

        if (!senha.matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(null, "A senha deve conter pelo menos uma letra maiúscula.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Senha válida!");
    }
}

