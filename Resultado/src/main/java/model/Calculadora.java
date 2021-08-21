package model;

import controler.Controler;

/**
 *
 * @author hamsu
 */
public class Calculadora {

    public static int randNum() {
        int num;
        num = (int) (Math.random() * 99.99);
        return num;
    }

    public static int randOperator() {
        int operator;
        operator = (int) (Math.random() * 3.99);
        return operator;

    }

    public static void resposta(int num1, int num2, int opr, String resultado) {
        int result = Integer.parseInt(resultado);
        switch (opr) {
            case 0:
                if (result == num1 + num2) {
                    Controler.pontos++;
                }

            case 1:
                if (result == num1 - num2) {
                    Controler.pontos++;
                }

            case 2:
                if (result == num1 * num2) {
                    Controler.pontos++;
                }

            default:
                if (result == num1 / num2) {
                    Controler.pontos++;
                }

        }
    }

}
