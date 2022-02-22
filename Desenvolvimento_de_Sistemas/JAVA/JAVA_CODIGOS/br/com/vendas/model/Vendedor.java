package br.com.vendas.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {
    private final ArrayList<String> produtos = new ArrayList<String>();
    private final ArrayList<Double> preco = new ArrayList<Double>();
    private double vendedorCarteira;

    public void addProducts()  {
        Scanner scanner = new Scanner(System.in);
        String addProd;
        double preco1;
        String resp;
        int a = 0;
        ArrayList<Integer> indexs = new ArrayList<Integer>();
        int indexProdutos;
        int indexPreco;
        while (true) {
            System.out.println("------------------");
            System.out.println(" Cadastrar Produtos");
            System.out.println("------------------");
            System.out.print("Adicionar Produto : ");
            addProd = scanner.next();
            this.produtos.add(addProd);

            indexProdutos = this.produtos.indexOf(addProd);
            System.out.println(indexProdutos);

            System.out.print("Preço: ");
            preco1 = scanner.nextDouble();
            this.preco.add(preco1);
            indexPreco = this.preco.indexOf(preco1);
            indexPreco = this.produtos.indexOf(addProd);
            System.out.println(indexPreco);
            System.out.println("------------------");
            System.out.print("Produtos Cadastrados:");
            for (String pdAdd : produtos) {
                System.out.print(" " + pdAdd + " ");

            }
            for (double preco : preco)

                System.out.print(preco);

            System.out.println("\n---------------------");
            System.out.print("Deseja cadastrar mais produtos? [S ou N]: ");
            resp = scanner.next();
            if (resp.toLowerCase().equals("n"))
                break;

            a += 1;


        }


    }


}
