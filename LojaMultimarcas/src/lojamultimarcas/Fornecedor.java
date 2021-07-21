
package lojamultimarcas;


public class Fornecedor {
    private String nome;
    private int telefone;

    
    public Fornecedor(){};
    
    public Fornecedor(String nome, int telefone){
        this.nome=nome;
        this.telefone =telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
}