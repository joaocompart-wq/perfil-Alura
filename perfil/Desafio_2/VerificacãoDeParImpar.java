package Desafio_2;

import javax.swing.*;

public class VerificacãoDeParImpar {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String entrada, saidaTexto="";
        int numero;

        entrada = JOptionPane.showInputDialog("Digite um numero para verificar se e par o impar:");
        numero = Integer.parseInt(entrada);

        if (numero%2==0){
            saidaTexto="Esse numero ("+numero+") e par";
        }else {
            saidaTexto="Esse numero ("+numero+") e impar";
        }

        JOptionPane.showMessageDialog(frame,saidaTexto,"Saida da resposta",JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
}
