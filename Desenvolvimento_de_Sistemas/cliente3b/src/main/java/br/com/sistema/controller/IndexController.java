package br.com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // O controller escuta tudo que vem do front-end
public class IndexController {

    @GetMapping("/") // Cria Rota
    public String index(ModelMap modelMap){
        modelMap.addAttribute("nome", "BAtitesta");
        return "index";
    }


}
