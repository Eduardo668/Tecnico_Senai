package com.noticias.Noticias.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Noticia {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @NotNull
     @Size(max = 100)
    private String img;
    @NotNull
    @Size(max = 100)
    private String titulo;
    @NotNull
    @Size(max = 100)
    private String data;
    @NotNull
    @Size(max = 600)
    private String texto;

    @NotNull
    @Size(max = 100)
    private String nome_autor;

    public Noticia(String img, String titulo, String data, String texto, String button) {
        this.img = img;
        this.titulo = titulo;
        this.data = data;
        this.texto = texto;

    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


}
