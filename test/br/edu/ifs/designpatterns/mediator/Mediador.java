package br.edu.ifs.designpatterns.mediator;

public interface Mediador {
    void registrarColaborador(Colaborador colaborador);
    void notificar(Colaborador remetente, String evento);
}
