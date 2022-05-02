package br.senai.service;

import br.senai.Model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    public List<Cliente> findAll();

    public Cliente save(Cliente cliente);

    public Optional<Cliente> delete();

    public Optional<Cliente> findById(Long id);




}
