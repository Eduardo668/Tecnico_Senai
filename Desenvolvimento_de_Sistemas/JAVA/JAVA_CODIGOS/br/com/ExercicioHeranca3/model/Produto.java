package br.com.ExercicioHeranca3.model;

import java.util.ArrayList;

public class Produto {
    private final ArrayList<String> produtos = new ArrayList<>();
    private final ArrayList<Double> preco = new ArrayList<>();

    public ArrayList<String> getProdutos() {
        return produtos;
    }

    public ArrayList<Double> getPreco() {
        return preco;
    }

    public void setProdutos(String produtos){
        this.produtos.add(produtos);
    }

    public void setPreco(double preco){
        this.preco.add(preco);
    }

    @Override
    public String toString() {
        return "Produtos" +
                "\nprodutos: " + String.join(", ", produtos) +

    }
}
