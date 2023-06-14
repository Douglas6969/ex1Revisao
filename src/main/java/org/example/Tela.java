package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela {
    private JComboBox comboBox;
    private JTextArea resposta;
    private JButton exibirBtn;
    public JPanel Tbox;



    public JComboBox getComboBox() {

        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public JTextArea getTextArea1() {
        return resposta;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.resposta = textArea1;
    }

    public JButton getExibirBtn() {
        return exibirBtn;
    }

    public void setExibirBtn(JButton exibirBtn) {
        this.exibirBtn = exibirBtn;
    }

    public JPanel getTbox() {
        return Tbox;
    }

    public void setTbox(JPanel tbox) {
        Tbox = tbox;
    }

    public Tela() {
        exibirBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBox.getSelectedIndex() == 0){
                    resposta.setText("Polimorfismo em Java permite que objetos de diferentes classes sejam tratados de forma uniforme através de interfaces e heranças, possibilitando a flexibilidade e reutilização de código.");
                }else if(comboBox.getSelectedIndex() == 1){
                    resposta.setText("Herança em Java é um mecanismo que permite criar classes novas a partir de classes existentes, herdando seus atributos e métodos. Isso promove a reutilização de código e estabelece uma relação de hierarquia entre as classes.");
                }else if(comboBox.getSelectedIndex() == 2){
                    resposta.setText("Encapsulamento em Java é um princípio de programação que consiste em ocultar os detalhes internos de uma classe e fornecer acesso controlado aos seus atributos e métodos por meio de modificadores de acesso, como public, private e protected. Isso permite garantir a integridade dos dados, melhorar a segurança e facilitar a manutenção do código.");
                }else if(comboBox.getSelectedIndex() == 3){
                    resposta.setText("Sobrecarga em Java é um recurso que permite definir múltiplos métodos com o mesmo nome, porém com parâmetros diferentes. Isso possibilita o uso conveniente de métodos com funcionalidades similares, mas adaptados a diferentes tipos de entrada ou quantidades de argumentos.");
                }


            }
        });
    }



}
