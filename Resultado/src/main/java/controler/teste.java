package controler;

import javax.swing.JFrame;
import javax.swing.JPanel;
import view.view;

/**
 * * @author Pedro Duarte e Thales Bastos
 * Professora: Luciana Campos
 * Laboratório de Programação de Computadores 2 - Qual é o resultado?
 */
public class teste extends JFrame {

    public static void main(String[] args) {
        view panel = new view();
        JFrame frame = new JFrame("Qual é o resultado?");

       init(frame, panel);

    }
    public static void init(JFrame frame, JPanel panel){

        frame.add(panel);
        frame.setSize(650   , 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
