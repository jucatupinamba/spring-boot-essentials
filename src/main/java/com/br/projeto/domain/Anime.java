package com.br.projeto.domain;

public class Anime {

    private String name;

    public Anime(final String name) {
        this.name = name;
    }
    public Anime(){}

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
