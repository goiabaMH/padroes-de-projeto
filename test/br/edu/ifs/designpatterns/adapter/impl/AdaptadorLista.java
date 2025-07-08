package br.edu.ifs.designpatterns.adapter.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifs.designpatterns.adapter.Repositorio;
import br.edu.ifs.designpatterns.adapter.RepositorioLista;

public class AdaptadorLista implements Repositorio {

    private RepositorioLista repositorio;

    public AdaptadorLista(RepositorioLista repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Map<String, String> obterAlunos() {
        Map<String, String> mapa = new HashMap<>();
        List<String> linhas = repositorio.recuperarDados();

        if (linhas != null && !linhas.isEmpty()) {
            for (String linha : linhas) {
                String[] partes = linha.split("\t", 2);
                if (partes.length == 2) {
                    String matricula = partes[0].trim();
                    String nome = partes[1].trim();
                    mapa.put(matricula, nome);
                }
            }
        }

        return mapa;
    }
}
