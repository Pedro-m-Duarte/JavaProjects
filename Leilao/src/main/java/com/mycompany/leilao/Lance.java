
package com.mycompany.leilao;

public class Lance {
    
    private float valor;
    private Pessoa pessoa;
    
    public Lance(){
        
    }
    
    public Lance(float valor, Pessoa pessoa){
        this.valor = valor;
        this.pessoa = pessoa;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }
    public String getPessoaNome(){
        return this.pessoa.getNome();
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
