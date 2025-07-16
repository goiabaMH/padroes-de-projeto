package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class AnalistaCredito implements Analisador {

    private Analisador sucessor;

    @Override
    public void definirSucessor(Analisador sucessor) {
        this.sucessor = sucessor;
    }

    @Override
    public Emprestimo processarRequisição(RequisicaoEmprestimo req) {
        if (req.getValor() > 0.3 * req.getRenda()) {
            throw new IllegalStateException("Analista de crédito: Reprovado! Renda insuficiente.");
        }

        if (sucessor != null) {
            return sucessor.processarRequisição(req);
        }

        return null;
    }
}
