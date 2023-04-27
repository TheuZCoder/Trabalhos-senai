package Algoritmo;
import java.util.Scanner;

public class algo {
        int decimal,base,i,resto;
        String frase,bin;

    public void algori(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o código binário: ");
            String binario = sc.next();
             decimal = 0;
             base = 1;
            for ( i = binario.length() - 1; i >= 0; i--) {
                if (binario.charAt(i) == '1') {
                    decimal += base;
                }
                base *= 2;
                System.out.println("O valor decimal é: " + decimal);
                sc.close();
            }
    }
        public void DecToBin() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor decimal: ");
            decimal = sc.nextInt();
            String binario = "";
            while (decimal > 0) {
                resto = decimal % 2;
                binario = resto + binario;
                decimal /= 2;
            }
            System.out.println("O código binário é: " + binario);
            sc.close();
        }
        public void TextoToBin(){
            Scanner sc = new Scanner(System.in);
        System.out.print("Digite a frase: ");
         frase = sc.nextLine();
        StringBuilder binario = new StringBuilder();
        for (char c : frase.toCharArray()) {
             bin = Integer.toBinaryString(c);
            binario.append(String.format("%8s", bin).replace(' ', '0'));
        }
        System.out.println("O código binário da frase é: " + binario.toString());
        sc.close();
    }
}
        


  

