package br.edu.ifs.designpatterns.mediator;

public abstract class Colaborador {
    protected String id;
    protected Mediador mediador;

    public Colaborador(String id, Mediador mediador) {
        this.id = id;
        this.mediador = mediador;
        mediador.registrarColaborador(this);
    }

    public String getId() {
        return id;
    }

    public abstract String solicitarDecolagem();
    public abstract String solicitarPouso();
}
