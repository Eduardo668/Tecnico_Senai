package br.senai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/Home")
    public String index(){
        return "index";
    }

    @GetMapping("/Servico")
    public String servico(){
        return "servico";
    }

    @GetMapping("/Contato")
    public String contato(){
        return "contato";
    }
    @GetMapping("/Sobre")
    public String sobre(){
        return "sobre";
    }





}
