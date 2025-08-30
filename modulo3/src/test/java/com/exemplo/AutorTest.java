package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void testCriacaoAutor() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertEquals("Jess", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    void testSetters() {
        Autor autor = new Autor("Inicial", "Inicial");
        autor.setNome("NovoNome");
        autor.setNacionalidade("NovaNacionalidade");

        assertEquals("NovoNome", autor.getNome());
        assertEquals("NovaNacionalidade", autor.getNacionalidade());
    }
}
