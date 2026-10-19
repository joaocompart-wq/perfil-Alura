package JogoDeAdivinhacao_Alura;

import javax.swing.*;
import java.util.Random;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jogo de Adivinhacao");
        frame.setAlwaysOnTop(true);
        int numeroOculto =1;
        String entrada , saida="" ;
        int numero=0;
        int tentativas=5;
        do {
            if (tentativas == 5) {
                numeroOculto = new Random().nextInt(100)+1;
            }
            do {
                entrada = JOptionPane.showInputDialog("tentativas: "+tentativas+"\n Digite um numero: ");
                numero = Integer.parseInt(entrada);
            }while(numero<=-1);
            if (numero==numeroOculto) {saida = String.format("Voce acertou o numero Oculto)");
            } else if (numero < numeroOculto) {saida = String.format("O numero (%d) e menor que o numero Oculto",numero);
            }else if (numero > numeroOculto) {saida = String.format("O numero (%d) e maior que o numero Oculto",numero);}

            JOptionPane.showMessageDialog(frame,saida,"tela de texto",JOptionPane.QUESTION_MESSAGE);
tentativas--;
if (tentativas<= 1) {
    entrada = JOptionPane.showInputDialog(frame,"Voce quer tentar novamete");
    if (entrada.equals("no")) {
    }else{tentativas = 5;}
}
        }while(numero != numeroOculto);
        frame.dispose();
    }
}
