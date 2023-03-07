package ExerciciosExtraIfElser;

import java.util.Scanner;

public class Imposto {
    Scanner leitura = new Scanner(System.in);
    double descontoTotal,fgts,sindicato,inss,descontoFinal,valorHora,
            horaTrabalhada,salarioBruto,salarioLiquido,descontoIPRF;
    public void Iprf(){
        System.out.println("Qual o valor da sua Hora trabalhada?: ");
        valorHora = leitura.nextDouble();
        System.out.println("Quantas horas foi trabalhada?: ");
        horaTrabalhada = leitura.nextDouble();
        salarioBruto = valorHora * horaTrabalhada;

        if (salarioBruto <= 900){
            descontoIPRF = 0;
        } else if (salarioBruto <= 1500){
            descontoIPRF = 0.05;
        }else if (salarioBruto <= 2500){
            descontoIPRF = 0.1;
        }else if (salarioBruto >= 2500){
            descontoIPRF = 0.2;
        }
        sindicato = 0.3;
        descontoFinal = salarioBruto * descontoIPRF;
        fgts = salarioBruto * 0.11;
        inss = salarioBruto * 0.10;
        descontoTotal = descontoFinal + inss;
        salarioLiquido = salarioBruto - descontoTotal;

        System.out.println("O salario bruto é de: R$"+ salarioBruto );
        System.out.println("Desconto IR R$" + descontoFinal );
        System.out.println("desconto INSS: R$" + inss);
        System.out.println("O total depositado pela empresa em sua conta do FGTS foi de: R$" + fgts);
        System.out.println("Total de descontos do salario: R$" + descontoTotal);
        System.out.println("Salario Liquido de R$" + salarioLiquido);
    } 
}
