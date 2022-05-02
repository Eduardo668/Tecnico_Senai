package br.senai.controller;


import br.senai.Model.Cliente;
import br.senai.repository.ClienteRepositorio;
import br.senai.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.lang.ref.Cleaner;
import java.util.List;
import java.util.Optional;

@Controller
public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteService;


    @GetMapping("/cliente/list")
    public String findAll(Model model){
        System.out.println(clienteService.findAll());

        model.addAttribute("value", clienteService.findAll());



        return "cliente/list";
    }

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @GetMapping("/cliente/list/delete{id}")
    public String delete(@PathVariable("id") long id){
        Optional<Cliente> clienteOpt = clienteService.findById(id);
        if(clienteOpt.isEmpty()){
            throw new IllegalArgumentException("Pessoa invalida");
        }
        clienteService.delete(clienteOpt.get());
        return "redirect:/cliente/list";
    }

}
