package br.edu.ifs.designpatterns.chain;

import br.edu.ifs.designpatterns.chain.impl.Emprestimo;
import br.edu.ifs.designpatterns.chain.impl.RequisicaoEmprestimo;

public interface Analisador {
    void definirSucessor(Analisador sucessor);
    Emprestimo processarRequisição(RequisicaoEmprestimo req);
}
