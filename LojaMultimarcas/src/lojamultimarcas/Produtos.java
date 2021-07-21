package lojamultimarcas;

import java.util.HashMap;
import java.util.Map;

public abstract class Produtos {

    protected String marca;
    protected String modelo;
    protected HashMap<String, Fornecedor> fornecedores = new HashMap();

    protected int numSerie;
    protected String dataFab;
    protected HashMap<String, String> fabricantes = new HashMap();
    protected int numLote;
    protected String nomeTransportadora;

    public Produtos(String marca, String modelo, int numSerie, String dataFab, int numLote, String transportadora) {
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.dataFab = dataFab;
        this.numLote = numLote;
        this.nomeTransportadora = transportadora;
    }

    public Produtos() {
    }

    ;
    
    public void ToString() {
        System.out.println("----------------------------------\n"
                + "Marca: " + this.getMarca() + "\n"
                + "Modelo: " + this.getModelo() + "\n"
                + "Número de Série: " + this.getNumSerie() + "\n"
                + "Data de Fabricação: " + this.getDataFab() + "\n"
                + "Número de Lote: " + this.getNumLote() + "\n"
                + "Nome da transportadora: " + this.getNomeTransportadora());

        if (!fabricantes.isEmpty()) {
            System.out.print("Fabricantes:");
            for (Map.Entry<String, String> entrada : fabricantes.entrySet()) {
                System.out.println(" " + entrada.getValue());
            }
            
        }
        if (!fornecedores.isEmpty()) {
            System.out.print("Fornecedores:");
            for (Map.Entry<String, Fornecedor> entrada : fornecedores.entrySet()) {
                System.out.println(" " + entrada.getValue().getNome());
            }
            
        }
    }

    

    public String getFabricante(String nome) {
        return fabricantes.get(nome);
    }

    public HashMap<String, String> getFabricantes() {
        return fabricantes;
    }

    public void setFabricante(String nome) {
        if (this.fabricantes.size() <= 20) {
            this.fabricantes.put(nome, nome);
        }
    }

    public void setFabricantes(HashMap<String, String> fabricantes) {
        if (fabricantes.size() <= 20) {
            this.fabricantes = fabricantes;
        }
    }

    public Fornecedor getFornecedor(String nome) {
        return fornecedores.get(nome);
    }

    public HashMap<String, Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedor(String nome, Fornecedor fornecedor) {
        if (this.fornecedores.size() <= 20) {
            this.fornecedores.put(nome, fornecedor);
        }
    }

    public void setFornecedores(HashMap<String, Fornecedor> fornecedores) {
        if (fornecedores.size() <= 20) {
            this.fornecedores = fornecedores;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getDataFab() {
        return dataFab;
    }

    public void setDataFab(String dataFab) {
        this.dataFab = dataFab;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public String getNomeTransportadora() {
        return nomeTransportadora;
    }

    public void setNomeTransportadora(String nomeTransportadora) {
        this.nomeTransportadora = nomeTransportadora;
    }
    
    
}
