package ExerciciosProf;
import java.util.Scanner;

public class Exercicio2 {
    Scanner leitura = new Scanner(System.in);
    double AnoNasc,idade;
    
    public void VerificaVoto(){
        System.out.println("Digite o ano de Nascimento: ");
        AnoNasc = leitura.nextDouble();
        idade = 2023 - AnoNasc;
        if (idade>=16){
            System.out.println("Você poder votar!");
        }
        else {
            System.out.println("você não podera votar ainda");
        }
    }
}