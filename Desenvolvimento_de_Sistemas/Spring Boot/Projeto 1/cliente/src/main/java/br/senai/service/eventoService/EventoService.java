package br.senai.service.eventoService;

import br.senai.Model.Evento;

import java.util.List;

public interface EventoService {

    public List<Evento> findAllEventos();
    public Evento saveEvento(Evento evento);
}
