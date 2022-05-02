package br.com.ExercicioHeranca3.model;


public class Cliente extends Pessoa{
    private String email;

    public Cliente(String nome){
        super(nome);
    }

    public Cliente(String nome, String cpf){
        super(nome, cpf);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "--------------\nCliente\n-------------" +
                "\nNome: "+ getNome() +
                "\nCPF: "+ getCpf() +
                "\nEmail: "+ getEmail()+
                "\n------------------------"+
                super.toString();

    }
}
