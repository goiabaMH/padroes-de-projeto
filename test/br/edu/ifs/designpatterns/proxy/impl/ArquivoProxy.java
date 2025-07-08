package br.edu.ifs.designpatterns.proxy.impl;

import br.edu.ifs.designpatterns.proxy.Arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ArquivoProxy implements Arquivo {

    private Path caminho;
    private Permissao permissao;

    public ArquivoProxy(String nome, Permissao permissao) {
        this.caminho = Path.of(nome);
        this.permissao = permissao;
    }

    @Override
    public void criar() {
        if (!permissao.podeEscrever())
            throw new IllegalStateException("Acesso negado!");
        try {
            Files.createDirectories(caminho.getParent());
            Files.createFile(caminho);
        } catch (IOException e) {
            // ignora se já existir
        }
    }

    @Override
    public void escrever(String texto) {
        if (!permissao.podeEscrever())
            throw new IllegalStateException("Acesso negado!");
        try {
            Files.writeString(caminho, texto + System.lineSeparator(),
                StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String recuperar() {
        if (!permissao.podeLer())
            throw new IllegalStateException("Acesso negado!");
        try {
            return Files.readString(caminho).stripTrailing();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remover() {
        if (!permissao.podeEscrever())
            throw new IllegalStateException("Acesso negado!");
        try {
            Files.deleteIfExists(caminho);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
