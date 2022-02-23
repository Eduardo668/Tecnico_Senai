package br.com.PE.model;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;


    public String getRua() {
        return this.rua;
    }
    public String setRua(String rua){
        this.rua = rua;
        return this.rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
