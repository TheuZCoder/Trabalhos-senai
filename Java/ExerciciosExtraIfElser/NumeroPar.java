package ExerciciosExtraIfElser;

import java.util.Scanner;

public class NumeroPar {
    Scanner Leitura = new Scanner(System.in);
    double numero;
    public void par(){
        System.out.println("Digite um numero para saber se ele é impar ou par: ");
        numero = Leitura.nextDouble();
        if (numero % 2 == 0){
            System.out.println(numero +" é PAR!");
        } else {
            System.out.println(numero + " é IMPAR!");
            Leitura.close();
        }
    }
}
