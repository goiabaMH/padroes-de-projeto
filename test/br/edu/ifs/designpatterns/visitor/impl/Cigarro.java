package br.edu.ifs.designpatterns.visitor.impl;

import br.edu.ifs.designpatterns.visitor.Mercadoria;
import br.edu.ifs.designpatterns.visitor.Taxador;

public class Cigarro implements Mercadoria {
    private final double custo;

    public Cigarro(double custo) {
        this.custo = custo;
    }

    @Override
    public double aceitar(Taxador taxador) {
        return taxador.taxa(this);
    }

    @Override
    public double getCusto() {
        return custo;
    }
}
