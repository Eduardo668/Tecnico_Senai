package br.com.senai.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Pessoa {
    private ArrayList<String> nomes = new ArrayList<>();
    private ArrayList<Integer> idade = new ArrayList<>();


    public void setNome() {
        this.nomes.add("João");
        this.nomes.add("Maria");
    }

    public void setIdade(){
        this.idade.add(20);
        this.idade.add(24);
    }
    public String verify(){
        if (idade.get(0) > idade.get(1)){
            return nomes.get(0);
        }
        else{
            return nomes.get(1);
        }
    }



    @Override
    public String toString() {
        return "Pessoa 1 \n" +
                "Nome: " + nomes.get(0) + "\nIdade: "+ idade.get(0) +
                "\n-------------------\nPessoa 2 \n" +
                "Nome: "+ nomes.get(1) + "\nIdade: " + idade.get(1) +
                "\n-------------------\nPessoa mais velha: "+ verify() +
                "\n-------------------\n-------------------";
    }
}
