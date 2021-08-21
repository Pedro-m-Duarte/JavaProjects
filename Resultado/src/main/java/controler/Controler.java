package controler;

import model.Calculadora;

/**
 * * @author Pedro Duarte e Thales Bastos
 * Professora: Luciana Campos
 * Laboratório de Programação de Computadores 2 - Qual é o resultado?
 */
public class Controler {

    public static int num1, num2, opr, pontos = 0;

    public static void reiniciar() {
        Controler.pontos = 0;
        Controler.passar();
    }

    public static void enviarTentativa(String resultado) {
       Calculadora.resposta(num1, num2, opr, resultado);
    }
    public static String delete(String resultado){
        if(resultado.length()>1 && !resultado.equals("0"))
            return resultado.substring(0,( resultado.length()-1));
        
        return "0";
    }
    
    

    public static void passar() {
        Controler.num1 = Calculadora.randNum();
        Controler.num2 = Calculadora.randNum();
        Controler.opr = Calculadora.randOperator();
        
    }
    public static String getOperator(){
     switch(opr){
            case 0:
            return "+";

                              
                case 1:
            return "-";

               
                case 2:
            return "*";

              
                default:
            return "/";

                   
        }
    }
}
