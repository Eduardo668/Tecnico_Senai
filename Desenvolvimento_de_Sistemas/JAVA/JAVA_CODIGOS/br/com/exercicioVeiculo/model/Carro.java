package br.com.exercicioVeiculo.model;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String nome){
        super(nome);
    }

    public Carro(String nome, int portas){
        super(nome);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return " [Carro] " +
                super.toString()+
                "\nNumero de portas: " + portas;
    }
}
