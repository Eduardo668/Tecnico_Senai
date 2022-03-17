package com.br.avaliacoes.Questao1.model;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private String data;
    private ArrayList<String> clientes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setClientes(String cliente){
        clientes.add(cliente);
    }


    @Override
    public String toString() {
        return "Nome: "+ getNome()+
                "\nData: "+ getData()+
                "\nClientes: "+String.join(", ", clientes);
    }
}
