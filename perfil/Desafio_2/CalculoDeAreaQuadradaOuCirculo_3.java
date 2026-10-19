package Desafio_2;

import javax.swing.*;

public class CalculoDeAreaQuadradaOuCirculo_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String entrada,textoSaida="";


        entrada = JOptionPane.showInputDialog("Escolha alcular a area de (1)quadrada ou (2)circulo");
        if (entrada.equals("1")) {
            int lado=0;
            int quadrada=0;
            entrada = JOptionPane.showInputDialog(frame,"Digite um lado ");
            lado = Integer.parseInt(entrada);
            quadrada = lado *lado;
            textoSaida =String.format("A area do quandrado e de [%d]Metros", quadrada);

        }if (entrada.equals("2")) {
             double pi,raio,area;
             pi = 3.1415;
            entrada = JOptionPane.showInputDialog(frame,"Digite o raio de circulo");
            raio = Double.parseDouble(entrada);
            area =(raio*raio)*pi;
            textoSaida =String.format("A area do circulo e de %f", area);
        }

        JOptionPane.showMessageDialog(frame,textoSaida);
        frame.dispose();
    }
}
