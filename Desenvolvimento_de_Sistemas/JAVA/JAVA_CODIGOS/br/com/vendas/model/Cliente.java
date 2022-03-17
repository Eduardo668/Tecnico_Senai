package br.com.vendas.model;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String email;
    private String senha;
    private double carteira;


    public void addCarteira(double valor){
            this.carteira += valor;
    }
    public double getCarteira(){
        return carteira;
    }

    public void createCliente(){
        Scanner scanner = new Scanner(System.in);
        String resp = "";

        while (!resp.toLowerCase().equals("s")) {
            System.out.println("--------------------");
            System.out.println("     CADASTRO");
            System.out.println("--------------------");
            System.out.print("Nome: ");
            this.nome = scanner.next();
            System.out.println("--------------------");
            System.out.print("Email: ");
            this.email = scanner.next();
            System.out.println("--------------------");
            System.out.print("Senha: ");
            this.senha = scanner.next();
            System.out.println("--------------------");
            System.out.print("Você deseja finalizar o cadastro [S ou N]? : ");
            resp = scanner.next();
        }
    }
    public String getNome(){
        return nome;
    }
   
    public double decreaseCarteiraValue(double valor){
        carteira -= valor;
        return carteira;
    }

    public void loginCliente(){
        Scanner scanner = new Scanner(System.in);
        String nomeEmailVerify = "";
        String senhaVerify = "";

        while (true){
            System.out.println("--------------------");
            System.out.println("     LOGIN");
            System.out.println("--------------------");
            System.out.print("Nome ou Email: ");
            nomeEmailVerify = scanner.next();
            if (nomeEmailVerify.equals(this.nome) || nomeEmailVerify.equals(this.email))
                break;
            else
                System.out.println("Nome ou Email invalidos, tente novamente !");

        }
        System.out.println("--------------------");
        while (true){
            System.out.print("Senha: ");
            senhaVerify = scanner.next();
            if(senhaVerify.equals(this.senha))
                break;
            else
                System.out.println("Senha invalida, tente novamente !");

            System.out.println("--------------------");
        }


    }
}
