package br.senai.service;

import br.senai.Model.Cliente;
import br.senai.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {



    @Autowired // Autoriza o repositorio a fazer algo
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> findAll(){
        return clienteRepositorio.findAll(Sort.by("nome"));
    }
}