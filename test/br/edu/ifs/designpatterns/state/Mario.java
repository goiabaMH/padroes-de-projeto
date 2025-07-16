package br.edu.ifs.designpatterns.state;

public class Mario {

    private MarioEstado estado;

    public Mario() {
        estado = new MarioPequeno(this);
    }

    public String atacar() {
        return estado.atacar();
    }

    public String obterEstado() {
        return estado.obterNome();
    }

    public void pegarCogumelo() {
        estado.pegarCogumelo();
    }

    public void pegarFlor() {
        estado.pegarFlor();
    }

    public void pegarPena() {
        estado.pegarPena();
    }

    public void sofreDano() {
        estado.sofreDano();
    }

    void setEstado(MarioEstado novoEstado) {
        estado = novoEstado;
    }

    private interface MarioEstado {
        String atacar();
        String obterNome();
        void pegarCogumelo();
        void pegarFlor();
        void pegarPena();
        void sofreDano();
    }

    private class MarioPequeno implements MarioEstado {
        private final String nome = "Mario pequeno";
        private final String ataque = "Salto";

        MarioPequeno(Mario mario) {
        }

        public String atacar() {
            return ataque;
        }

        public String obterNome() {
            return nome;
        }

        public void pegarCogumelo() {
            setEstado(new MarioSuper(Mario.this));
        }

        public void pegarFlor() {
            setEstado(new MarioFogo(Mario.this));
        }

        public void pegarPena() {
            setEstado(new MarioVoador(Mario.this));
        }

        public void sofreDano() {
            setEstado(new MarioMorto(Mario.this));
        }
    }

    private class MarioSuper implements MarioEstado {
        private final String nome = "Super Mario";
        private final String ataque = "Super salto";

        MarioSuper(Mario mario) {
        }

        public String atacar() {
            return ataque;
        }

        public String obterNome() {
            return nome;
        }

        public void pegarCogumelo() {
        }

        public void pegarFlor() {
            setEstado(new MarioFogo(Mario.this));
        }

        public void pegarPena() {
            setEstado(new MarioVoador(Mario.this));
        }

        public void sofreDano() {
            setEstado(new MarioPequeno(Mario.this));
        }
    }

    private class MarioFogo implements MarioEstado {
        private final String nome = "Mario de fogo";
        private final String ataque = "Bola de fogo";

        MarioFogo(Mario mario) {
        }

        public String atacar() {
            return ataque;
        }

        public String obterNome() {
            return nome;
        }

        public void pegarCogumelo() {
        }

        public void pegarFlor() {
        }

        public void pegarPena() {
            setEstado(new MarioVoador(Mario.this));
        }

        public void sofreDano() {
            setEstado(new MarioSuper(Mario.this));
        }
    }

    private class MarioVoador implements MarioEstado {
        private final String nome = "Mario voador";
        private final String ataque = "Capa giratória";

        MarioVoador(Mario mario) {
        }

        public String atacar() {
            return ataque;
        }

        public String obterNome() {
            return nome;
        }

        public void pegarCogumelo() {
        }

        public void pegarFlor() {
        }

        public void pegarPena() {
        }

        public void sofreDano() {
            setEstado(new MarioSuper(Mario.this));
        }
    }

    private class MarioMorto implements MarioEstado {
        private final String nome = "Mario morto";

        MarioMorto(Mario mario) {
        }

        public String atacar() {
            throw new IllegalStateException("Mario está sem vida!");
        }

        public String obterNome() {
            return nome;
        }

        public void pegarCogumelo() {
            throw new IllegalStateException("Mario está sem vida!");
        }

        public void pegarFlor() {
            throw new IllegalStateException("Mario está sem vida!");
        }

        public void pegarPena() {
            throw new IllegalStateException("Mario está sem vida!");
        }

        public void sofreDano() {
            throw new IllegalStateException("Mario está sem vida!");
        }
    }
}
