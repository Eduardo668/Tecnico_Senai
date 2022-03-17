package br.com.jogodeDados.model;

import java.util.ArrayList;
import java.util.Random;

public class Dado {
    private ArrayList<Integer> valorFaceDado = new ArrayList<>();


    public void setDadoValue(){
        Random random = new Random();
        for (int i = 0;i<=1;i++){
            int randomValue = random.nextInt(1, 6);
            valorFaceDado.add(randomValue);
        }
    }

    public void deleteValorDados(){
        valorFaceDado.removeAll(valorFaceDado);
    }

    public ArrayList<Integer> getValorFaceDado() {
        return valorFaceDado;
    }

}
