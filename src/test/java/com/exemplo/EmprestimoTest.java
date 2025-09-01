package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class EmprestimoTest {

    @Test
    void testCriacaoEmprestimo() {
        Autor autor = new Autor("Alan Turing", "Inglês", "Masculino");
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);

        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        assertEquals("Java Basics", emprestimo.getLivro().getTitulo());
        assertEquals("Gabriel", emprestimo.getUsuario().getNome());
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }

    @Test
    void testAtualizacaoEmprestimo() {
        Autor autor1 = new Autor("Autor1", "Pais1", "Masculino");
        Livro livro1 = new Livro("Livro1", autor1, "Categoria1");
        Usuario usuario1 = new Usuario("Usuario1", 20);

        Date retirada1 = new Date();
        Date devolucao1 = new Date();

        Emprestimo emprestimo = new Emprestimo(livro1, usuario1, retirada1, devolucao1);

        Autor autor2 = new Autor("Autor2", "Pais2", "Feminino");
        Livro livro2 = new Livro("Livro2", autor2, "Categoria2");
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
