package com.noticias.Noticias.controller;

import com.noticias.Noticias.model.Noticia;
import com.noticias.Noticias.service.NoticiaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticiaControler {

    @Autowired
    private NoticiaServiceImpl noticiaService;

    @GetMapping("/list")
    public ResponseEntity<List<Noticia>> findNotice(){
        return ResponseEntity.ok(noticiaService.findAll());
    }

}
