package Aprendendo;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2,nota3, media;
        String filme1,filem2,filem3;
        filme1 = "top gun";
        filem2 ="senhor dos aneis";
        filem3 ="HomemAranha";
        // extraido entradas
        System.out.printf("Digite um nota para o filme(%s):", filme1);
        nota1 = input.nextDouble();
        System.out.printf("Digite um nota para o filme(%s)",filem2);
        nota2 = input.nextDouble();
        System.out.printf("Digite um nota para o filme(%s):", filem3);
        nota3 = input.nextDouble();
        input.close();

        //calculando a media
        media = (nota1+nota2+nota3)/3 ;

        System.out.printf("""
                A nota do Filme:(%s) e de :(%.2f)
                A nota do Filme:(%s) e de :(%.2f)
                A nota do Filme:(%s) e de :(%.2f)
                
                A media dos filme e de ;(%.2f)
                """,filme1,nota1,filem2,nota2,filem3,nota3,media);
    }
    }

