package br.edu.ifs.designpatterns.strategy.impl;

import br.edu.ifs.designpatterns.strategy.EstrategiaDesconto;

public class EstrategiaIntegral implements EstrategiaDesconto {

    @Override
    public double aplicarDesconto(double valor) {
        return valor;
    }
}
