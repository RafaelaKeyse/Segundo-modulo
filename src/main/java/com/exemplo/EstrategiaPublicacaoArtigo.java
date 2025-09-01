package com.exemplo;

public class EstrategiaPublicacaoArtigo implements PublicavelInterface {

    @Override
    public void publicar(String conteudo) {
        System.out.println("Publicando artigo: " + conteudo);
    }
}
