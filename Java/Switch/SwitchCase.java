package Switch;

import java.util.Scanner;

public class SwitchCase {
    Scanner leitura = new Scanner(System.in);
    int diaDaSemana;
    String nomeDoDiaDaSemana;

    public void letra() {
        System.out.println("Informe o dia (Numero): ");
        diaDaSemana = leitura.nextInt();

        switch (diaDaSemana) {
            case 1:
                nomeDoDiaDaSemana = "Domingo";
                break;
            case 2:
                nomeDoDiaDaSemana = "Segunda";
                break;
            case 3:
                nomeDoDiaDaSemana = "Terça";
                break;
            case 4:
                nomeDoDiaDaSemana = "Quarta";
                break;
            case 5:
                nomeDoDiaDaSemana = "Quinta";
                break;
            case 6:
                nomeDoDiaDaSemana = "Sexta";
                break;
            case 7:
                nomeDoDiaDaSemana = "Sabado";
                break;
            default:
                nomeDoDiaDaSemana = "[Não Encontrado!]";
        }
        System.out.println("O dia da Semana é: " + nomeDoDiaDaSemana);
    }

    int diaMes;
    String nomeMes;

    public void mes() {
        System.out.println("Informe o dia (Numero): ");
        diaMes = leitura.nextInt();

        switch (diaMes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;

            default:
                nomeMes = "Numero Invalido!";
        }
        System.out.println("O mês é " + nomeMes);

    }
}
