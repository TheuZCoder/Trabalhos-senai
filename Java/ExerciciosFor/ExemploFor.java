package ExerciciosFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner leitura = new Scanner(System.in);

    public void exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("o n° da interação é " + i);
        }
    }

    public void exemplo2() {
        double carrinhoCompra[] = new double[] { 25.50, 55.90, 69.90, 95.75 };
        double valorFinalCompra = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinalCompra += carrinhoCompra[i];
        }
        System.out.println("O valor da compra é R$" + valorFinalCompra);

    }

    public void exemplo4() {
        String le[] = new String[10];
        for (int i = 0; i < le.length; i++) {
            System.out.println("digite a " + i + "letra");
            le[i] = leitura.nextLine();
            if (le[i].equals("A") || le[i].equals("E") || le[i].equals("I") || le[i].equals("O")) {
            } else {
                System.out.println(le[i]);
            }
        }
    }
}
