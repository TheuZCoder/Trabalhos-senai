package POOExercicio2;

import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        //vetor de objetos
        agenda obj[] = new agenda[10]; // vetor de 10 objetos
        for (int i = 0; i < obj.length; i++) {
            obj[i] = new agenda(); //cronstruindo o objeto
            //preencher meu objeto
            obj[i].setNome(JOptionPane.showInputDialog("Nome: "));
            obj[i].setAltura(JOptionPane.showInputDialog("Altura "));
            obj[i].setIdade(JOptionPane.showInputDialog("Idade: "));
            
        }
    }
}