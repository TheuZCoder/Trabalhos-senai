package Algoritmo;
import java.util.Scanner;

public class algo {
    int n1,n2,n3,n4,n5,n6,n7,n8;

    public void algori(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o código binário: ");
            String binario = sc.next();
            int decimal = 0;
            int base = 1;
            for (int i = binario.length() - 1; i >= 0; i--) {
                if (binario.charAt(i) == '1') {
                    decimal += base;
                }
                base *= 2;
            }
            System.out.println("O valor decimal é: " + decimal);
    }
        public void DecToBin() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor decimal: ");
            int decimal = sc.nextInt();
            String binario = "";
            while (decimal > 0) {
                int resto = decimal % 2;
                binario = resto + binario;
                decimal /= 2;
            }
            System.out.println("O código binário é: " + binario);
        }
        public void TextoToBin(){
            Scanner sc = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();
        StringBuilder binario = new StringBuilder();
        for (char c : frase.toCharArray()) {
            String bin = Integer.toBinaryString(c);
            binario.append(String.format("%8s", bin).replace(' ', '0'));
        }
        System.out.println("O código binário da frase é: " + binario.toString());
    }
}
        


  

