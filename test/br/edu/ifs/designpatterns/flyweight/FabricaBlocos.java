package br.edu.ifs.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaBlocos {

    private static final Map<String, Flyweight> tipos = new HashMap<>();

    public static Flyweight obterTipo(String tipo, boolean quebravel, boolean inflamavel, boolean empilhavel) {
        String chave = tipo + "-" + quebravel + "-" + inflamavel + "-" + empilhavel;

        if (!tipos.containsKey(chave)) {
            tipos.put(chave, new BlocoTipo(tipo, quebravel, inflamavel, empilhavel));
        }

        return tipos.get(chave);
    }

    // Classe interna privada para o Flyweight concreto
    private static class BlocoTipo implements Flyweight {
        private String tipo;
        private boolean quebravel;
        private boolean inflamavel;
        private boolean empilhavel;

        public BlocoTipo(String tipo, boolean quebravel, boolean inflamavel, boolean empilhavel) {
            this.tipo = tipo;
            this.quebravel = quebravel;
            this.inflamavel = inflamavel;
            this.empilhavel = empilhavel;
        }

        @Override
        public String getTipo() {
            return tipo;
        }

        @Override
        public boolean isQuebravel() {
            return quebravel;
        }

        @Override
        public boolean isInflamavel() {
            return inflamavel;
        }

        @Override
        public boolean isEmpilhavel() {
            return empilhavel;
        }
    }
}
