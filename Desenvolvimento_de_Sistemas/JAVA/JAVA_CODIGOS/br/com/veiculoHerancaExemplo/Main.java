package br.com.veiculoHerancaExemplo;

import br.com.veiculoHerancaExemplo.model.Carro;

public class Main {
    public static void main(String[] args) {
        Carro cl = new Carro("Nave");
        cl.setMarca("Ferrari");
        cl.setPortas(4);
        System.out.println(cl);
    }
}
