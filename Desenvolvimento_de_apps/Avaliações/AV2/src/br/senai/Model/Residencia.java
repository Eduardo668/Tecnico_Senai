package br.senai.Model;

public class Residencia{
    private int id;
    private String endereco;
    private double valor;

    public Residencia(int id, String endereco, double valor){
        this.id = id;
        this.endereco = endereco;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }


    @Override
    public String toString() {
        return "-----------------"+
                "\nId: " + id +
                "\nEndereco: " + endereco +
                "\nvalor: " + valor + "\n";
    }
}
