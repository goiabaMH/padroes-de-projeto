package br.edu.ifs.designpatterns.iterator.impl;

public class Musica {
    private String nome;
    private String artista;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Musica)) return false;
        Musica outra = (Musica) o;
        return nome.equals(outra.nome) && artista.equals(outra.artista);
    }

    @Override
    public int hashCode() {
        return nome.hashCode() * 31 + artista.hashCode();
    }
}
