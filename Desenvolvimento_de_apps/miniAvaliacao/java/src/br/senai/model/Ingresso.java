package br.senai.model;

import java.util.Random;

public class Ingresso extends Show {
    final Show show;
    public Ingresso(Show show){
        this.show = show;
    }


    public long id;
    public double valor;
    public int qtd;
    public String dataAbertura;
    public int lote;

    public void setIngresso(){
        Random random = new Random();
        this.id = random.nextLong(4000);
        this.valor = show.preco;
        this.dataAbertura = show.data;
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
        System.out.println("Preço: R$"+ this.valor);
        System.out.println("---------------------");
        System.out.println("Quantidade de ingressos: "+ this.qtd);


    }


}
