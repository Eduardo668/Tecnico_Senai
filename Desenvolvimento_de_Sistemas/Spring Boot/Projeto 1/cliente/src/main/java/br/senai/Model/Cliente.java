package br.senai.Model;


import org.hibernate.mapping.PrimaryKey;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity(name ="cliente") // Define que essa classe é uma entidade do banco de dados
public class Cliente {

    @Id // Define que o atributo é uma primary key dessa tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera os ID's
    private Long id;


    @Column(name = "nome") // Nomeia a coluna no banco de dados
    @NotNull
    @Size(max = 100) // Define a quantidade de caracteres que poderam ser armazenados (tipo o varchar(100))
    private String nome;


    @Size(max = 100)
    private String email;


    @Size(max = 25)
    private String cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
