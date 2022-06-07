package br.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {



    @GetMapping("/")
    public String eventos(){
        return "index";
    }

    @GetMapping("/Eventos")
    public String evento(){
        return "eventos";
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
