package com.exemplo;

public class EstrategiaPublicacaoLivro implements PublicavelInterface {

    @Override
    public void publicar(String conteudo) {
        System.out.println("Publicando livro: " + conteudo);
    }
}
