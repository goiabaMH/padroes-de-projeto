package br.edu.ifs.designpatterns.mediator.impl;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

import java.util.ArrayList;
import java.util.List;

public class ControladorTrafego implements Mediador {

    private List<Colaborador> colaboradores = new ArrayList<>();
    private List<Aeronave> filaDecolagem = new ArrayList<>();
    private List<Aeronave> filaPouso = new ArrayList<>();
    private Oficina oficina;
    private boolean condicoesFavoraveis = false;

    @Override
    public void registrarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    @Override
    public void notificar(Colaborador remetente, String evento) {
        if (remetente instanceof Aeronave) {
            Aeronave aeronave = (Aeronave) remetente;
            if (evento.equals("solicitarDecolagem")) {
                if (!filaDecolagem.contains(aeronave)) {
                    filaDecolagem.add(aeronave);
                }
            } else if (evento.equals("solicitarPouso")) {
                if (!filaPouso.contains(aeronave)) {
                    filaPouso.add(aeronave);
                }
            }
        }
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public boolean isCondicoesFavoraveis() {
        return condicoesFavoraveis;
    }

    public void setCondicoesFavoraveis(boolean condicoesFavoraveis) {
        this.condicoesFavoraveis = condicoesFavoraveis;
    }

    public String autorizar() {
        // Monta mensagens conforme teste
        StringBuilder sbPouso = new StringBuilder("[");
        for (Aeronave a : filaPouso) {
            sbPouso.append(a.getId()).append(": Pouso autorizado., ");
        }
        if (!filaPouso.isEmpty()) {
            sbPouso.setLength(sbPouso.length() - 2); // remove ultima vírgula e espaço
        }
        sbPouso.append("]");

        StringBuilder sbDecolagem = new StringBuilder("[");
        for (Aeronave a : filaDecolagem) {
            if (oficina != null && oficina.necessitaManutencao(a)) {
                sbDecolagem.append(a.getId()).append(": Decolagem negada - manutenção., ");
            } else {
                sbDecolagem.append(a.getId()).append(": Decolagem autorizada., ");
            }
        }
        if (!filaDecolagem.isEmpty()) {
            sbDecolagem.setLength(sbDecolagem.length() - 2);
        }
        sbDecolagem.append("]");

        // limpa as filas após autorização
        filaDecolagem.clear();
        filaPouso.clear();

        return sbPouso.toString() + "\n" + sbDecolagem.toString();
    }
}
