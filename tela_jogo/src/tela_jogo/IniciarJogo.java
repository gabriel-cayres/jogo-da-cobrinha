package tela_jogo;

import javax.swing.*;

public class IniciarJogo extends JFrame {

    public static void main(String[] args) {
        new IniciarJogo();
    }

    IniciarJogo() {
        setTitle("Jogo da Cobrinha ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}