package Desafios.Desafios_1;

import java.util.Scanner;

/*
Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
 */
public class ProdutoQuatidade {
    public static void main(String[] args) {
        double preco;
        preco = 0;
        int quantidade,produto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o quantidade do produto: ");
        quantidade = sc.nextInt();
        System.out.println("qual produto voce quer");
        System.out.println("Celular(1),memoriaRam(2),Cafe(3),uva(4)");
        produto = sc.nextInt();
        sc.close();
        if(produto == 1){
            preco = 699.0;
        } else if (produto == 2) {
            preco = 474.99;
        }else if (produto == 3) {
            preco =23.90;
        }else if (produto == 4) {
            preco = 9.0;
        }
        double saida =quantidade*preco;
        System.out.println("o preco total da compra ficou em R$:"+saida);
        System.out.println("Esse e o preco do produto R$:"+preco);



    }

}
