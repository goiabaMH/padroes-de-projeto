package br.edu.ifs.designpatterns.memento.impl;

public class Jogo {
    private int saude;
    private int vidas;

    public Jogo() {
        this.saude = 100;
        this.vidas = 3;
    }

    public void causarDano(int dano) {
        if (dano >= saude) {
            vidas--;
            if (vidas == 0) {
                throw new IllegalStateException("Fim de Jogo");
            }
            saude = 100;
            int restoDano = dano - saude;
            if (restoDano > 0) {
                causarDano(restoDano);
            }
        } else {
            saude -= dano;
        }
    }

    public Memento salvar() {
        return new Memento(saude, vidas);
    }

    public void restaurar(Memento m) {
        if (m == null) {
            throw new IllegalStateException("Histórico vazio");
        }
        this.saude = m.getSaude();
        this.vidas = m.getVidas();
    }

    @Override
    public String toString() {
        return String.format("{saúde: %d, vidas: %d}", saude, vidas);
    }

    public static class Memento {
        private final int saude;
        private final int vidas;

        public Memento(int saude, int vidas) {
            this.saude = saude;
            this.vidas = vidas;
        }

        public int getSaude() {
            return saude;
        }

        public int getVidas() {
            return vidas;
        }
    }
}
