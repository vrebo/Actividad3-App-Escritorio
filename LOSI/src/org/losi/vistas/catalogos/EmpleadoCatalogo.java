package org.losi.vistas.catalogos;

import org.losi.vistas.componentes.EmpleadoTableModel;

public class EmpleadoCatalogo extends Catalogo{

    public EmpleadoCatalogo() {
        super("Cat�logo de empleados", "ActualizaCatEmpleado", new EmpleadoTableModel());
    }   
}
