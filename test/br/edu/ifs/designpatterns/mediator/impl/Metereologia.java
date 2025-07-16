package br.edu.ifs.designpatterns.mediator.impl;

public class Metereologia extends br.edu.ifs.designpatterns.mediator.Colaborador {

    public Metereologia(String id, ControladorTrafego mediador) {
        super(id, mediador);
        ((ControladorTrafego) mediador).setCondicoesFavoraveis(false);
    }

    public void setCondicoesFavoraveis(boolean condicoesFavoraveis) {
        ((ControladorTrafego) mediador).setCondicoesFavoraveis(condicoesFavoraveis);
    }

    public String informarCondicoes() {
        return ((ControladorTrafego) mediador).autorizar();
    }

    @Override
    public String solicitarDecolagem() {
        return "";
    }

    @Override
    public String solicitarPouso() {
        return "";
    }
}
