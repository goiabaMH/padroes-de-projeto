package br.edu.ifs.designpatterns.memento;

import java.util.Stack;
import br.edu.ifs.designpatterns.memento.impl.Jogo.Memento;

public class Armazenador {
    private Stack<Memento> historico = new Stack<>();

    public void armazenar(Memento m) {
        historico.push(m);
    }

    public Memento recuperar() {
        if (historico.isEmpty()) {
            return null;
        }
        return historico.pop();
    }
}
