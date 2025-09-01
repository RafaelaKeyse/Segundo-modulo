package com.exemplo;

public class Autor {
    private String nome;
    private String nacionalidade;
    private String genero; // NOVO
    private PublicavelInterface estrategiaPublicacao;

    // Construtor existente (3 parâmetros)
    public Autor(String nome, String nacionalidade, String genero) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.genero = genero;
    }

    // 🔹 Novo construtor: só com nome
    public Autor(String nome) {
        this.nome = nome;
        this.nacionalidade = ""; // valor padrão vazio
        this.genero = "";        // valor padrão vazio
    }

    // Getters e setters existentes
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Métodos para a estratégia de publicação
    public void setEstrategiaPublicacao(PublicavelInterface estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    public void publicar(String conteudo) {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar(conteudo);
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}
