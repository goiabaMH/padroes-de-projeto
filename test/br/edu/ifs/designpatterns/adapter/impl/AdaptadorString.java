package br.edu.ifs.designpatterns.adapter.impl;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifs.designpatterns.adapter.Repositorio;
import br.edu.ifs.designpatterns.adapter.RepositorioString;

public class AdaptadorString implements Repositorio {

    private RepositorioString repositorio;

    public AdaptadorString(RepositorioString repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Map<String, String> obterAlunos() {
        Map<String, String> mapa = new HashMap<>();
        String dados = repositorio.recuperarDados();

        if (dados != null && !dados.isBlank()) {
            // Cada linha é separada por "\n"
            String[] linhas = dados.split(";");
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
