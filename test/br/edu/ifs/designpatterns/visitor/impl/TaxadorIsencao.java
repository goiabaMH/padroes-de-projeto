package br.edu.ifs.designpatterns.visitor.impl;

import br.edu.ifs.designpatterns.visitor.Mercadoria;
import br.edu.ifs.designpatterns.visitor.Taxador;

public class TaxadorIsencao implements Taxador {

    @Override
    public double taxa(Alimento alimento) {
        return alimento.getCusto();  // isento
    }

    @Override
    public double taxa(Cigarro cigarro) {
        return cigarro.getCusto() * 2.50; // sem alteração
    }

    @Override
    public double taxa(Cerveja cerveja) {
        return cerveja.getCusto() * 1.15; // redução
    }

    @Override
    public double taxa(Vinho vinho) {
        return vinho.getCusto() * 1.20; // redução
    }
}
