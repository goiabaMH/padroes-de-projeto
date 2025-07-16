package br.edu.ifs.designpatterns.template;

import java.util.ArrayList;
import java.util.List;

public abstract class Bebida {

    public final List<String> obterPreparo() {
        List<String> preparo = new ArrayList<>();
        preparo.add("Preparar uma xícara");
        preparo.addAll(prepararBebida());
        preparo.add("Adicionar água quente");
        return preparo;
    }

    protected abstract List<String> prepararBebida();
}
