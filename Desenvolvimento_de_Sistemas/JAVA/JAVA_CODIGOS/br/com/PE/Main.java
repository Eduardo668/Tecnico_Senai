package br.com.PE;

import br.com.PE.model.Endereco;
import br.com.PE.model.Pessoa;

public class Main {
    public static void main(String[] args)   {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();
        pessoa.setEndereco(endereco);
        pessoa.setNome("EDUARDO");
        pessoa.setDataNascimento("21/01/2005");

        pessoa.endereco();
    }
}
