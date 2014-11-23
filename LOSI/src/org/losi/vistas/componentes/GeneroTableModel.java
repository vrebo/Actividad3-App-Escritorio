package org.losi.vistas.componentes;

import org.losi.modelos.bo.Genero;

public class GeneroTableModel extends MyTableModel<Genero>{

    public GeneroTableModel() {
        columnNames = new String[]{
            "ID",
            "Nombre",
            "Descripci�n"
        };
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return data.get(rowIndex).getIdGenero();
            case 1:
                return data.get(rowIndex).getNombre();
            default:
                return data.get(rowIndex).getDescripcion();
        }
    }
}
