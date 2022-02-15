package br.com.aula.exercicos;

public class Veiculo {
    private String placa;
    private int velocidade;

    public int acelerar(int valor){
        velocidade += valor;
        return  velocidade;

    }

    public int freiar(int valor){
        velocidade -= valor;
        return velocidade;
    }
}
