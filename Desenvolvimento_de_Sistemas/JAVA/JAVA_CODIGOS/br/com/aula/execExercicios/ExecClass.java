package br.com.aula.execExercicios;

import br.com.aula.model.Cliente;
import br.com.aula.model.Conta;
import br.com.aula.model.Produto;
import br.com.aula.model.Veiculo;

import java.util.Scanner;

public class ExecClass {
    public int version = 1;

    public void executarConta(){
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        String resp;

        System.out.println("---------------------");
        System.out.println("Seu Saldo:" +conta.saldo);
        System.out.print("Você quer sacar ou deposistar [S ou D] : ");
        resp = scanner.next();
        if (resp.equals("S")){
            conta.sacar();
        }
        else{
            conta.depositar();
        }
    }

    public void executarVeiculo(){
        Veiculo veiculo = new Veiculo();
        System.out.println("Acelerando: " + veiculo.acelerar(12));
        System.out.println("Freiando:  " + veiculo.freiar(2));
        System.out.println("Placa: ");
    }

    public void executarCliente(){
        Cliente cliente = new Cliente();

        cliente.setNome("Eduardo");
        cliente.setEmail("eduardosehn20@gmail.com");
        cliente.setIdade(17);
        cliente.setTelefone("48 991589297");

        System.out.println("----------------");
        System.out.println("Nome: "+ cliente.getNome());
        System.out.println("----------------");
        System.out.println("email: "+ cliente.getEmail());
        System.out.println("----------------");
        System.out.println("idade: "+ cliente.getIdade());
        System.out.println("----------------");
        System.out.println("telefone: "+ cliente.getTelefone());
    }

    public void executarProduto(){
        Produto produto = new Produto();
        produto.setPreco(3000.00);
        produto.setNome("RTX 2070");

        System.out.println("Produto "+produto.getNome()+", Preço: "+ produto.getPreco());
    }

}
