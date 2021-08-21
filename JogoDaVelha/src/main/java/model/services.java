package model;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import view.JogoDaVelha;

/**
 * * @author Pedro Duarte e Thales Bastos
 * Professora: Luciana Campos
 * Laboratório de Programação de Computadores 2 - Jogo da Velha
 */
public class services {

    public static void fimDeJogo(JButton[] bt, boolean[] click) {

        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if (click[i] == true) {
                cont++;
            }
        }

        if ((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
                || (bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X")
                || (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")
                || (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")
                || (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")
                || (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X")
                || (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X")
                || (bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X")) {

            JOptionPane.showMessageDialog(null, "X ganou!");
            JogoDaVelha.pontosX++;
            attPlacar();
            limpar(bt, click);

        } else if ((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O")
                || (bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O")
                || (bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O")
                || (bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O")
                || (bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O")
                || (bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O")
                || (bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O")
                || (bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O")) {

            JOptionPane.showMessageDialog(null, "O ganou!");
            JogoDaVelha.pontosO++;
            attPlacar();
            limpar(bt, click);
        } else if (cont == 9) {

            JOptionPane.showMessageDialog(null, "Empate!");
            limpar(bt, click);
        }

    }

    public static void limpar(JButton[] bt, boolean[] click) {
        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            JogoDaVelha.click[i] = false;
        }
    }

    public static void mudaPlayer(JButton[] player, JButton button, boolean XO, JButton[] bt, boolean[] click) {
        if (XO) {
            button.setText("O");
            player[1].setBorder(new LineBorder(null));
            player[0].setBorder(new LineBorder(new Color(255, 140, 0)));
            JogoDaVelha.XO = false;

        } else {
            button.setText("X");
            player[1].setBorder(new LineBorder(new Color(255, 140, 0)));
            player[0].setBorder(new LineBorder(null));
            JogoDaVelha.XO = true;
        }
        fimDeJogo(bt, click);

    }

    public static void attPlacar() {
        JogoDaVelha.px.setText("X " + Integer.toString(JogoDaVelha.pontosX));
        JogoDaVelha.po.setText("O " + Integer.toString(JogoDaVelha.pontosO));
    }
    public static void zerarPlacar(){
        JogoDaVelha.pontosX=0;
        JogoDaVelha.pontosO=0;
        JogoDaVelha.px.setText("X " + Integer.toString(JogoDaVelha.pontosX));
        JogoDaVelha.po.setText("O " + Integer.toString(JogoDaVelha.pontosO));
        
    }
}
