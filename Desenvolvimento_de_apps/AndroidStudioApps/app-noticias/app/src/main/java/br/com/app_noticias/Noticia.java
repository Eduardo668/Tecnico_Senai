package br.com.app_noticias;

public class Noticia {

    private String img;
    private String titulo;
    private String data;
    private String nome_autor;
    private String texto;
//    private String button;

    public Noticia(String img, String titulo, String data, String texto, String button) {
        this.img = img;
        this.titulo = titulo;
        this.data = data;
        this.texto = texto;
        //      this.button = button;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
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

    //  public String getButton() {
    //   return button;
    //  }

//  public void setButton(String button) {
//  this.button = button;
//  }
}
