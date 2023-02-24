package ExercicioOperadores;
import java.util.Scanner;

public class CritAprov {
    Scanner ler = new Scanner(System.in);
    double NotaUm,NotaDois,NotaFinal;

    public void aprovacao(){
        System.out.println("Informar Primeira nota: ");
        NotaUm = ler.nextDouble();
        System.out.println("informar segunda nota: ");
        NotaDois = ler.nextDouble();
        NotaFinal = NotaUm + NotaDois / 2;
        
        
       



        
    }
}
