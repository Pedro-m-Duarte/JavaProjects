package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;
import model.services;
/**
 * * @author Pedro Duarte e Thales Bastos
 * Professora: Luciana Campos
 * Laboratório de Programação de Computadores 2 - Jogo da Velha
 */
public class JogoDaVelha extends JFrame {

    public static JButton[] bt = new JButton[9];
    public static JButton[] player = new JButton[2];
    public static JButton[] menu = new JButton[3];

    public static JLabel placar = new JLabel("PLACAR");
    public static JLabel px = new JLabel("X 0");
    public static JLabel po = new JLabel("O 0");
    public static int pontosX = 0, pontosO = 0;

    public static boolean XO = false;// false = O, true = O
    public static boolean[] click = new boolean[9];

    public JogoDaVelha() {
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250, 100, 600, 550);
        setLocationRelativeTo(null);
        setBackground(Color.yellow);

        add(placar);
        add(px);
        add(po);
        placar.setFont(new Font("Arial", Font.BOLD, 20));
        placar.setBounds(250, -30, 100, 100);
        px.setBounds(230, -5, 100, 100);
        po.setBounds(330, -5, 100, 100);

        for (int i = 0; i < 9; i++) {
            click[i] = false;
        }

        for (int i = 0; i < 2; i++) { // seta os botes do player 
            String nome;
            if (i == 0) {
                nome = "X";
            } else {
                nome = "O";
            }

            player[i] = new JButton(nome);

            add(player[i]);
            player[i].setBounds((100 * i) + 187, 60, 95, 35);
        }

        int cont = 0;
        for (int i = 0; i < 3; i++) { // seta os botoes do tabuleiro
            for (int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                add(bt[cont]);
                bt[cont].setBounds((100 * i) + 140, (100 * j) + 115, 95, 95);
                bt[cont].setFont(new Font("Arial", Font.BOLD, 40));

                cont++;
            }
        }

        for (int i = 0; i < 3; i++) {// seta os botoes do menu
            String nome;
            if (i == 0) {
                nome = "Limpar";
            } else if(i==1){
                nome = "Sair";
            } else{
                nome = "Resetar";
            }
            menu[i] = new JButton(nome);
            add(menu[i]);
            menu[i].setBounds((100 * i) + 140, 425, 95, 35);
        }

        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[0] == false) {
                    click[0] = true;
                    services.mudaPlayer(player, bt[0], XO, bt, click);

                }
            }
        });
        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[1] == false) {
                    click[1] = true;
                    services.mudaPlayer(player, bt[1], XO, bt, click);

                }
            }
        });
        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[2] == false) {
                    click[2] = true;
                    services.mudaPlayer(player, bt[2], XO, bt, click);

                }
            }
        });
        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[3] == false) {
                    click[3] = true;
                    services.mudaPlayer(player, bt[3], XO, bt, click);
                }
            }
        });
        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[4] == false) {
                    click[4] = true;
                    services.mudaPlayer(player, bt[4], XO, bt, click);
                }
            }
        });
        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[5] == false) {
                    click[5] = true;
                    services.mudaPlayer(player, bt[5], XO, bt, click);
                }
            }
        });
        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[6] == false) {
                    click[6] = true;
                    services.mudaPlayer(player, bt[6], XO, bt, click);
                }
            }
        });
        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[7] == false) {
                    click[7] = true;
                    services.mudaPlayer(player, bt[7], XO, bt, click);
                }
            }
        });
        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[8] == false) {
                    click[8] = true;
                    services.mudaPlayer(player, bt[8], XO, bt, click);
                }
            }
        });

        menu[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                services.limpar(bt, click);
            }
        });

        menu[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                services.zerarPlacar();
                services.limpar(bt, click);
            }
        });

    }

    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        
    }
}
