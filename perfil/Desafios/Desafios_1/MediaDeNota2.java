package Desafios.Desafios_1;

import java.util.Locale;
import java.util.Scanner;

public class MediaDeNota2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double execicio, prova, media;
        System.out.println("Digite a nota do Execicio");
       execicio = sc.nextDouble();
        System.out.println("Digite a nota da prova");
        prova = sc.nextDouble();
        sc.close();

        media = (execicio+prova)/2;

        System.out.printf("""
                A nota do prova foi : %.2f
                A nota o execicio foi : %.2f
                A media do aluno e : %.2f
                """,prova,execicio,media);
    }
}
