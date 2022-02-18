package br.com.vendas;

import br.com.vendas.model.Cliente;
import br.com.vendas.model.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.createCliente();
        cliente.loginCliente();



    }
}
