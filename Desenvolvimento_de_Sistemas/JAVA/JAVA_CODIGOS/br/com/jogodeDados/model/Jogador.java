package br.com.jogodeDados.model;

import java.util.ArrayList;

public class Jogador {
    private ArrayList<String> nome = new ArrayList<>();
    private ArrayList<Integer> valorJogada = new ArrayList<>();

    public void setNome(String nome) {
        this.nome.add(nome);
    }

    public void setValorJogada(int valorJogada) {
        this.valorJogada.add(valorJogada);
    }



    public ArrayList<String> getNome() {
        return nome;
    }

    public ArrayList<Integer> getValorJogada() {
        return valorJogada;

    }
}
