package ExerciciosProf;

import java.util.Scanner;

public class Exercicio6 {
    Scanner leitura = new Scanner(System.in);
    double altura,pesoIdeal;
    int sexo;

    public void PesoIdeal(){
        System.out.println("Digite a altura em metros: ");
        altura = leitura.nextDouble();
        System.out.println("digite o sexo (1 para Masculino) ou (2 para Feminino)");
        sexo = leitura.nextInt();

        if (sexo== 1){
            pesoIdeal = 62.1 * altura - 44.7;
        } else if (sexo == 2) {
            pesoIdeal = 72.7 * altura - 58;
        }
        else {
            System.out.println("sexo Invalido. Digite 1 ou 2 para masculino");
            leitura.close();
            return;

        }
    }
}