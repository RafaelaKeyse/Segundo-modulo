package com.exemplo;

import org.junit.jupiter.api.Test;

public class AutorTest {

    @Test
    void testPublicarLivro() {
        Autor autor = new Autor("Rafaela");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar("Livro de teste");
    }

    @Test
    void testPublicarArtigo() {
        Autor autor = new Autor("Rafaela");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar("Artigo de teste");
    }

    @Test
    void testSemEstrategia() {
        Autor autor = new Autor("Rafaela");
        autor.publicar("Teste sem estratégia");
    }
}
