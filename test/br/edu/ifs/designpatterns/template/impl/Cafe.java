package br.edu.ifs.designpatterns.template.impl;

import br.edu.ifs.designpatterns.template.Bebida;
import java.util.List;
import java.util.ArrayList;

public class Cafe extends Bebida {

    @Override
    protected List<String> prepararBebida() {
        List<String> passos = new ArrayList<>();
        passos.add("Adicionar uma colher de café");
        return passos;
    }
}
