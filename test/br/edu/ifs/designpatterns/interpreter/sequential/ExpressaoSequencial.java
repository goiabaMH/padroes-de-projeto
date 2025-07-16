package br.edu.ifs.designpatterns.interpreter.sequential;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.interpreter.Expressao;

public class ExpressaoSequencial implements Expressao {

    private List<Expressao> expressoes = new ArrayList<>();

    public void addExpressao(Expressao expressao) {
        expressoes.add(expressao);
    }

    @Override
    public void interpretar() {
        for (Expressao e : expressoes) {
            e.interpretar();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("execute:\n");
        for (Expressao e : expressoes) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }
}
