package br.com.aula.model;


import java.util.Scanner;

public class Conta1 {
    public int  numeroAgencia;
    public int numeroConta;
    public int saldo = 2000;

    public void sacar(){
        Scanner scanner = new Scanner(System.in);
        String agenciaNumero;
        String contaNumero;
        int valorSacado;

        System.out.println("------------------");
        System.out.print("Digite o numero da agencia: ");
        agenciaNumero = scanner.next();
        System.out.println("------------------");
        System.out.print("Digite o numero da conta: ");
        contaNumero = scanner.next();
        System.out.println("------------------");
        System.out.print("Quanto você quer sacar: ");
        valorSacado = scanner.nextInt();
        saldo -= valorSacado;
        System.out.println("------------------");
        System.out.println("Saldo atual: "+ saldo);

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
