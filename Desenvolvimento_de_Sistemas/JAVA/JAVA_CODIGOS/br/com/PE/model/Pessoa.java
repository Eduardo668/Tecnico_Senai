package br.com.PE.model;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereco endereco;

//    public Pessoa(Endereco endereco) {
//        this.endereco = endereco;
//    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void endereco(){
        endereco.setRua("SERVIDÃO ISOLINA MARIA MACHADO");
        endereco.setBairro("RATONES");
        endereco.setCidade("Floripa");
        endereco.setNumero(108);
        System.out.println("------------------------------------");
        System.out.println("INFO USER");
        System.out.println("-----------------------------------");
        System.out.println("NOME: "+ nome);
        System.out.println("-----------------------------------");
        System.out.println("DATA DE NASCIMENTO: "+ dataNascimento);
        System.out.println("-----------------------------------");
        System.out.println("ENDEREÇO");
        System.out.println("-----------------------------------");
        System.out.println("RUA: "+endereco.getRua());
        System.out.println("-----------------------------------");
        System.out.println("BAIRRO: "+endereco.getBairro());
        System.out.println("-----------------------------------");
        System.out.println("CIDADE: "+endereco.getCidade());
        System.out.println("-----------------------------------");
        System.out.println("NUMERO: "+endereco.getNumero());
        System.out.println("----------------------------------");
    }
}
