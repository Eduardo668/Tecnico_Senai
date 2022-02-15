package br.com.aula.model;

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

    // Esse metodo transforma em String
    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
