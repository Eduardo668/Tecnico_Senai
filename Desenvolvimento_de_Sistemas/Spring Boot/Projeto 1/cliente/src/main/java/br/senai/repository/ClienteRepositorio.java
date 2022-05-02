package br.senai.repository;

import br.senai.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

    // Seleciona apenas uma coluna do banco de dados, equivalente ao comando SELECT do SQL
    public Cliente findByCpf(String cpf);
    public Cliente findByEmail(String email);

    // Seleciona duas colunas do banco de dados, equivalente ao SELECT
    public Cliente findByCpfAndEmail(String cpf, String email);

    public List<Cliente> findByEmailLike(String email);
}
