package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // criar preencher e manipular a matriz
        // declarar a matriz
        int matriz[][] = new int[10][9]; // 2° dimensões
        // preencher a minha matriz
        for (int i = 0; i < 10; i++) { // 1° dimensão
            for (int j = 0; j < 9; j++) { //2° dimensão
                //System.out.println("Matriz["+i+"]["+j+"]=");
                matriz[i][j]=rd.nextInt(9);

            }

        }
        
    }
}