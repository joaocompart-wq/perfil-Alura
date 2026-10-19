package Desafio_2;

import javax.swing.*;

public class VerificadorDeNumero_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int numero1=0,numero2=0;
        String entrada, saidaTexto="";

        entrada=JOptionPane.showInputDialog("Digite o primeiro numero:");
        numero1=Integer.parseInt(entrada);
        entrada=JOptionPane.showInputDialog("Digite o segundo numero:");
        numero2=Integer.parseInt(entrada);

        if (numero1 == numero2) {
            saidaTexto=String.format("O numero1 %d e igual ao numero2 %d", numero1, numero2);
        }else if (numero2 > numero1){
            saidaTexto=String.format("O numero2 (%d) e maior que o numero1 (%d)", numero2, numero1);
        }else if (numero1 > numero2){
            saidaTexto=String.format("O numero1 (%d) e maior que o numero2 (%d)", numero1, numero2);
        }
        JOptionPane.showMessageDialog(frame, saidaTexto);
        frame.dispose();
    }
}
