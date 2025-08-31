package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtigoTest {

    @Test
    void testCriacaoArtigo() {
        Autor autor = new Autor("Alan Turing", "Inglês", "Autor tradicional");
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("Tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    void testSetters() {
        Autor autor = new Autor("Inicial", "Inicial", "Usuario");
        Artigo artigo = new Artigo("Titulo Inicial", autor, "Genero Inicial", false);

        artigo.setTitulo("Novo Titulo");
        artigo.setAutor(new Autor("Novo Autor", "Nova Nacionalidade", "Autor tradicional"));
        artigo.setGenero("Novo Genero");
        artigo.setPublicado(true);

        assertEquals("Novo Titulo", artigo.getTitulo());
        assertEquals("Novo Autor", artigo.getAutor().getNome());
        assertEquals("Nova Nacionalidade", artigo.getAutor().getNacionalidade());
        assertEquals("Autor tradicional", artigo.getAutor().getTipo());
        assertEquals("Novo Genero", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}
