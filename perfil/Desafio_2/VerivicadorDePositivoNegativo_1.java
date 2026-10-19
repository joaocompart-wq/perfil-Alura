package Desafio_2;

import javax.swing.*;

//Crie um programa que solicite ao usuário digitar um número.
// Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
public class VerivicadorDePositivoNegativo_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pratica 1");
        frame.setAlwaysOnTop(true);

        int numero=0;
        String entrada , saida="";

        entrada = JOptionPane.showInputDialog("Digite um valor para ver se e positivo o negativo:");
        numero = Integer.parseInt(entrada);

        if (numero<0){
          saida = "negativo";
        } else if (numero>0) {
            saida = "positivo";
        }

        JOptionPane.showMessageDialog(frame,"O seu numero ("+numero+") e "+saida,"",JOptionPane.QUESTION_MESSAGE);
    }
}
