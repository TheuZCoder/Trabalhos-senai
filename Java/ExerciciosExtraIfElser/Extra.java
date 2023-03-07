package ExerciciosExtraIfElser;

import java.util.Scanner;

public class Extra {
    Scanner leitura = new Scanner(System.in);
    double salarioIncial,percentualAumento,valorAumento,novoSalario;

    public void salario(){
        System.out.println("Digite o seu salario para saber o quanto recebera de aumento: ");
        salarioIncial = leitura.nextDouble();
        if (salarioIncial <= 1280){
            percentualAumento = 0.2;
        } else if (salarioIncial <= 1700){
            percentualAumento = 0.15;
        } else if (salarioIncial <= 2500){
            percentualAumento = 0.1;
        } else {
            percentualAumento = 0.05;
        }
        valorAumento = salarioIncial * percentualAumento;
        novoSalario = salarioIncial + valorAumento;

        System.out.println("Salario antes do reajuste: R$" + salarioIncial);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento * 100);
        System.out.println("Valor do aumento: R$" + valorAumento);
        System.out.println("Novo salário após o aumento: R$" + novoSalario);
    }
}
