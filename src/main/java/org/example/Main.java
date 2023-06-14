package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tela Resumo = new Tela();

        JFrame frame = new JFrame();
        frame.setContentPane(Resumo.Tbox);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}