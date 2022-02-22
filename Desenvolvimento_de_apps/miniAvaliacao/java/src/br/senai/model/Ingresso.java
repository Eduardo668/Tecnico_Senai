package br.senai.model;

import java.util.Random;

public class Ingresso {
    public long id;
    public double valor;
    public int qtd;
    public String dataAbertura;
    public int lote;

    public void setIngresso(){
        Random random = new Random();
        this.id = random.nextLong(4000);
        this.valor = 100.00;
        this.dataAbertura = "22/02/2022";
        this.lote = 2;
        this.qtd = 200;

    }

    public void imprimirIngresso(){
        System.out.println("--------------------------");
        System.out.println("  INGRESSO  ");
        System.out.println("---------------------");
        System.out.println("ID: " + this.id);
        System.out.println("---------------------");
        System.out.println("lote: "+ this.lote);
        System.out.println("---------------------");
        System.out.println("Data abertura: "+ this.dataAbertura);
        System.out.println("---------------------");
        System.out.println("Preço: "+ this.valor);
        System.out.println("---------------------");
        System.out.println("Quantidade de ingressos: "+ this.qtd);


    }


}
