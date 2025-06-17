package br.edu.ifs.designpatterns.bridge.plat;

import br.edu.ifs.designpatterns.bridge.Plataforma;

public class NintendoSwitch implements Plataforma{

	public int getFPS() {
		return 2;
	}

}
