package CalcularVelocidadeMedia;
import  java.util.Scanner;
public class CalcularVelocidadeMedia {

    public void Calcvelocidade(String[] args) {
        try (Scanner ler =  new Scanner(System.in)){
        int distancia,tempo;
        System.out.println("======Calcular Velocidade Média===========");
        System.out.println("informe a distancia: ");
        distancia = ler.nextInt();
        System.out.println("A distancia percorrida foi de " + distancia + "Km.");
        System.out.println("Informe Tempo gasto: ");
        tempo = ler.nextInt();
        System.out.println("O tempo gasto foi de " + tempo + "horas");
        double velocidadeMedia = distancia / tempo;
        System.out.println("Para encontrar a velocidade média " + "dividimos a distância (" + distancia + ") pelo tempo gasto no " + "percurso (" + tempo + ")."); 
        System.out.println("A velocidade média é de " + velocidadeMedia + "Km/h"); 
        }
    }
}


    