package ExercicioOperadores;

import java.util.Scanner;

/**
 * NotaFrequencia
 */

public class NotaFrequencia {
    Scanner leitura = new Scanner(System.in);
    int nota1, nota2;
    double mediaAluno, frenquenciaAluno;
    boolean aprovado,mediaAprovado;

    public void calcular() {
        System.out.println("Informe a primeira Nota: ");
        nota1 = leitura.nextInt();
        System.out.println("Informe a segunda Nota: ");
        nota2 = leitura.nextInt();
        mediaAluno = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é " + mediaAluno);
        if (mediaAluno >= 50) {
            System.out.println("O Aluno foi aprovado!!!");
        } else {
            System.out.println("O aluno foi reprovado!!!");
        }
        System.out.println("Informe a frequencia do Aluno: ");
        frenquenciaAluno = leitura.nextInt();
        if (frenquenciaAluno >= 75) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        mediaAprovado = mediaAluno==frenquenciaAluno;
        if (mediaAprovado==true) {
            System.out.println("O aluno foi REPROVADO no curso!!!");
        }
        else {
            System.out.println("O aluno foi APROVADO no curso!!!"); 
        }
    }
}
