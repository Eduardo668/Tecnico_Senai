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

        public void delete(Cliente cliente){
            clienteRepositorio.delete(cliente);
        }
//
//    public List<Cliente> delete(List<Cliente> clientes) {
//        return clienteRepositorio.delete(clientes);
//    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepositorio.findById(id);
    }

}