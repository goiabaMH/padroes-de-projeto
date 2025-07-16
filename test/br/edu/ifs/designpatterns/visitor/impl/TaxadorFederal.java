package br.edu.ifs.designpatterns.visitor.impl;

import br.edu.ifs.designpatterns.visitor.Mercadoria;
import br.edu.ifs.designpatterns.visitor.Taxador;

public class TaxadorFederal implements Taxador {

    @Override
    public double taxa(Alimento alimento) {
        return alimento.getCusto() * 1.11;
    }

    @Override
    public double taxa(Cigarro cigarro) {
        return cigarro.getCusto() * 2.50;
    }

    @Override
    public double taxa(Cerveja cerveja) {
        return cerveja.getCusto() * 1.46;
    }

    @Override
    public double taxa(Vinho vinho) {
        return vinho.getCusto() * 1.60;
    }
}
