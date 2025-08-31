package com.exemplo;

public class App 
{
    public static void main(String[] args)
    {
        // Criando um autor
        Autor autor = new Autor("Alan Turing", "Inglês", "Autor tradicional");

        // Criando um artigo
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);

        // Imprimindo informações do artigo
        System.out.println("Título: " + artigo.getTitulo());
        System.out.println("Autor: " + artigo.getAutor().getNome());
        System.out.println("Tipo de autor: " + artigo.getAutor().getTipo());
        System.out.println("Gênero: " + artigo.getGenero());
        System.out.println("Publicado: " + artigo.isPublicado());
    }
}
