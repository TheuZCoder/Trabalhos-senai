package ExemploArray;

public class Vetores {
    double[] valores;
    String[] produtos;
    int[] novoValores;

    public void exemplo1(){
        //criando vetor
        valores = new double[]{10.5,20.7,30.6,40.4};
        produtos = new String[]{"sabao ","arroz ","feijao ","carne "};
        System.out.println("1º Posição- índice [0]:" + produtos[0] + valores[0]);
        System.out.println("2º Posição- índice [1]:" + produtos[1] + valores[1]);
        System.out.println("3º Posição- índice [2]:" + produtos[2] + valores[2]);
        System.out.println("4º Posição- índice [3]:" + produtos[3] + valores[3]);

    }
    
    public void exemplo2(){
        novoValores = new int[5];
        novoValores[0]= 10;
        novoValores[1]= 20;
        novoValores[2]= 35;
        novoValores[3]= 67;
        novoValores[4]= 98;

        System.out.println("O vetor 0 é = " + novoValores[0]);
        System.out.println("O vetor 0 é = " + novoValores[1]);
        System.out.println("O vetor 0 é = " + novoValores[2]);
        System.out.println("O vetor 0 é = " + novoValores[3]);
        System.out.println("O vetor 0 é = " + novoValores[4]);
        
    }
}
