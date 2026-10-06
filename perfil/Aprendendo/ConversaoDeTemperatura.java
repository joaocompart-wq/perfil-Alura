package Aprendendo;


import java.sql.SQLOutput;
import java.util.Scanner;

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        //pede a entrada de informacao
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um temperatura para ser convertida de celsos para Fahrenheit :");
        double celsius = sc.nextDouble();
        sc.close();
        // coverte o celsius para Fahrenheit
        double coversao = (celsius*1.8)+32;
        System.out.printf("A coversao de Celsios para Fahrenheit e: %.2f",coversao);
        System.exit(1);

    }

}
