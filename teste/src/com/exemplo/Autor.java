package com.exemplo;

public class Autor {
    private String nome;
    private PublicavelInterface estrategiaPublicacao;

    // Construtor
    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstrategiaPublicacao(PublicavelInterface estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    public void publicar(String conteudo) {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar(conteudo);
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}
