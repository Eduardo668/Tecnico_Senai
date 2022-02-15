package br.com.aula.execExercicios;

import br.com.aula.exercicos.Conta;

import java.util.Scanner;

public class ContaExec {
    public int version = 1;

    public void executar(){
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

}
