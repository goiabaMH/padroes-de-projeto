package br.edu.ifs.designpatterns.proxy;

public interface Arquivo {

	public void criar();

	public void escrever(String texto);

	public String recuperar();

	public void remover();

}
