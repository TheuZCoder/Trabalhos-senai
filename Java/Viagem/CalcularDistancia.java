package Viagem;

import java.util.Scanner;

public class CalcularDistancia {
      Scanner sc = new Scanner(System.in);
        String Saida, Destino;

    public void Destino() {

        System.out.println("Informe seu local de saida: ");
        Saida = sc.nextLine();
        System.out.println("Informe o Destino: ");
        Destino = sc.nextLine();
        System.out.println("você viajara de " + Saida + " até " + Destino);

       }    
    
    public void Distancia() {

        try (Scanner ler = new Scanner(System.in)) {
            double distanciaPercorrida, preçoDaGasolina, KMporLitro, custoViagem;

            System.out.println("=============Calculador de preços de viagem===========");
            System.out.println("Qual a distancia percorrida?: ");
            distanciaPercorrida = ler.nextDouble();
            System.out.println("Qual o preço da gasolina?: ");
            preçoDaGasolina = ler.nextDouble();
            System.out.println("Quantos KM por litro faz seu carro?: ");
            KMporLitro = ler.nextDouble();
            custoViagem = distanciaPercorrida / KMporLitro * preçoDaGasolina;
            ler.close();

            System.out.println("O custo da sua viagem foi de " + custoViagem + " Reais");
            System.out.println("=================Programa finalizado===============");
        }
    }

}