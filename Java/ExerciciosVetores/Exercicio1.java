package ExerciciosVetores;

import java.util.Arrays;

import java.util.Scanner;

public class Exercicio1 {
    Scanner leitura = new Scanner(System.in);
    double valores[];

    public void vetor1() {
        System.out.println("digite 10 valores(com virgula separando os)");
        leitura.nextDouble();
        valores = new double[] {};
        System.out.println("o vetor (1) invertido fica = " + valores[9]);
        System.out.println("o vetor (2) invertido fica = " + valores[8]);
        System.out.println("o vetor (3) invertido fica = " + valores[7]);
        System.out.println("o vetor (4) invertido fica = " + valores[6]);
        System.out.println("o vetor (5) invertido fica = " + valores[5]);
        System.out.println("o vetor (6) invertido fica = " + valores[4]);
        System.out.println("o vetor (7) invertido fica = " + valores[3]);
        System.out.println("o vetor (8) invertido fica = " + valores[2]);
        System.out.println("o vetor (9) invertido fica = " + valores[1]);
        System.out.println("o vetor (10) invertido fica = " + valores[0]);

    }

    public void vetorex() {
        int[] A = new int[5];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;

        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

    }

    public void vetor2() {

        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int[] B = new int[8];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nVetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }

    public void vetor3() {
        int[] A = { 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256 };

        double[] B = new double[15];
        for (int i = 0; i < A.length; i++) {
            B[i] = Math.sqrt(A[i]);
        }

        System.out.println("Vetor A:");
        System.out.println(Arrays.toString(A));
        System.out.println("Vetor B:");
        System.out.println(Arrays.toString(B));
    }

    public void vetor4() {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] B = new int[10];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * i;
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nVetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }

    public void vetor5() {
      
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

     
        int[] B = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };


        int[] C = new int[10];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("Vetor A: " + Arrays.toString(A));
        System.out.println("Vetor B: " + Arrays.toString(B));
        System.out.println("Vetor C: " + Arrays.toString(C));
    }
}