package losi.vistas.catalogos;

import losi.vistas.componentes.GeneroTableModel;

public class GeneroCatalogo extends Catalogo{

    public GeneroCatalogo() {
        super("Cat�logo de generos", "ActualizaCatGenero", new GeneroTableModel());
    }
}
