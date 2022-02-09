package br.com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Essa classe escuta tudo que vem do front-end
public class IndexController {

    @GetMapping
    public String index(){
        return "index";
    }


}
