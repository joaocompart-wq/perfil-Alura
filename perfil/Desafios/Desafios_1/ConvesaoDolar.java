package Desafios.Desafios_1;

import javax.swing.*;

public class ConvesaoDolar {
    public static void main(String[] args) {
        //variavel
        double valorDolar = 4.99;
        double reais,saida,sobra;
        //entrada de informacao
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String texto = JOptionPane.showInputDialog("Digite A quantidade de reais que vai converter: ");
        reais = Double.parseDouble(texto);
        // Calculo e operacao
        saida = reais / valorDolar;
        sobra = reais % valorDolar;
        //Saida
        String textoSaida =  String.format("%.2f", saida);
        String textoSobra =  String.format("%.2f", sobra);

        JOptionPane.showMessageDialog(frame,"total de dolar $:"+textoSaida+"\n Sobra de reais R$:"+textoSobra);

    frame.dispose();

    }
}
