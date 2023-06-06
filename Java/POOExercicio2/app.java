package POOExercicio2;

import java.util.Random;

import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        Random rd = new Random();
        buscarpessoa contatos[] = new buscarpessoa[10];

        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new buscarpessoa();
            contatos[i].setNome(JOptionPane.showInputDialog("Digite o nome:"));
            contatos[i].setAltura(rd.nextDouble());
            contatos[i].setIdade(i+18);
        }
        String buscarNome = JOptionPane.showInputDialog(
            "Informe o nome a ser Buscado");
        boolean busca = true;
        int cont=0;
        while(busca){
            if(buscarNome.equals(contatos[cont].getNome())){
                busca = false;
                contatos[cont].imprimir();
            }
            cont++;
        }
    }
}