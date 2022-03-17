package com.br.avaliacoes.Questao2;

import com.br.avaliacoes.Questao2.model.Pedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Scanner sc = new Scanner(System.in);

        // Serve para pegar a data atual do Sistema
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String data = dtf.format(LocalDateTime.now());

        // Inicio formulario dos Pedidos
        System.out.println("----------------------------");
        System.out.println("Lojão de Smartphones");
        System.out.println("----------------------------");
        for (int i = 0; i < 2; i++){
            System.out.println("Produtos "+(i+1)+"° Leva");
            System.out.println("----------------------------");

            //Printa os produtos disponiveis
            if (i == 0){
                pedido1.produtosDisponiveis1();
            }
            else{
                pedido2.produtosDisponives2();
            }
            System.out.println("----------------------------");
            System.out.print("Qual produto desejas: ");
            String prod = sc.nextLine();

            System.out.println("----------------------------");
            System.out.print("Quantidade de produtos: ");
            int qtd = Integer.parseInt(sc.nextLine());
            System.out.println("----------------------------");

            // Envia para a classe e realiza o calculo entre o preço e a quantidade do produto
            if (i == 0){
                pedido1.setProdutoBuy(prod, qtd, data);
                pedido1.faturarPedido();
            }else{
                pedido2.setProdutoBuy(prod, qtd, data);
                pedido2.faturarPedido();
            }

            if (i == 0){
                System.out.println("\n-------------------------");
                System.out.println("         PEDIDOS");
                System.out.println("-------------------------");
                System.out.println("Pedido "+(i + 1));
                System.out.println(pedido1);
                System.out.println("----------------------------");
                System.out.print("Digite qualquer coisa para continuar: ");
                String resp = sc.nextLine();
            }else{
                System.out.println("\n-------------------------");
                System.out.println("         PEDIDOS");
                System.out.println("-------------------------");
                System.out.println("Pedido 1");
                System.out.println(pedido1+"    ");
                System.out.println("-------------------------");
                System.out.println("Pedido 2");
                System.out.println(pedido2);
            }
            System.out.println("----------------------------\n");

        }



    }
}
