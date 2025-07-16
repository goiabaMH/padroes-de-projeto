package br.edu.ifs.designpatterns.template.impl;

import br.edu.ifs.designpatterns.template.Bebida;
import java.util.List;
import java.util.ArrayList;

public class Cappuccino extends Bebida {

    @Override
    protected List<String> prepararBebida() {
        List<String> passos = new ArrayList<>();
        passos.add("Adicionar uma colher de café");
        passos.add("Adicionar uma colher de leite em pó");
        passos.add("Adicionar uma colher de chocolate em pó");
        return passos;
    }
}
