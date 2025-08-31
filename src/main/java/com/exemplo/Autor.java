package com.exemplo;

public class Autor {
    private String nome;
    private String nacionalidade;
    private String tipo; // novo campo: "Usuario" ou "Autor tradicional"

    public Autor(String nome, String nacionalidade, String tipo) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.tipo = tipo;
    }

    // getters
    public String getNome() { return nome; }
    public String getNacionalidade() { return nacionalidade; }
    public String getTipo() { return tipo; }

    // setters
    public void setNome(String nome) { this.nome = nome; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
