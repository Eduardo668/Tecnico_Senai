package br.com.exercicioVeiculo.model;

public abstract class Veiculo {
    private String nome;
    private Marca marca;



    public Veiculo(String nome){
        this.nome = nome;
        this.marca =  new Marca();
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    };

    public void setMarca(String nome, String descricao){
        this.marca.setNome(nome);
        this.marca.setDescricao(descricao);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nnome: " + getNome() +
                "\nmarca: " + marca.getNome() +
                "\nDescrição: "+marca.getDescricao();
    }
}
