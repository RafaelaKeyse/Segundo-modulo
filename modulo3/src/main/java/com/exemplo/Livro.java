package com.exemplo;

public class Livro {
    private String titulo;
    private Autor autor;
    private String categoria;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String categoria, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
