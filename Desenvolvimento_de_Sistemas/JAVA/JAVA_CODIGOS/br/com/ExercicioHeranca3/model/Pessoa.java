package br.com.ExercicioHeranca3.model;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = new Endereco();
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setEndereco(String rua, int numero){
        endereco.setRua(rua);
        endereco.setNumero(numero);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\n-------------------"+
                "\nEndereço" +
                "\n-------------------"+
                "\nRua: "+ endereco.getRua()+
                "\nNumero: "+ endereco.getNumero();

    }
}
