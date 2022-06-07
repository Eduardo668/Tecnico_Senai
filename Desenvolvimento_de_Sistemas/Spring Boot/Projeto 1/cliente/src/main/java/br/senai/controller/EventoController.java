package br.senai.controller;


import br.senai.Model.Evento;
import br.senai.repository.EventoRespository;
import br.senai.service.eventoService.EventoService;
import br.senai.service.eventoService.EventoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventoController {

    @Autowired
    private EventoServiceImpl eventoService;

    @GetMapping("/evento/list")
    public String listaDeEvento(Model model){
        model.addAttribute("eventos", eventoService.findAllEventos());
        return "evento/list";
    }

    @PostMapping("/eventos/add")
    public String salvarEventos(@ModelAttribute("eventos") Evento evento){
        try {
            eventoService.saveEvento(evento);
        return "redirect:/eventos/list";
        }catch (Exception e){
            System.out.println(e);
            return "redirect:/eventos/list";
        }
    }

}
