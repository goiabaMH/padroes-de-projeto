package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class Gerente implements Analisador {

    @Override
    public void definirSucessor(Analisador sucessor) {
    }

    @Override
    public Emprestimo processarRequisição(RequisicaoEmprestimo req) {
        return new Emprestimo(req.getValor());
    }
}
