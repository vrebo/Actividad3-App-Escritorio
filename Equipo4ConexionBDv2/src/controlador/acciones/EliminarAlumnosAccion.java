package controlador.acciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.dao.AlumnoDAO;
import visitas.VistaPlantilla;

public class EliminarAlumnosAccion extends Accion {

    @Override
    public void ejecutar(VistaPlantilla vista) {
        ImageIcon icono = new ImageIcon(getClass().getResource(
                "/recursos/imagenes/GurusHint.png"));
        int opcion = JOptionPane.showConfirmDialog(vista, "Est� seguro de que desea eliminar todos los datos?", "Mensaje de confirmaci�n", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icono);
        if (opcion == JOptionPane.OK_OPTION) {
            AlumnoDAO.eliminaTodosLosAlumnos();
        }
    }

}
