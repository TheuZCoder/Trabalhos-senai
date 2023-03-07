package ExerciciosExtraIfElser;

import java.util.Scanner;

public class Rec {
    Scanner leitura = new Scanner(System.in);
    int nota1,nota2,notaFinal;
    
    public void nota(){
        System.out.println("Digite a primeira nota: ");
        nota1 = leitura.nextInt();
        System.out.println("Digite a segunda nota:");
        nota2 = leitura.nextInt();
        notaFinal = (nota1 + nota2) / 2;
        if (notaFinal >= 7){
            System.out.println("Você passou direto aproveite as Férias :)");
        } else if (notaFinal <= 4){
            System.out.println("Você esta de REPROVADO");
        } else {
            System.out.println("Você tem direito a uma prova de recuperação!!");
        }
    }
}
