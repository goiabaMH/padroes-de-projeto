package br.edu.ifs.designpatterns.builder;

import br.edu.ifs.designpatterns.builder.impl.Computador;

public class Loja {

    private Construtor construtor;

    public Loja(Construtor construtor) {
        this.construtor = construtor;
    }

    public Computador construirNotebook() {
        construtor.reset();
        construtor.setProcessador("Core™ i7-1355U");
        construtor.setHD(512);
        construtor.setRAM(16);
        return construtor.getComputador();
    }

    public Computador construirNotebookGamer() {
        construtor.reset();
        construtor.setProcessador("Core i7-13650HX");
        construtor.setHD(1024);
        construtor.setRAM(16);
        return construtor.getComputador();
    }

    public Computador construirNotebookUltra() {
        construtor.reset();
        construtor.setProcessador("Core Ultra 7 155H");
        construtor.setHD(1024);
        construtor.setRAM(32);
        return construtor.getComputador();
    }
}
