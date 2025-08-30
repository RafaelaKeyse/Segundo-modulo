package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testCriacaoLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Básico", autor, "Tecnologia", true);

        assertEquals("Java Básico", livro.getTitulo());
        assertEquals("Jess", livro.getAutor().getNome());
        assertEquals("Tecnologia", livro.getCategoria());
        assertTrue(livro.isDisponivel());
    }

    @Test
    void testSetters() {
        Autor autor = new Autor("Autor1", "Pais1");
        Livro livro = new Livro("Titulo1", autor, "Categoria1", true);

        livro.setTitulo("NovoTitulo");
        livro.setCategoria("NovaCategoria");
        livro.setDisponivel(false);

        Autor novoAutor = new Autor("Autor2", "Pais2");
        livro.setAutor(novoAutor);

        assertEquals("NovoTitulo", livro.getTitulo());
        assertEquals("NovaCategoria", livro.getCategoria());
        assertFalse(livro.isDisponivel());
        assertEquals("Autor2", livro.getAutor().getNome());
    }
}
