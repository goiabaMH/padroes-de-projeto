package br.edu.ifs.designpatterns.template.impl;

import br.edu.ifs.designpatterns.template.Bebida;
import java.util.List;
import java.util.ArrayList;

public class Cha extends Bebida {

    @Override
    protected List<String> prepararBebida() {
        List<String> passos = new ArrayList<>();
        passos.add("Adicionar um sachê de chá");
        return passos;
    }
}
