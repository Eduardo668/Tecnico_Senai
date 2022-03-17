package com.br.avaliacoes.Questao2.model;

import java.util.ArrayList;

public class ItensDoPedido {
    private Produtos produtos;
    private int quantidade;


    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }


    public ItensDoPedido(){
        this.produtos = new Produtos();
        setProdutos(produtos);
    }

    public void printProdutosDisponiveisPedido1(){
        produtos.produtosPedido1();
        System.out.println("");
    }
    public void printProdutosDisponiveisPedido2(){
        produtos.produtosPedido2();
    }

    public ArrayList<String> getProdutsName(){
        return produtos.getNomeProdutos();
    }

    public ArrayList<Double> getProductPrice(){
        return produtos.getPrecoProdutos();
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
