package br.com.vendas.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos extends Cliente {
    final Cliente cliente;

    public Produtos(Cliente cliente) {
        this.cliente = cliente;
    }

    private ArrayList<String> produtos = new ArrayList<String>();
    private ArrayList<String> carrinho = new ArrayList<String>();
    private ArrayList<Double> precoProdutos = new ArrayList<Double>();

    public void createProducts() {
        produtos.add("PS5 - R$5.000.00");
        produtos.add("XBOX - R$4.000.00");
        produtos.add("TV 50 Polegadas - R$4.500.00");
        produtos.add("Celta Cromado e rebaixado - R$10.000.00");

        //PS5
        precoProdutos.add(5000.00);
        //XBOX
        precoProdutos.add(4000.00);
        //TV
        precoProdutos.add(4500.00);
        //Celta
        precoProdutos.add(10000.00);

    }

    public void buyProducts() {
        Scanner scanner = new Scanner(System.in);
        String respProduto;
        String respFinal;
        double carteira = getCarteira();
        System.out.println("-------------");
        System.out.println("Bem vindo Sr(a) " + getNome() + " a nossa loja.");
        System.out.print("Produtos Disponiveis: ");

        for (String produtos : produtos)
            System.out.print(produtos + ", ");

        System.out.println(" ");
        while (true) {
            System.out.println("-------------");
            System.out.println("Carteira : R$" + carteira);
            System.out.print("Qual produto deseja adicionar ao carrinho: ");
            respProduto = scanner.next();

            for (String products : produtos)
                if (products.equals(respProduto))
                    carrinho.add(respProduto);

            System.out.println("---------------");
            System.out.print("Carrinho: ");
            for (String products : carrinho)
                System.out.println(products + ", ");

            System.out.println("---------------");
            System.out.print("Deseja finalizar a compra ou adicionar mais algum produto: [Fim / Add]: ");
            respFinal = scanner.next();
            if (respFinal.equalsIgnoreCase("fim"))
                for (String products : carrinho)
                    if (products.equals("PS5")){
                        if (carteira < precoProdutos.get(0))
                            System.out.println("Dinheiro insuficiente");
                        decreaseCarteiraValue(5000.00);
                    }
                    else if (products.equals("XBOX")){
                        decreaseCarteiraValue(4000.00);
                    }
                    else if (products.equals("TV 50 Polegadas")){
                        decreaseCarteiraValue(4500.00);
                    }
                    else if (products.equals("Celta Cromado e rebaixado")) {
                        decreaseCarteiraValue(10000.00);
                    }
                break;
        }
    }
}
