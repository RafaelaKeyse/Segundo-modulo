package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testCriacaoLivro() {
        Autor autor = new Autor("Jess", "Brasileira", "Feminino");
        Livro livro = new Livro("Java Básico", autor, "Tecnologia");
        assertEquals("Java Básico", livro.getTitulo());
        assertEquals("Jess", livro.getAutor().getNome());
        assertEquals("Tecnologia", livro.getCategoria());
        assertTrue(livro.isDisponivel());
    }

    @Test
    void testSetters() {
        Autor autor = new Autor("Autor1", "Pais1", "Masculino");
        Livro livro = new Livro("Livro1", autor, "Categoria1");

        Autor novoAutor = new Autor("Autor2", "Pais2", "Feminino");
        livro.setTitulo("NovoTitulo");
        livro.setCategoria("NovaCategoria");
        livro.setDisponivel(false);
        livro.setAutor(novoAutor);

        assertEquals("NovoTitulo", livro.getTitulo());
        assertEquals("NovaCategoria", livro.getCategoria());
        assertFalse(livro.isDisponivel());
        assertEquals("Autor2", livro.getAutor().getNome());
    }
}
