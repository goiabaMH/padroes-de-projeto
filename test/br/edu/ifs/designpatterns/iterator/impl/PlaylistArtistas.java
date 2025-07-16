package br.edu.ifs.designpatterns.iterator.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.ifs.designpatterns.iterator.Agregador;
import br.edu.ifs.designpatterns.iterator.Iterador;

public class PlaylistArtistas implements Agregador<Musica> {

    private final List<Musica> musicas = new ArrayList<>();

    public void adicionar(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public Iterador<Musica> criarIterador() {
        List<Musica> ordenadas = musicas.stream()
                .sorted(Comparator.comparing(Musica::getArtista))
                .collect(Collectors.toList());

        return new Iterador<Musica>() {
            private int pos = 0;

            @Override
            public boolean temProximo() {
                return pos < ordenadas.size();
            }

            @Override
            public Musica proximo() {
                return ordenadas.get(pos++);
            }
        };
    }
}
