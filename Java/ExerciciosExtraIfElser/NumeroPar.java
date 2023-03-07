package ExerciciosExtraIfElser;

import java.util.Scanner;

public class NumeroPar {
    Scanner Leitura = new Scanner(System.in);
    int numero;
    public void par(){
        System.out.println("Digite um numero para saber se ele é impar ou par: ");
        numero = Leitura.nextInt();
        if (numero % 2 == 0){
            System.out.println(numero +" é PAR!");
        } else {
            System.out.println(numero + " é IMPAR!");
            Leitura.close();
        }
    }
}
