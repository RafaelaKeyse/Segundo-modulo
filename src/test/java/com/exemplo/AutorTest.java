package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void testCriacaoAutor() {
        // Cria um autor com nome, nacionalidade e tipo
        Autor autor = new Autor("Jess", "Brasileira", "Autor tradicional");
        
        // Verifica se os valores foram atribuídos corretamente
        assertEquals("Jess", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
        assertEquals("Autor tradicional", autor.getTipo());
    }

    @Test
    void testSetters() {
        Autor autor = new Autor("Inicial", "Inicial", "Usuario");

        // Altera os valores usando setters
        autor.setNome("NovoNome");
        autor.setNacionalidade("NovaNacionalidade");
        autor.setTipo("Autor tradicional");

        // Verifica se os valores foram alterados corretamente
        assertEquals("NovoNome", autor.getNome());
        assertEquals("NovaNacionalidade", autor.getNacionalidade());
        assertEquals("Autor tradicional", autor.getTipo());
    }
}
