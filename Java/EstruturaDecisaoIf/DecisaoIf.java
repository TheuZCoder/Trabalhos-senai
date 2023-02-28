package EstruturaDecisaoIf;

import java.util.Scanner;

public class DecisaoIf {
    Scanner sc = new Scanner(System.in);
    double precoProduto, desconto, valorDesconto, precoFinal;

    public void descontoIf() {
        System.out.println("Informe o preço do produto: ");
        precoProduto = sc.nextDouble();
        desconto = 0.0;
        if (precoProduto >= 100 && precoProduto < 200) {
            desconto = 5.0;
        }
        if (precoProduto >= 200 && precoProduto < 300) {
            desconto = 10.0;
        }
        if (precoProduto >= 300) {
            desconto = 15.0;
        }
        valorDesconto = precoProduto * desconto / 100;
        precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do Produto é R$" + precoFinal);
    }

    public void descontoIfElse() {
        System.out.println("Informe preço do produto:");
        precoProduto = sc.nextDouble();
        if (precoProduto >= 100) {
            desconto = 5.0;
        } else {
            desconto = 0;
        }
    }
}
