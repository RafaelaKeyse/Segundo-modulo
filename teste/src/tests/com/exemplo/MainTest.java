package com.exemplo;

public class MainTest {

    public static void main(String[] args) {
        System.out.println("=== Teste: Publicar Livro ===");
        Autor autor = new Autor("Rafaela");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar("Livro de teste");

        System.out.println("\n=== Teste: Publicar Artigo ===");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar("Artigo de teste");

        System.out.println("\n=== Teste: Sem Estratégia ===");
        Autor autor2 = new Autor("Outro Autor");
        autor2.publicar("Conteúdo sem estratégia");
    }
}
