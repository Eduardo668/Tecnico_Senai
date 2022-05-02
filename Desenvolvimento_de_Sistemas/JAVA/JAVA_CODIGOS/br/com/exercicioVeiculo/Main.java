package br.com.exercicioVeiculo;

import br.com.exercicioVeiculo.model.Caminhao;
import br.com.exercicioVeiculo.model.Carro;
import br.com.exercicioVeiculo.model.Marca;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Nave", 4);
        carro.setMarca("VOLVO", "TOP DE LINHA");
        System.out.println(carro);

        Caminhao caminhao = new Caminhao("Truck", 2);
        caminhao.setMarca("Mercedes","madsafsdaf");
        System.out.println(caminhao);



    }
}
