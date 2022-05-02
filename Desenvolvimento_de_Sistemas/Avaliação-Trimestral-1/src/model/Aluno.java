package model;

public class Aluno {
  private String matricula;
  private String nome;
  private String cpf;
  private String endereco;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno \n" +
               "matricula : "+ matricula +
                "\nNome :" + nome +
                "\ncpf :" + cpf +
                "\nendereco :" + endereco;
    }
}
