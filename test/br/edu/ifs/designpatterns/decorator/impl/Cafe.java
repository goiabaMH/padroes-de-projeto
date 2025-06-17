package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Cafe implements Component{
	
	public Cafe() {
		
	}
	public double custo() {
		return 4.0;
	}

	public String getDescricao() {
		return "Café";
	}
}
