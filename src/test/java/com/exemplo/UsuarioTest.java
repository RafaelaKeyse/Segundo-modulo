package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testCriacaoUsuario() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
    }

    @Test
    void testSetters() {
        Usuario usuario = new Usuario("Inicial", 0);
        usuario.setNome("NovoNome");
        usuario.setIdade(30);

        assertEquals("NovoNome", usuario.getNome());
        assertEquals(30, usuario.getIdade());
    }
}
