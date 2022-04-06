package br.com.factech.model;

public class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private Endereco endereco;
    private String formaDePagamentoUtilizada;

    public Usuario(){
        this.endereco = new Endereco();

    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getFormaDePagamentoUtilizada() {
        return formaDePagamentoUtilizada;
    }

    public void setFormaDePagamentoUtilizada(String formaDePagamentoUtilizada) {
        this.formaDePagamentoUtilizada = formaDePagamentoUtilizada;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
