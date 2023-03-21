package ExerciciosDiogoRevisão;

import java.util.Scanner;

/**
 * notaRevisao
 */
public class notaRevisao {
    Scanner leitura = new Scanner(System.in);
    double nota1, nota2, mediaAluno, frequencia;
    int aulasDada, faltasAluno;

    public void calcular() {
        System.out.println("Digite a primeira nota do aluno (0 a 100): ");
        nota1 = leitura.nextDouble();
        System.out.println("Digite a segunda nota do aluno (0 a 100): ");
        nota2 = leitura.nextDouble();
        mediaAluno = (nota1 + nota2) / 2;
        System.out.println("a média do aluno foi de " + mediaAluno);
        System.out.println("digite o total de aulas dadas pelo professor: ");
        aulasDada = leitura.nextInt();
        System.out.println("digite o numero de faltas do aluno: ");
        faltasAluno = leitura.nextInt();
        frequencia = (aulasDada - faltasAluno) * 100 / aulasDada;
        System.out.println("a frenquencia do aluno foi de " + frequencia + "%");
        if (mediaAluno >= 50 && frequencia >= 75) {
            System.out.println("Aluno foi aprovado");
        } else if (mediaAluno <= 50 && frequencia >= 75) {
            System.out.println("Aluno esta de recuperação");
        } else {
            System.out.println("Aluno foi reprovado");
        }
    }
}