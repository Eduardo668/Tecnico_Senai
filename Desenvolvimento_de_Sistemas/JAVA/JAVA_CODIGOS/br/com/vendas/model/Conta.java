package br.com.vendas.model;

import java.util.Scanner;

public class Conta extends Cliente {
    final Cliente cliente;

    private int numeroConta;
    private int numeroAgencia;
    private double saldo ;

    public Conta(Cliente cliente){
        saldo = 100000.00;
        this.cliente = cliente;
    }


    public void sacar(){
        Scanner scanner = new Scanner(System.in);
        Cliente carteira = new Cliente();
        String agenciaNumero;
        String contaNumero;
        double valorSacado;
        System.out.println("------------------");
        System.out.print("Digite o numero da agencia: ");
        agenciaNumero = scanner.next();
        System.out.println("------------------");
        System.out.print("Digite o numero da conta: ");
        contaNumero = scanner.next();
        System.out.println("------------------");
        System.out.print("Quanto você quer sacar: ");
        valorSacado = scanner.nextDouble();
        cliente.addCarteira(valorSacado);
        saldo -= valorSacado;
        System.out.println("------------------");
        System.out.println("Saldo atual: "+ saldo);
        System.out.println(cliente.getCarteira());
        System.out.println("------------------");
    }

    public void depositar(){
        Scanner scanner = new Scanner(System.in);
        String agenciaNumero;
        String contaNumero;
        int valorDepositado;
        System.out.println("------------------");
        System.out.print("Digite o numero da agencia: ");
        agenciaNumero = scanner.next();
        System.out.println("------------------");
        System.out.print("Digite o numero da conta: ");
        contaNumero = scanner.next();
        System.out.println("------------------");
        System.out.print("Quanto você quer depositar: ");
        valorDepositado = scanner.nextInt();
        saldo += valorDepositado;
        System.out.println("------------------");
        System.out.println("Saldo atual: "+ saldo);
    }
}
