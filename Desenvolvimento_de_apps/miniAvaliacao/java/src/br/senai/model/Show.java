package br.senai.model;

import java.util.Random;
import java.util.Scanner;

public class Show {
    private long id;
    private String cantor;
    private String local;
    private double preco;
    private String data;

    public void imprimir(){
        Random random = new Random();
        this.id = random.nextLong(4000);
        System.out.println("---------------------");
        System.out.println(" INFO SHOW");
        System.out.println("-------------------------");
        System.out.println("ID: "+ this.id);
        System.out.println("-------------------------");
        System.out.println("Cantor: "+ this.cantor);
        System.out.println("-------------------------");
        System.out.println("Local: "+ this.local);
        System.out.println("-------------------------");
        System.out.println("Preço: "+ this.preco);
        System.out.println("-------------------------");
        System.out.println("Data: "+ this.data);
        System.out.println("-------------------------");
    }

    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("   Cadastrar Show");
        System.out.println("----------------------");
        System.out.print("CANTOR: ");
        cantor = scanner.nextLine();
        System.out.println("-------------------------");
        System.out.print("LOCAL: ");
        local = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.print("PREÇO: ");
        preco = Double.parseDouble(scanner.nextLine());
        System.out.println("-------------------------");
        System.out.print("DATA: ");
        data = scanner.nextLine();
        System.out.println("------------------------- \n\n");

    }



}
