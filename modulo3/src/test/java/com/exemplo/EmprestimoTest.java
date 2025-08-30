package com.exemplo;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {

    @Test
    void testCriacaoEmprestimo() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        assertEquals("Java Basics", emprestimo.getLivro().getTitulo());
        assertEquals("Gabriel", emprestimo.getUsuario().getNome());
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }

    @Test
    void testSetters() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Autor autor1 = new Autor("Autor1", "Pais1");
        Livro livro1 = new Livro("Livro1", autor1, "Cat1", true);
        Usuario usuario1 = new Usuario("Usuario1", 20);

        Emprestimo emprestimo = new Emprestimo(livro1, usuario1, dataRetirada, dataDevolucao);

        Autor autor2 = new Autor("Autor2", "Pais2");
        Livro livro2 = new Livro("Livro2", autor2, "Cat2", false);
        Usuario usuario2 = new Usuario("Usuario2", 25);
        Date novaRetirada = new Date();
        Date novaDevolucao = new Date();

        emprestimo.setLivro(livro2);
        emprestimo.setUsuario(usuario2);
        emprestimo.setDataRetirada(novaRetirada);
        emprestimo.setDataDevolucao(novaDevolucao);

        assertEquals("Livro2", emprestimo.getLivro().getTitulo());
        assertEquals("Usuario2", emprestimo.getUsuario().getNome());
        assertEquals(novaRetirada, emprestimo.getDataRetirada());
        assertEquals(novaDevolucao, emprestimo.getDataDevolucao());
    }
}
