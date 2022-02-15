package br.com.aula;

import br.com.aula.execExercicios.ContaExec;
import br.com.aula.exercicos.Conta;
import br.com.aula.exercicos.Veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaExec contaExec = new ContaExec();
        contaExec.executar();

        Veiculo veiculo = new Veiculo();

        veiculo.acelerar(12);
        veiculo.freiar(2);


    }
}
