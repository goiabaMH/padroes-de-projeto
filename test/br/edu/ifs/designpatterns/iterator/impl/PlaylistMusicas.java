package br.edu.ifs.designpatterns.iterator.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.iterator.Agregador;
import br.edu.ifs.designpatterns.iterator.Iterador;

public class PlaylistMusicas implements Agregador<Musica> {

    private final List<Musica> musicas = new ArrayList<>();

    public void adicionar(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public Iterador<Musica> criarIterador() {
        return new Iterador<Musica>() {
            private int pos = 0;

            @Override
            public boolean temProximo() {
                return pos < musicas.size();
            }

            @Override
            public Musica proximo() {
                return musicas.get(pos++);
            }
        };
    }
}
