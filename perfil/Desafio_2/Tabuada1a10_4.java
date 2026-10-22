package Desafio_2;

import javax.swing.*;
import java.util.ArrayList;

public class Tabuada1a10_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String entrada,textoSaida="";
        int numero=0,resultado=0;
        ArrayList<String> lista=new ArrayList<>();

        entrada = JOptionPane.showInputDialog(frame,"Digite um numero para receber a tabuada");
        numero = Integer.parseInt(entrada);
        for(int i=1;i<=10;i++){
            resultado=numero*i;
            lista.add(""+numero+"*"+i+"="+resultado+"\n");
        }
        JOptionPane.showMessageDialog(frame,lista,"Tabuada",JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
}
