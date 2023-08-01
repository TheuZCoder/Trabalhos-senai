package POOExercicio3;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // criar elevador
        elevador elevador1 = new elevador(10, 10);
        elevador1.inicializa();
        Boolean ligado = true;
        // loop do elevador
        while (ligado) {
            System.out.println("Digite a ação desejada: " + "\n1-Entrar" + "\n2-Sair" + "\n3-Subir" + "\n4=Descer"
                    + "\n5-Desligar");
            int acao = sc.nextInt();
            switch (acao) {
                case 1:
                    System.out.println("Capacidade: " + elevador1.entra());
                    break;
                case 2:
                    System.out.println("Capacidade: " + elevador1.sair());
                    break;
                case 3:
                    System.out.println("Quantos Andares Deseja Subir: ");
                    System.out.println("Andar Atual" + elevador1.subir(sc.nextInt()));
                    break;
                case 4:
                    System.out.println("Quantos Andares Deseja descer: ");
                    System.out.println("Andar Atual" + elevador1.descer(sc.nextInt()));
                    break;
                case 5:
                    ligado = false;
                    break;

                default:
                System.out.println("digite uma ação valida");
                    break;
                
            }
        }
        sc.close();
    }
}
