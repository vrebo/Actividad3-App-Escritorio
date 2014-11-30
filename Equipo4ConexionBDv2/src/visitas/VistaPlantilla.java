package visitas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.EventListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class VistaPlantilla extends JPanel{
    protected GridBagConstraints gbc;
    protected JFrame ventana;
    
    public VistaPlantilla(){
        gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
    }
    /**
     * Su funci�n es agregar los componentes a la interfaz.
     */
    protected abstract void addComponentes();

    /**
     * Asigna valores a los atributos <code>gridx</code> y <code>gridy</code>
     * que determinan la posici�n del componente que ser� agregado al contenedor
     * con el objeto <code>GridBagConstrains</code> usado para el dise�o de la
     * interfaz en <code>addComponentes()</code>.
     *
     * @param gridx
     * @param gridy
     */
    protected void setGBC(int gridx, int gridy) {
        setGBC(gridx, gridy, gbc.anchor);
    }

    /**
     * Asigna valores a los atributos <code>gridx</code>, <code>gridy</code> y
     * <code>anchor</code> que determinan la posici�n del componente que ser�
     * agregado al contenedor con el objeto <code>GridBagConstrains</code> usado
     * para el dise�o de la interfaz en <code>addComponentes()</code>.
     *
     * @param gridx
     * @param gridy
     * @param anchor
     */
    protected void setGBC(int gridx, int gridy, int anchor) {
        setGBC(gridx, gridy, anchor, gbc.insets);
    }

    /**
     * Asigna valores a los atributos <code>gridx</code>, <code>gridy</code> que
     * determinan la posici�n del componente e <code>insets</code> que determina
     * el "espaciado" entre el componente y el �rea en que se muestra. Estos
     * atributos pertenecen al objeto <code>GridBagConstrains</code> usado para
     * el dise�o de la interfaz en <code>addComponentes()</code>.
     *
     * @param gridx
     * @param gridy
     * @param insets
     */
    protected void setGBC(int gridx, int gridy, Insets insets) {
        setGBC(gridx, gridy, gbc.anchor, insets);
    }

    /**
     * Su funcion es la misma que <code>setGBC(int, int)</code>,
     * <code>setGBC(int, int, int)</code> y
     * <code>setGBC(int, int, Insets)</code> conmbinando sus funciones en un
     * solo m�todo.
     *
     * @param gridx
     * @param gridy
     * @param anchor
     * @param insets
     */
    protected void setGBC(int gridx, int gridy, int anchor, Insets insets) {
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.anchor = anchor;
        gbc.insets = insets;
    }

    /**
     * Modifica las variables <code>gridwith</code> y <code>gridheigth</code>
     * que determinan el n�mero de celdas que ocupar� en ancho y largo el
     * componente en el �rea en que se muestra.
     *
     * @param gridwidth
     * @param gridheigt
     */
    protected void setGBCSize(int gridwidth, int gridheigt) {
        gbc.gridwidth = gridwidth;
        gbc.gridheight = gridheigt;
    }
    public abstract void addEventos(EventListener controlador);
    
    public void setVentana(Ventana ventana){
        this.ventana = ventana;
    }
    
    public void dispose(){
        ventana.dispose();
    };
}
