package br.edu.ifs.designpatterns.interpreter.terminal;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.interpreter.Expressao;

public class Executavel implements Expressao {

    private Comando comando;

    public Executavel(Comando comando) {
        this.comando = comando;
    }

    @Override
    public void interpretar() {
        comando.executar();
    }

    @Override
    public String toString() {
        return "\tligar " + comando.toString();
    }
}
