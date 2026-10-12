package Desafios.Desafios_1;
//Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
// representando o preço original de um produto.
// Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
// Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
public class DescontoProduto {
    public static void main(String[] args) {
        double valorOriginal = 100,porcentualDesconto = 0.10;;
        double valorDoDEsconto = valorOriginal * porcentualDesconto;
        double valorFinal = valorOriginal - valorDoDEsconto;

        System.out.printf("""
              valor do desconto: R$(%.1f)
              valor Original: R$(%.1f) 
              valor com desconto: R$(%.1f)""",valorDoDEsconto,valorOriginal,valorFinal);
    }
}
