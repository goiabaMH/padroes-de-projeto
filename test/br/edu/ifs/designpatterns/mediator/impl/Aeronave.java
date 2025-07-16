package br.edu.ifs.designpatterns.mediator.impl;

public class Aeronave extends br.edu.ifs.designpatterns.mediator.Colaborador {

    public Aeronave(String id, ControladorTrafego mediador) {
        super(id, mediador);
    }

    @Override
    public String solicitarDecolagem() {
        ControladorTrafego controlador = (ControladorTrafego) mediador;
        controlador.notificar(this, "solicitarDecolagem");

        if (!controlador.isCondicoesFavoraveis()) {
            return id + ": Decolagem negada - condições metereológicas.";
        }
        Oficina oficina = controlador.getOficina();
        if (oficina != null && oficina.necessitaManutencao(this)) {
            return id + ": Decolagem negada - manutenção.";
        }
        return id + ": Decolagem autorizada.";
    }

    @Override
    public String solicitarPouso() {
        ControladorTrafego controlador = (ControladorTrafego) mediador;
        controlador.notificar(this, "solicitarPouso");

        if (!controlador.isCondicoesFavoraveis()) {
            return id + ": Pouso negado - condições metereológicas.";
        }
        return id + ": Pouso autorizado.";
    }
}
