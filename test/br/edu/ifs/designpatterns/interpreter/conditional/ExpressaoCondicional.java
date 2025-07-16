package br.edu.ifs.designpatterns.interpreter.conditional;

import br.edu.ifs.designpatterns.interpreter.Expressao;
import br.edu.ifs.designpatterns.interpreter.relational.ExpressaoRelacional;

public class ExpressaoCondicional implements Expressao {

    private ExpressaoRelacional<?> condicao;
    private Expressao sequencia;

    public ExpressaoCondicional(ExpressaoRelacional<?> condicao, Expressao sequencia) {
        this.condicao = condicao;
        this.sequencia = sequencia;
    }

    @Override
    public void interpretar() {
        if (condicao.avaliar()) {
            sequencia.interpretar();
        }
    }

    @Override
    public String toString() {
        return "se " + condicao.toString() + " então:\n" + sequencia.toString();
    }
}
