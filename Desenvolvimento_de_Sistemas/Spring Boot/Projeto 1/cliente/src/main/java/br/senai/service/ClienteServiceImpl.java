package br.senai.service;

import br.senai.Model.Cliente;
import br.senai.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.lang.ref.Cleaner;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {



    @Autowired // Autoriza o repositorio a fazer algo
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> findAll(){
        return clienteRepositorio.findAll();
    }

    public Cliente save(Cliente cliente){
        return clienteRepositorio.save(cliente);
    }

    @Override
    public Optional<Cliente> delete() {
        return clienteRepositorio.delete();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepositorio.findById(id);
    }

}