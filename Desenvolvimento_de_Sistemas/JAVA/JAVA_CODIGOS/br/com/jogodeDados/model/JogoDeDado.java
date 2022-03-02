package br.com.jogodeDados.model;

import java.util.Scanner;


public class JogoDeDado {
    private Dado dadosJogador;
    private Jogador jogador;
    private String dados1;
    private String dados2;
    public void setDadoJogador(Dado dadosJogador) {
        this.dadosJogador = dadosJogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void jogar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("JOGO DE DADOS");
        System.out.println("-------------------");
        System.out.print("Nome Jogador 1: ");
        String nome1 = scanner.nextLine();
        jogador.setNome(nome1);
        System.out.println("-------------------");
        System.out.print("Nome Jogador 2: ");
        String nome2 = scanner.nextLine();
        jogador.setNome(nome2);
        System.out.println("-------------------");
        System.out.print("Deseja iniciar o jogo [S / N]: ");
        String resp = scanner.next();
        if (resp.equalsIgnoreCase("s")){
            while (true){
                dadosJogador.setDadoValue();
                this.dados1 = dadosJogador.getValorFaceDado().toString();
                int valorFinalJogada1 = dadosJogador.getValorFaceDado().get(0) + dadosJogador.getValorFaceDado().get(1);
                jogador.setValorJogada(valorFinalJogada1);

                dadosJogador.deleteValorDados();
                dadosJogador.setDadoValue();

                this.dados2 = dadosJogador.getValorFaceDado().toString();

                int valorFinalJogada2 = dadosJogador.getValorFaceDado().get(0) + dadosJogador.getValorFaceDado().get(1);
                jogador.setValorJogada(valorFinalJogada2);
            }



        }


    }

    public void imprimirJogada() {
        Scanner scanner = new Scanner(System.in);
        int c = 1;
        while(true){
            System.out.println("-----------------------");
            System.out.println(" PARTIDA "+ c);
            System.out.println("-----------------------");
            System.out.println("Valor dos dados: "+dados1);
            System.out.println("JOGADOR 1 "+jogador.getNome().get(0)+":" + jogador.getValorJogada().get(0));
            System.out.println("Valor dos dados: "+dados2);
            System.out.println("JOGADOR 2 "+jogador.getNome().get(1)+":" + jogador.getValorJogada().get(1));
            System.out.println("-----------------------");
            if (jogador.getValorJogada().get(0).equals(7)){
                System.out.println("Jogador 1 "+ jogador.getNome().get(0)+" Venceu!!!!!!!!");
                System.out.println("-----------------------");
                System.out.print("Deseja jogar denovo");
                String resp = scanner.next();
                if (resp.equalsIgnoreCase("n")){
                    break;
                }

            }else if (jogador.getValorJogada().get(1).equals(7)){
                System.out.println("Jogador 2 "+ jogador.getNome().get(1)+" Venceu!!!!!!!!");
                System.out.println("-----------------------");
                System.out.print("Deseja jogar denovo");
                String resp = scanner.next();
                if (resp.equalsIgnoreCase("n")){
                    break;
                }
            }else if (jogador.getValorJogada().get(0).equals(7) && jogador.getValorJogada().get(1).equals(7)){
                System.out.print("Jogador 1 "+ jogador.getNome().get(0)+" e o Jogador 2 "+ jogador.getNome().get(1));
                System.out.println(" EMPATARAM");
                System.out.println("-----------------------");
                System.out.print("Deseja jogar denovo");
                String resp = scanner.next();
                if (resp.equalsIgnoreCase("n")){
                    break;
                }
            }else{
                String resp = scanner.next();
                System.out.println("-----------------------");
                System.out.print("Deseja jogar denovo");
                if (resp.equalsIgnoreCase("n")){
                    break;
                }
            }

        }

    }


}
