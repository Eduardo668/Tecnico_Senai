package com.noticias.Noticias.service;

import com.noticias.Noticias.model.Noticia;
import com.noticias.Noticias.repositorie.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaServiceImpl implements NoticiaService{

    @Autowired
    private NoticiaRepository noticiaRepository;

    @Override
    public List<Noticia> findAll() {
        return noticiaRepository.findAll();
    }
}
