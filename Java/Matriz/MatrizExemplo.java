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
    public void Exercicio1Extra() {
        int matriz[][] = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = i+1 * j+1;          
            }
            
        }
        for (int i = 0; i < 4; i++) { 
            System.out.print("| ");
            for (int j = 0; j < 4; j++) { 

                System.out.print(matriz[i][j]+"  ");

            }
            System.out.println("|");
        }
    }
    public void Exercicio2Extra() {
        int matriz[][] = new int[4][4], MaiorValor=0,localizadorC=0,localizadoL=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
                if (matriz[i][j] >= MaiorValor) {
                    MaiorValor = matriz[i][j];
                    localizadorC = j+1;
                    localizadoL = i+1;
                    
                }
                
            }
           
        }
        for (int i = 0; i < 4; i++) { 
            System.out.print("| ");
            for (int j = 0; j < 4; j++) { 

                System.out.print(matriz[i][j]+"  ");

            }
            System.out.println("|");
        }
        System.out.println("O maior valor é "+MaiorValor+" localizado na coluna "+ localizadorC + " na linha "+ localizadoL);
    }
    public void Exercicio3Extra() {
        int matriz[][] = new int[5][5], Valor,localizadorC=0,localizadoL=0;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero a ser pesquisado: ");
        Valor = leitura.nextInt();
        

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
            } 
        }
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5; j++) { 

                if (Valor == matriz[i][j]) {
                    localizadorC = j+1;
                    localizadoL = i+1;   
                }
            }
        }
        if (Valor != 0) {
            System.out.println("o valor foi localizado na coluna "+ localizadorC+ " linha "+ localizadoL);
        } else {
            System.out.println("Valor não enconttrado");
        }
        
    }
    public void Exercicio5Extra() {
        int matriz[][] = new int[5][4], NotaMaior=matriz[0][3],MatriculaMaior=matriz[0][0];
        Scanner leitura = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) { 
            System.out.println("Aluno " + (i+1));
            System.out.println("Numero da matricula");
            matriz[i][0] = leitura.nextInt();
            System.out.println("Digite a nota da Prova: ");
            matriz[i][1] = leitura.nextInt();
            System.out.println("digite a Nota do Trabalho: ");
            matriz[i][2] = leitura.nextInt();
            matriz[i][3] = (matriz[i][1] + matriz[i][2]) / 2;
            System.out.println("A média do aluno é "+ matriz[i][3]);
        }
       for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][3] > NotaMaior) {
                NotaMaior = matriz[i][3];
                MatriculaMaior = matriz[i][0];
            }
            System.out.println("Matricula com maior nota final " + MatriculaMaior);
        
       }
    }
}

