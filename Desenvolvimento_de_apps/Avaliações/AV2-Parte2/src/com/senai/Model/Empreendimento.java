package com.senai.Model;

public class Empreendimento {
    private Endereco endereco;
    private double valor;

    public Empreendimento(double valor){
        this.valor = valor;
        this.endereco = new Endereco();
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(int id, int numero, String cep){
        endereco.setNumero(numero);
        endereco.setCep(cep);
        endereco.setId(id);
    }

    public double getValor() {
        return valor;
    }

}
