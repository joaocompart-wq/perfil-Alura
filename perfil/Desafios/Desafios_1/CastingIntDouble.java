package Desafios.Desafios_1;

import java.util.Locale;
import java.util.Scanner;

public class CastingIntDouble {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numeroint;
        double numerodouble;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero decimal");
        numerodouble = sc.nextDouble();
        sc.close();

        numeroint= (int) numerodouble;
        System.out.println("Trasformacao de double para int : "+numeroint);


    }
}
