package br.com.veiculoHeranca.model;

public class Carro extends Veiculo{
    private int portas;
    public Carro(String nome){
        super(nome); // super envia para classe pai Veiculo
    }

    public void setPortas(int portas){
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public String toString() {
        return "CARRO :"+
                super.toString()+
                "\nQuantidade de portas - "+ getPortas() ;
    }
}
