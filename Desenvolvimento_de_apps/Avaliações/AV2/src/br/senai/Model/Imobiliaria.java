package br.senai.Model;

import java.util.ArrayList;

public class Imobiliaria {
    private long id;
    private String nome;

    private ArrayList<Residencia> residencias;

    public Imobiliaria(String nome, long id, ArrayList<Residencia> residencias){
        this.nome = nome;
        this.id = id;
        this.residencias = residencias;
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

    @Override
    public String toString() {
           return "Id: "+ getId()+
                "\nNome: "+ getNome()+
                   "\n----------------";



    }
}
