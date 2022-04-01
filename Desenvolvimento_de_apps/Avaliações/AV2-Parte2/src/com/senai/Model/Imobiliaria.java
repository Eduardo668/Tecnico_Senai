package com.senai.Model;

import com.senai.Model.Residencia;

import java.util.ArrayList;

public class Imobiliaria {
    private long id;
    private String nome;
    private Endereco endereco;

    private ArrayList<com.senai.Model.Residencia> residencias;
    public ArrayList<com.senai.Model.Residencia> residencias600mil;

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

    public void valorAcima(double valor){
        if (valor >= 600000.00){

        }
    }

    public ArrayList<Residencia> getResidencias600mil(){
        ArrayList<Residencia> res = residencias600mil;
        for (Residencia residencia1 : residencias) {
            if (residencia1.getValor() <= 600000.00) {
                res.add(residencia1);
            }
        }
      ;
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

