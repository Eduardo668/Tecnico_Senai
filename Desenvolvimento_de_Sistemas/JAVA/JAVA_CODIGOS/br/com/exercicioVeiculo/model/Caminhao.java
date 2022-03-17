package br.com.exercicioVeiculo.model;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String nome){
        super(nome);
    }

    public Caminhao(String nome, int eixos){
        super(nome);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return "\n[Caminhao]" +
                super.toString()+
                "\nNumero Eixos: " + eixos;
    }
}
