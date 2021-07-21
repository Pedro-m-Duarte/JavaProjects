
package com.mycompany.leilao;
import java.util.ArrayList;

public class Lote {
    private ArrayList<Produto> produtos = new ArrayList();
    private String nomeLote;
    
    public Lote(String nomeLote){
        this.nomeLote = nomeLote;
    }
    public Lote(){
    
    }

    public String getNomeLote() {
        return nomeLote;
    }

    public void setNomeLote(String nomeLote) {
        this.nomeLote = nomeLote;
    }
    
    public Produto getProduto(int i){
        return this.produtos.get(i);
    }
    public void inserirProduto(Produto produto){
        produtos.add(produto);
    }
    public void removerProduto(Produto produto){
        if(produtos.contains(produto)){
            
            produtos.remove((produtos.indexOf(produto)));
        }
    }
    public int quantidadeProdutos(){
        return produtos.size();
    }
   
    
    public void verificarLance(int i,Lance lance) {
        produtos.get(i).verificarMaiorlance(lance);
        
    }
    public Lance getLance(int i){
        if(produtos.get(i).getLancenicial()==true){
            return produtos.get(i).getMaiorlance();
        }
        return null;
    }
       
}
