package br.com.aula;

import br.com.aula.execExercicios.ExecClass;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecClass contaExec = new ExecClass();
        Scanner scanner = new Scanner(System.in);
        String resp;
        System.out.println("---------------------------");
        System.out.println("Desenvolvimento de Sistemas - JAVA");
        System.out.println("---------------------------");
        System.out.println("Classes disponiveis: Cliente, Conta, Veiculo, Produto.");
        System.out.println("---------------------------");
        System.out.print("Qual classe quer executar?: ");
        resp = scanner.next();
        System.out.println("---------------------------");

        if (resp.toLowerCase().equals("veiculo")){
            contaExec.executarVeiculo();
        }
        else if (resp.toLowerCase().equals("conta")){
            contaExec.executarConta();
        }
        else if (resp.toLowerCase().equals("cliente")){
            contaExec.executarCliente();
        }
        else if (resp.toLowerCase().equals("produto")){
            contaExec.executarProduto();
        }





    }
}
