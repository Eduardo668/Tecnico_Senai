package br.com.vendas;

import br.com.vendas.model.Cliente;
import br.com.vendas.model.Produtos;
import br.com.vendas.model.Vendedor;


public class Main {
    public static void main(String[] args)  {
        Cliente cliente = new Cliente();
        Vendedor vendedor = new Vendedor();
        Produtos produtos = new Produtos(cliente);


        cliente.createCliente();
        cliente.loginCliente();
        produtos.createProducts();
        produtos.buyProducts();



    }
}
