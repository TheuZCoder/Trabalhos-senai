package ExerciciosExtraIfElser;

import java.util.Scanner;

public class Letra {
    Scanner Leitura = new Scanner(System.in);
    String l1;
    public void Letras(){
       System.out.println("digite uma letra para saber se é consoante ou vogal");
       l1 = Leitura.nextLine();
       l1 = l1.toUpperCase();
        if (l1.equals("A") || l1.equals("E")|| l1.equals("I")|| l1.equals("O")|| l1.equals("U")){
            System.out.println("Esta letra é Vogal!");
        }else {
            System.out.println("Esta letra é Consoante!");
        }
        Leitura.close();
    }
}
