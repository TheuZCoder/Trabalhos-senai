package ExerciciosProf;
import java.util.Scanner;

public class Exercicio3 {
    Scanner leitura = new Scanner(System.in);
    int senha;

    public void VerificaSenha(){
        System.out.println("Digite a senha: ");
        senha = leitura.nextInt();
        
        if (senha==1234){
            System.out.println("Acesso Permitido");
        }
        else{
            System.out.println("Acesso Negado");    
        }
    }
}
