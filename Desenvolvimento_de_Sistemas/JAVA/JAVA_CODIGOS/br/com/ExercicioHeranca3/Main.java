package br.com.ExercicioHeranca3;

import br.com.ExercicioHeranca3.model.Cliente;
import br.com.ExercicioHeranca3.model.Pedido;

import java.lang.ref.Cleaner;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setCliente("Eduardo", "133.232.423-45", "eduardo@gmail.com", "Ratones", 108);

        for (int i = 0; i < 5; i++){
            pedido.setItens("Iphone "+ (i+1), 200* (i + 1));
        }

    }

}
