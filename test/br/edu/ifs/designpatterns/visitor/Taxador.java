package br.edu.ifs.designpatterns.visitor;

import br.edu.ifs.designpatterns.visitor.impl.Alimento;
import br.edu.ifs.designpatterns.visitor.impl.Cerveja;
import br.edu.ifs.designpatterns.visitor.impl.Cigarro;
import br.edu.ifs.designpatterns.visitor.impl.Vinho;

public interface Taxador {
    double taxa(Alimento alimento);
    double taxa(Cigarro cigarro);
    double taxa(Cerveja cerveja);
    double taxa(Vinho vinho);
}
