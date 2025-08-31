package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtigoTest {

    @Test
    void testCriacaoArtigo() {
        Autor autor = new Autor("Jess", "Brasileira", "Feminino");
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals("Jess", artigo.getAutor().getNome());
        assertEquals("Tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    void testSettersArtigo() {
        Autor autor = new Autor("Jess", "Brasileira", "Feminino");
        Artigo artigo = new Artigo("TituloInicial", autor, "GeneroInicial", false);

        artigo.setTitulo("Novo Titulo");
        artigo.setGenero("Novo Genero");
        artigo.setPublicado(true);

        assertEquals("Novo Titulo", artigo.getTitulo());
        assertEquals("Novo Genero", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}
