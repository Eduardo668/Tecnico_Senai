package br.senai.repository;

import br.senai.Model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRespository extends JpaRepository<Evento, Long> {

}
