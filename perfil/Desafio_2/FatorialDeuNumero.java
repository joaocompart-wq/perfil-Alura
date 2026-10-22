package Desafio_2;

import javax.swing.*;
import java.util.ArrayList;

public class FatorialDeuNumero {
    public static void main(String[] args) {
        int fatorial=1,numero=10;
        JFrame frame=new JFrame();
        frame.setAlwaysOnTop(true);
        ArrayList<String> lista=new ArrayList<>();
        String entrada = JOptionPane.showInputDialog(frame,"Digite a entrada do numero fatorial");
        numero = Integer.parseInt(entrada);

        for (int i = numero; i >= 1; i--) {
            fatorial=fatorial*i;
            lista.add("x"+i);
        }
        String saidaTexto=String.format("Esse e o fatorial do numero %d \n %d!=%s=%d",numero,numero,lista,fatorial);
        JOptionPane.showMessageDialog(frame,saidaTexto,"Saida",JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
}
