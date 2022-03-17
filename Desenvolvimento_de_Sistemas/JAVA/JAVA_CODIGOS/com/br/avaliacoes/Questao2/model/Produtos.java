package com.br.avaliacoes.Questao2.model;

import java.util.ArrayList;

public class Produtos {
    private final ArrayList<String> nomeProdutos = new ArrayList<>();
    private final ArrayList<Double> precoProdutos = new ArrayList<>();

    public Produtos(){
        //Adiciona Protutos disponiveis no pedido 1
        for (int i = 0; i < 10;i++){
            nomeProdutos.add("Iphone "+ (i+1));
        }
        //Adiciona produtos disponiveis no pedido 2
        for (int c = 0;c < 10; c++){
            nomeProdutos.add("Samsung S"+(c+1));
        }
        //Adiciona preço dos protutos disponiveis no pedido 1
        for (int cont = 0; cont < 10;cont++){
            precoProdutos.add((cont + 1)*200.00);
        }
        //Adiciona preço dos protutos disponiveis no pedido 2
        for (int iter = 0; iter < 10; iter++){
            precoProdutos.add((iter + 1)*150.00);
        }


    }

    public ArrayList<String> getNomeProdutos(){
        return nomeProdutos;
    }

    public ArrayList<Double> getPrecoProdutos(){
        return precoProdutos;
    }

    public void produtosPedido1(){
        System.out.println("Produtos Disponiveis");
        System.out.println("|Produtos|Preço |");
        for (int i = 0;i < 10;i++){
            System.out.println(nomeProdutos.get(i)+"|R$"+precoProdutos.get(i));
        }
    }

    public void produtosPedido2(){
        System.out.println("Produtos Disponiveis");
        System.out.println("|Produtos|Preço |");
        for (int i = 10;i < 20;i++){
            System.out.println(nomeProdutos.get(i)+"|R$"+precoProdutos.get(i));
        }
    }
}
