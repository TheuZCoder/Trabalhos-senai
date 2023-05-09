package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    double somal,somac;

    public void exemplo1() {
        // criar preencher e manipular a matriz
        // declarar a matriz
        int matriz[][] = new int[10][9]; // 2° dimensões
        // preencher a minha matriz
        for (int i = 0; i < 10; i++) { // 1° dimensão
            System.out.print("| ");
            for (int j = 0; j < 9; j++) { //2° dimensão
                //System.out.println("Matriz["+i+"]["+j+"]=");
                matriz[i][j]=rd.nextInt(9);

                System.out.print(matriz[i][j]+"  ");

            }
            System.out.println("|");
        }

        for (int i = 0; i < matriz[3].length; i++) {
            somal += matriz[3][i];
            somac += matriz[i][3]; 
        }
        System.out.println("a soma da quarta linha é "+somal);
        System.out.println("a soma da quarta coluna é "+somac);
        
        
    }
    public void Exercicio2() {
        int matriz[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++){
                if (i==j) {
                    matriz[i][j] = 1;
                }   
            }
        }

        for (int i = 0; i < 5; i++) { // 1° dimensão
            System.out.print("| ");
            for (int j = 0; j < 5; j++) { //2° dimensão

                System.out.print(matriz[i][j]+"  ");

            }
            System.out.println("|");
        }
        
        
    }
}