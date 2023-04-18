package iteração;

import java.util.Scanner;

/**
 * it
 */
public class it {
    public void ex0() {
        Scanner leitura = new Scanner(System.in);
        // criar um vetor para receber 4 notas
        double vetorNotas[] = new double[4];
        // preencher o vetor com 4 notas "fori"
        for (int i = 0; i < vetorNotas.length; i++) {
            // pedir para digitar a nota e ler ela
            System.out.println("digite a nota " + (i + 1));
            vetorNotas[i] = leitura.nextDouble();
        }
        // printar as notas e calcular a média "fori"
        double media = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + "=" + vetorNotas[i]);
            media += vetorNotas[i]; //acumular o valor das notas do vetor
        }
        //dividir a média pelo numero de notas
        media /= vetorNotas.length;
        //mostrar a média
        System.out.println("A média do aluno é "+ media);
        leitura.close();
    }

    public void ex1() {
        Scanner leitura = new Scanner(System.in);
        char[] vetor = new char[10];
        int numConsoantes = 0;
        String consoantes = "";

        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leitura.next().charAt(0);
            if (Character.isLetter(vetor[i])) {
                char c = Character.toLowerCase(vetor[i]);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    numConsoantes++;
                    consoantes += vetor[i] + " ";
                }
            }
        }

        System.out.println("Número de consoantes: " + numConsoantes);
        System.out.println("Consoantes lidas: " + consoantes);

        leitura.close();
    }

    public void ex2() {
        Scanner leitura = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int numPares = 0, numImpares = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leitura.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[numPares++] = numeros[i];
            } else {
                impares[numImpares++] = numeros[i];
            }
        }

        System.out.print("Números digitados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.print("Números pares: ");
        for (int i = 0; i < numPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.print("Números ímpares: ");
        for (int i = 0; i < numImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

        leitura.close();
    }

    public void ex3() {
        // Scanner leitura = new Scanner(System.in);

    }
}