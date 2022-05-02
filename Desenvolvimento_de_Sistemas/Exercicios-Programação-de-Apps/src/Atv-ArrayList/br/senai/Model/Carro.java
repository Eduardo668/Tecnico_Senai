package br.senai.Model;

public class Carro {
    private String nome;
    private String marca;

    public Carro (String name){
        this.nome = name;
    }
    public Carro (String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
