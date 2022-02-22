package br.senai;

import br.senai.model.Ingresso;
import br.senai.model.Show;



public class Main {
    public static void main(String[] args) {
        Show show = new Show();
        Ingresso ingresso = new Ingresso(show);

        show.setInfo();
        show.imprimir();

        ingresso.setIngresso();
        ingresso.imprimirIngresso();

    }
}
