package com.exemplo;

public class Main {
    public static void main(String[] args) {
        // Criamos um autor
        Autor autor = new Autor("Rafaela");

        // Definimos a primeira estratégia: publicar livro
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar("Meu primeiro livro sobre Java!");

        // Mudamos a estratégia para publicar artigo
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar("Meu artigo sobre padrões de projeto em Java!");
    }
}
