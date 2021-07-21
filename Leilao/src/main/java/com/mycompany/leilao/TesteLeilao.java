package com.mycompany.leilao;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteLeilao {

    public static void main(String[] args) {

        Leilao leilao = new Leilao();
        ArrayList<Pessoa> pessoas = new ArrayList();
        ArrayList<Produto> produtos = new ArrayList();
        ArrayList<Lote> lotes = new ArrayList();

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        int num1;
        int num2;
        int contador;
        String variavel1;
        String variavel2;

        System.out.println("Digite o numero de pessoas que participarao do leilao:"); // Setar o numero de pessoas que irao participar do leilao
        num1 = input1.nextInt();
        for (int i = 0; i < num1; i++) {
            contador = i + 1;
            System.out.println("Digite respectivamente o nome e contato da pessoa " + contador + " que participara do leilao.");
            variavel1 = input1.next();
            variavel2 = input2.next();
            Pessoa pessoa = new Pessoa(variavel1, variavel2);

            pessoas.add(pessoa);

            System.out.println("Pessoa " + contador + " adicionada com sucesso!");

        }
        System.out.println();
        System.out.println(num1 + " pessoas particiarao do leilao.");
        System.out.println("");
        
        
        System.out.println("Digite o numero desejado de lotes:");// Insere e adiciona os lotes na variavel -lotes- pertencente ao objeto leilao
        num1 = input1.nextInt();
        for (int i = 0; i < num1; i++) {
            contador = i + 1;
            System.out.println("Digite o nome do lote " + contador + ":");
            variavel1 = input1.next();
            Lote lote = new Lote(variavel1);

            leilao.inserirLote(lote);

        }
        System.out.println("");
        System.out.println(leilao.getLoteSize() + " lotes foram adicionados.");
        System.out.println("");
        
        for (int i = 0; i < num1; i++) {
            contador = i + 1;
            System.out.println("Digite o numero produtos pertencentes ao lote " + leilao.getLote(i).getNomeLote() + " :");// Insere e adiciona os produtos na variavel -produtos- pertencente a ArrayList<lotes> que, por sua vez, pertence ao objeto leilao

            num2 = input1.nextInt();
            for (int j = 0; j < num2; j++) {
                contador = j + 1;
                System.out.println("Digite a descrição do produto" + contador + ":");
                variavel1 = input1.next();
                Produto produto = new Produto(variavel1);

                leilao.getLote(i).inserirProduto(produto);

            }
        }
        leilao.listarProdutos();
        
        System.out.println();
        System.out.println("O leilao ira comecar !");
        System.out.println("Para realizar um lance basta eh necessario informar a pessoa que dara o lance e o valor que serah oferecido");
        System.out.println("Para identificar a pessoa eh necessario informar o numero correspondente a ela. Segue os valores correspondentes");
        System.out.println("");
        
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("------------------------------------");
            System.out.println("O numero da pessoa " + pessoas.get(i).getNome() + ", que tem o contato " + pessoas.get(i).getContato() + " eh " + i);
        }
        System.out.println("");
        
        contador = 0;
        while (contador == 0) {
            System.out.println("Para realizar um lance informe respectivamente, o numero da pessoa, o valor do lance, o numero do lote do produto e sua descricao.");
            num1 = input1.nextInt(); // Numero do endereço da pessoa no ArrayList
            num2 = input2.nextInt();// Valor do lance
        
            Lance lance = new Lance(num2,pessoas.get(num1)); // cria um objeto lance com a pessoa e valor desejados
            num1 = input1.nextInt();
            variavel1 = input1.next(); // descricao do protudo
            
            leilao.receberLance(num1, variavel1, lance);
            System.out.println("Caso haja mais lances digite 0, caso contrario digite 1 para encerrar o leilao");
            contador = input1.nextInt();
        }
        System.out.println("");
        leilao.encerrarLeilao();
        
        
    }
}
