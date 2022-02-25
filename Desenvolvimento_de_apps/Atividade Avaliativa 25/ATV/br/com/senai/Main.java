package br.com.senai;

import br.com.senai.model.Funcionario;
import br.com.senai.model.Pessoa;
import br.com.senai.model.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Retangulo retangulo = new Retangulo();
        Pessoa pessoa = new Pessoa();
        int opcao;
        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Classe Funcionario");
            System.out.println("Opção 2 - Classe Pessoa");
            System.out.println("Opção 3 - Classe Retangulo");
            System.out.println("Opção 4 - Sair do programa");
            System.out.println("----------------------------");

            System.out.print("Digite aqui sua opção: ");
            opcao =  sc.nextInt();
            System.out.println("--------------------\n--------------------");
            if (opcao == 1){
                funcionario.setFuncionario();
                funcionario.setSalario();
                System.out.println(funcionario);
            }else if (opcao == 2){
                pessoa.setNome();
                pessoa.setIdade();
                System.out.println(pessoa);
            }
            else if (opcao == 3){
                System.out.print("Digite altura: ");
                double altura = sc.nextDouble();
                System.out.print("Digite largura: ");
                double largura = sc.nextDouble();
                retangulo.setAltura(altura);
                retangulo.setLargura(largura);
                System.out.println(retangulo);
            }
        }while(opcao != 4);


    }
}
