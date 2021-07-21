package com.mycompany.leilao;

import java.util.ArrayList;

public class Leilao {

    private ArrayList<Lote> lotes = new ArrayList();

    public Leilao() {

    }
    public int getLoteSize(){
        return lotes.size();
    }
    public Lote getLote(int i){
        return lotes.get(i);
    }
    public void inserirLote(Lote lote) {
        this.lotes.add(lote);
    }

    public void receberLance(int numLote, String descricaoProduto, Lance lance) {
        for (int i = 0; i < lotes.get(numLote).quantidadeProdutos(); i++) {              // percorre todos os objetos "lote" da lista ;
            if (lotes.get(numLote).getProduto(i).getDescricao().equals(descricaoProduto)) {    // Caso existe um produto com a descrição apresentada 
                lotes.get(numLote).verificarLance(i, lance);                          // confere se o lance é maior que o anterior.

            }
        }
    }

    public void encerrarLeilao() {

        for (int i = 0; i < lotes.size(); i++) {
            for (int j = 0; j < lotes.get(i).quantidadeProdutos(); j++) {
                if (lotes.get(i).getLance(j) != null) {
                    System.out.println(lotes.get(i).getLance(j).getPessoaNome() + " adquiriu o produto:" + lotes.get(i).getProduto(j).getDescricao() + " no valor de " + lotes.get(i).getLance(j).getValor() + " reais.");
                }
            }
        }

    }

    public void listarProdutos() {
        for (int i = 0; i < lotes.size(); i++) {
            System.out.println("------------------------------------");
            System.out.println("Os produtos abaixo pertencem ao lote " + lotes.get(i).getNomeLote()+"("+i+")");
            for (int j = 0; j < lotes.get(i).quantidadeProdutos(); j++) {
                System.out.println("Produto:" + lotes.get(i).getProduto(j).getDescricao());
                if (lotes.get(i).getLance(j) != null) {
                    System.out.println(lotes.get(i).getLance(j).getPessoaNome() + " ofereceu o maior lance no produto acima no valor de " + lotes.get(i).getLance(j).getValor() + " reais.");
                }
            }
             
        }
    }

}
