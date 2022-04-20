package br.senai.controller;


import br.senai.Model.Cliente;
import br.senai.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.ref.Cleaner;
import java.util.List;

@Controller
public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteService;


    @GetMapping("/cliente/list")
    public String findAll(ModelMap model){
        System.out.println(clienteService.findAll());
        model.addAttribute("value",clienteService.findAll());
        Cliente cliente = new Cliente();

        return "cliente/list";
    }

}
