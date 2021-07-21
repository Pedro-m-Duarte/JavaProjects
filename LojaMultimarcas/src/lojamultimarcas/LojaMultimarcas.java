/*
    Laboratorio de PCII - prova 1
Alunos:
    Pedro Henrique Maia Duarte  
    Thales Henrique Bastos Neves
Professora:
    Luciana Campos

 */
package lojamultimarcas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LojaMultimarcas {

    public static void main(String[] args) {

        ArrayList<Produtos> produtos = new ArrayList();
        HashMap<String, String> fabricantes = new HashMap();

        /* Variaveis de interação*/
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        Scanner input6 = new Scanner(System.in);

        String nome1 = " ";

        int menu1 = 1;
        int num2;
        int num3 = 1;

        String marca;
        String modelo;
        String transportadora;
        String dataFab;
        int numSerie;
        int numLote;

        String nome;
        int telefone;

        while (menu1 != 0) {

            /*Menu principal */
            System.out.println("---------------------------------------------------------\n"
                    + "Selecione a opção desejada:\n"
                    + " (1)Cadastrar fabricantes.\n"
                    + " (2)Cadastrar produto (celular ou notebook).\n"
                    + " (3)Listar todos os produtos.\n"
                    + " (4)Buscar produto por nome do modelo. \n"
                    + " (5)Buscar produto por fabricante.\n"
                    + " (0) Sair.\n"
                    + "---------------------------------------------------------");
            menu1 = input1.nextInt();

            switch (menu1) {
                case 1:
                    /*Adiciona fabricante*/
                    System.out.println("----------------------------\n"
                            + "Insira o nome do fabricante:\n"
                            + "----------------------------");
                    System.out.println("No lugar do espaco deve ser usado o caracter \"_\"");
                    nome1 = input1.next();
                    fabricantes.put(nome1, nome1);
                    break;
                case 2:
                    /*Adciona produto*/
                    if (produtos.size() > 65535) {
                        System.out.println("Nao eh possivel adicionar mais produtos.");
                    } else {

                        System.out.println("----------------------------\n"
                                + "Selecione a opção:\n"
                                + "(1) Adicionar celular :\n"
                                + "(2) Adicionar notebook :\n"
                                + "----------------------------");
                        num2 = input1.nextInt();

                        switch (num2) {
                            case 1:
                                /* Adiciona celular*/
                                System.out.println("Digite em sequencia, a marca, modelo, número de série, data "
                                        + "de fabricação em dd/mm/aa, numero de lote e nome da transportadora do celular");
                                System.out.println("No lugar do espaco deve ser usado o caracter \"_\"");

                                marca = input1.next();
                                modelo = input2.next();
                                numSerie = input3.nextInt();
                                dataFab = input4.next();
                                numLote = input5.nextInt();
                                transportadora = input6.next();

                                Celular celular = new Celular(marca, modelo, numSerie, dataFab, numLote, transportadora);

                                num3 = 1;// reseta o contador para nao sair direto da 2 vez
                                while (num3 != 0) { // Adiciona os fabricantes ao produto
                                    System.out.println("Deseja adicionar um fabricante? Se positivo digite 1, caos contrario digite 0");
                                    num3 = input1.nextInt();
                                    if (num3 == 1) {
                                        System.out.println("Digite o nome do fabricante para adiciona-lo como fabricante deste produto.");
                                        
                                        nome1 = input1.next();
                                        if (fabricantes.containsKey(nome1)) {
                                            celular.setFabricante(nome1);

                                        }
                                    }
                                }
                                System.out.println();
                                num3 = 1;// reseta o contador para nao sair direto da 2 vez
                                while (num3 != 0) { // Adiciona os fornecedores  ao produto
                                    System.out.println("Deseja adicionar um fornecedor? Se positivo digite 1, caos contrario digite 0");
                                    num3 = input1.nextInt();
                                    if (num3 == 1) {
                                        System.out.println("Digite o nome e telefone do fornecedor para adiciona-lo como fornecedor deste produto.");
                                        
                                        nome = input1.next();
                                        telefone = input2.nextInt();
                                        Fornecedor fornecedor = new Fornecedor(nome, telefone);// cria o fornecedor
                                        celular.setFornecedor(nome, fornecedor); // adiciona o fornecedor ao objeto celular
                                    }
                                }

                                produtos.add(celular);
                                System.out.println("Celular cadastrado com sucesso!");
                                break;
                            case 2:/* Adiciona notebook*/
                                System.out.println("Digite em sequencia, a marca, modelo, número de série, data"
                                        + " de fabricação em dd/mm/aa, numero de lote e nome da transportadora do notebook");
                                System.out.println("No lugar do espaco deve ser usado o caracter \"_\"");
                                
                                marca = input1.next();
                                modelo = input2.next();
                                numSerie = input3.nextInt();
                                dataFab = input4.next();
                                numLote = input5.nextInt();
                                transportadora = input6.next();

                                Notebooks notebook = new Notebooks(marca, modelo, numSerie, dataFab, numLote, transportadora);

                                num3 = 1;// reseta o contador para nao sair direto da 2 vez
                                while (num3 != 0) {
                                    System.out.println("Deseja adicionar um fabricante? Se positivo digite 1, caos contrario digite 0");
                                    num3 = input1.nextInt();
                                    if (num3 == 1) {
                                        System.out.println("Digite o nome do fabricante para adiciona-lo como fabricante deste produto.");
                                        nome1 = input1.next();
                                        if (fabricantes.containsKey(nome1)) {
                                            notebook.setFabricante(nome1);

                                        }
                                    }
                                }
                                System.out.println();
                                num3 = 1;// reseta o contador para nao sair direto da 2 vez
                                while (num3 != 0) { // Adiciona os fornecedores  ao produto
                                    System.out.println("Deseja adicionar um fornecedor? Se positivo digite 1, caos contrario digite 0");
                                    num3 = input1.nextInt();
                                    if (num3 == 1) {
                                        System.out.println("Digite o nome e telefone do fornecedor para adiciona-lo como fornecedor deste produto.");
                                        System.out.println("No lugar do espaco deve ser usado o caracter \"_\"");
                                        nome = input1.next();
                                        telefone = input2.nextInt();
                                        Fornecedor fornecedor = new Fornecedor(nome, telefone);// cria o fornecedor
                                        notebook.setFornecedor(nome, fornecedor); // adiciona o fornecedor ao objeto notebook
                                    }
                                }
                                produtos.add(notebook);
                                System.out.println("Notebook cadastrado com sucesso!");

                                break;
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }
                    }
                    break;

                case 3:
                    /* Lista todos os produtos*/
                    if (produtos.size() > 0) {
                        for (int i = 0; i < produtos.size(); i++) {
                            produtos.get(i).ToString();
                        }
                    } else {
                        System.out.println("A loja nao possui produtos");
                    }
                    break;
                case 4:
                    /*Busca produto pelo nome*/
                    System.out.println("Digite o nome do produto que deseja:");
                    nome1 = input1.next();
                    if (produtos.size() > 0) {
                        for (int i = 0; i < produtos.size(); i++) {
                            if (produtos.get(i).getModelo().equals(nome1)) {
                                produtos.get(i).ToString();
                            }
                        }
                    } else {
                        System.out.println("A loja nao possui produtos");
                    }

                    break;
                case 5:
                    /*Busca produto por fabricante */
                    System.out.println("Digite o nome do fabricante que deseja:");
                    nome1 = input1.next();
                    if (produtos.size() > 0) {
                        for (int i = 0; i < produtos.size(); i++) {
                            if (produtos.get(i).getFabricantes().containsKey(nome1)) {
                                produtos.get(i).ToString();
                            }
                        }

                    } else {
                        System.out.println("A loja nao possui produtos");
                    }

                    break;

                case 0:
                    /* Impede que o 0 seja considerado uma opcao invalida*/

                    break;
                default:
                    /* O usuario digitou alguma opcao invalida*/
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }

}
