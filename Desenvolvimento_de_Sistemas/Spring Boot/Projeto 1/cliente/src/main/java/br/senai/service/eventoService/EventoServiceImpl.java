package br.senai.service.eventoService;

import br.senai.Model.Evento;
import br.senai.repository.EventoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRespository eventoRespository;



    @Override
    public List<Evento> findAllEventos() {
        return eventoRespository.findAll();
    }

    @Override
    public Evento saveEvento(Evento evento) {
        return eventoRespository.save(evento);
    }
}
