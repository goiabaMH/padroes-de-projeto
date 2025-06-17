package br.edu.ifs.designpatterns.bridge.obj;

import br.edu.ifs.designpatterns.bridge.ObjetoGrafico;
import br.edu.ifs.designpatterns.bridge.Plataforma;

public class HollowKnight extends ObjetoGrafico {
	

	public HollowKnight(Plataforma plataforma) {
		super(plataforma);
	}

	public int getVelocidade() {
		return 15;
	}
		
}
