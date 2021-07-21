
package com.mycompany.leilao;

public class Produto {
    private String descricao;
    private Lance maiorlance = new Lance();
    private boolean lanceinicial = false;

    public Produto(){
    
    }
    public Produto(String descricao) {
        this.descricao = descricao;
       
    }
    
    public boolean getLancenicial() {
        return lanceinicial;
    }
   
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void verificarMaiorlance(Lance lance) {
        if(maiorlance.getValor()<lance.getValor()){
            this.maiorlance = lance;
            this.lanceinicial = true;
            
        }
    }

    public Lance getMaiorlance() {
         if(this.lanceinicial==true){
            return this.maiorlance;
         }
        return null;
    }
    
              
}
