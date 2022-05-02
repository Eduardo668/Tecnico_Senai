package com.senai.Model;

public class Endereco {
    private int id;
    private String cep;
    private int numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nId: "+ getId() +
                "\nCep: "+ getCep()+
                "\nNumero: "+ getNumero();
    }
}
