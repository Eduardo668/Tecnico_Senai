package br.com.conta;

import br.com.conta.model.Cliente;
import br.com.conta.model.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        cliente.setConta(conta);
    }

}
