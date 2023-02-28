package ExerciciosProf;
import java.util.Scanner;

public class Exercicio1 {
    Scanner leitura = new Scanner(System.in);
    double Valor1,Valor2;

    public void ValorMaior(){
        System.out.println("insira o primeiro valor: ");
        Valor1 = leitura.nextDouble();
        System.out.println("insira o segundo valor: ");
        Valor2 = leitura.nextDouble();
        if (Valor1>Valor2){
            System.out.println("o maior valor é " + Valor1);
        }
        else {
            System.out.println("o maior valor é " + Valor2);
        }
         if (Valor1==Valor2){
            System.out.println("os numeros são iguais");
        }
    }
    
}
