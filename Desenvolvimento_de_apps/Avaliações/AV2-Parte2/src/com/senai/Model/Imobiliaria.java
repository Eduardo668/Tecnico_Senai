package com.senai.Model;

import com.senai.Model.Residencia;

import java.util.ArrayList;

public class Imobiliaria {
    private long id;
    private String nome;
    private Endereco endereco;

    private ArrayList<com.senai.Model.Residencia> residencias;
    private ArrayList<com.senai.Model.Residencia> residencias600mil;

    public Imobiliaria(String nome, long id, ArrayList<com.senai.Model.Residencia> residencias, int idEndereco,int numeroEndereco, String cep ){
        this.nome = nome;
        this.id = id;
        this.residencias = residencias;
        this.endereco = new Endereco();
        endereco.setId(idEndereco);
        endereco.setCep(cep);
        endereco.setNumero(numeroEndereco);
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Residencia> getResidencias() {
        return residencias;
    }



    public void setResidencias600mil(ArrayList<Residencia> residencia7, double valor){
       this.residencias600mil = residencia7;
        residencias600mil.removeIf(residencia -> residencia.getValor() <= valor);

    }


    public ArrayList<Residencia> getResidencias600mil(){
        return residencias600mil;
    }

    @Override
    public String toString() {
        return "Id: "+ getId()+
                "\nNome: "+ getNome()+
                "\n----------------"+
                "\nEndereço Imobiliaria"+
                "\n----------------"+
                 endereco + "\n";



    }
}

