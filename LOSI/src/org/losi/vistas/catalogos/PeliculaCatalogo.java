package org.losi.vistas.catalogos;

import org.losi.vistas.componentes.PeliculaTableModel;

public class PeliculaCatalogo extends Catalogo{

    public PeliculaCatalogo() {
        super("Cat�logo de Pel�culas", "ActualizaCatPelicula", new PeliculaTableModel());
    }   
}