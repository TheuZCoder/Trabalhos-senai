package ExerciciosWhile;

import java.util.Random;
import java.util.Scanner;

public class iteracao {
    Scanner leitura = new Scanner(System.in);
    int i = 0;
    int vetor[] = new int[10];

    public void exemplo1() {
        while (i < 10) {
            System.out.println("o numero da iteração é " + i);
            i++;
        }
    }

    public void exemplo2() {
        i = 0; 
        while (i < 10) {
            System.out.println("Informe o valor do vetor[" + i + "]= ");
            vetor[i] = leitura.nextInt();
            i++;
        }
        i = 0; 
        while (i < 10) {
            System.out.println("vetor[" + i + "]= " + vetor[i]);
            i++;
        }
    }

    public void exemplo3() {
        Random rd = new Random();
        int nAleatorio = rd.nextInt(10);
        boolean tenteNovamente = true;
        while (tenteNovamente) {
            System.out.println("Digite um número de 0 a 10");
            int nale = leitura.nextInt();
            if (nale == nAleatorio) {
                System.out.println("Acertou!");
                tenteNovamente = false;
            }
            else {
                System.out.println("Você errou. Tente novamente!");
            }
        }
    }
}