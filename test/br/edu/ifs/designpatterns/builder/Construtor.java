package br.edu.ifs.designpatterns.builder;

import br.edu.ifs.designpatterns.builder.impl.Computador;

public interface Construtor {
    void reset();
    void setProcessador(String processador);
    void setHD(int hd);
    void setRAM(int ram);
    Computador getComputador();
}
