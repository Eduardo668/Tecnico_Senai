package com.br.avaliacoes.Questao2.model;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    private String descricao;
    private double total;
    private String data;
    private ItensDoPedido itensDoPedido;

    public void setItensDoPedido(ItensDoPedido itensDoPedido){
        this.itensDoPedido = itensDoPedido;
    }
    public Pedido(){
        this.itensDoPedido = new ItensDoPedido();
        setItensDoPedido(itensDoPedido);
    }

    public void produtosDisponiveis1(){
        itensDoPedido.printProdutosDisponiveisPedido1();
    }
    public void produtosDisponives2(){
        itensDoPedido.printProdutosDisponiveisPedido2();
    }

    public String getDescricao(){
        return descricao;
    }

    public void faturarPedido(){
        for (int i = 0; i < 20; i++){
            if(descricao.equalsIgnoreCase(itensDoPedido.getProdutsName().get(i))){
                this.total = itensDoPedido.getQuantidade() * itensDoPedido.getProductPrice().get(i);
            }
        }
    }

    public void setProdutoBuy(String descricao, int quantidade, String data){
        this.descricao = descricao;
        this.data = data;
        itensDoPedido.setQuantidade(quantidade);
    }

    @Override
    public String toString() {
        return "Descrição: " + getDescricao() +
                "\nTotal: R$" + total +
                "\nData: " + data ;
    }
}
