package com.exemplo;

public class Artigo {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean publicado;

    public Artigo(String titulo, Autor autor, String genero, boolean publicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.publicado = publicado;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isPublicado() {
        return publicado;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPublicado(boolean publicado) {
        this.publicado = publicado;
    }
}

