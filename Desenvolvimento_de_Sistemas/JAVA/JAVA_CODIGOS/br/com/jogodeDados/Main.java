package br.com.jogodeDados;

import br.com.jogodeDados.model.Dado;
import br.com.jogodeDados.model.Jogador;
import br.com.jogodeDados.model.JogoDeDado;

public class Main {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Jogador jogador = new Jogador();
        JogoDeDado jogoDeDado = new JogoDeDado();
        jogoDeDado.setDadoJogador(dado);
        jogoDeDado.setJogador(jogador);

        jogoDeDado.jogar();
        jogoDeDado.imprimirJogada();



    }






}
