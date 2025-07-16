package br.edu.ifs.designpatterns.mediator.impl;

import br.edu.ifs.designpatterns.mediator.Colaborador;

import java.util.HashSet;
import java.util.Set;

public class Oficina extends Colaborador {

    private Set<Aeronave> aeronavesManutencao = new HashSet<>();

    public Oficina(String id, ControladorTrafego mediador) {
        super(id, mediador);
        mediador.setOficina(this);
    }

    public void adicionar(Aeronave aeronave) {
        aeronavesManutencao.add(aeronave);
    }

    public boolean necessitaManutencao(Aeronave aeronave) {
        return aeronavesManutencao.contains(aeronave);
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
