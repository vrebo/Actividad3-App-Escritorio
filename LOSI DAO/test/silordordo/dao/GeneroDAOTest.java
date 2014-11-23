/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silordordo.dao;

import org.losi.dao.GeneroDAO;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.losi.bo.Conexion;
import org.losi.bo.Genero;
import org.losi.dao.DataBaseHelper;

/**
 *
 * @author VREBO
 */
public class GeneroDAOTest {

    private GeneroDAO instance;
    private Genero e;
    
    public GeneroDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        DataBaseHelper.setConexion(new Conexion());
        instance = new GeneroDAO();
        e = new Genero("Sci-Fi", "G�nero car�cterizado por el uso de historias futuristas bla bla bla.");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of persistir method, of class GeneroDAO.
     */
    @Test
    public void testPersistir() {
        System.out.println("TEST GeneroDAO persistir");
        assertTrue("Inserci�n exitosa", instance.persistir(e));
    }

    /**
     * Test of actualizar method, of class GeneroDAO.
     */
    @Test
    public void testActualizar() {
        System.out.println("TEST GeneroDAO actualizar");
        e.setNombre("Mexicano");
        e.setDescripcion("Este genero es muy m�xicano.");
        assertTrue(instance.actualizar(e));
    }

    /**
     * Test of eliminar method, of class GeneroDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("TEST GeneroDAO eliminar()");
        instance.persistir(e);
        assertTrue(instance.eliminar(e));
    }

    /**
     * Test of buscarTodos method, of class GeneroDAO.
     */
    @Test
    public void testBuscarTodos() {
        System.out.println("TEST GeneroDAO buscarTodos");
        List<Genero> result = instance.buscarTodos();
        assertNotSame(0,result.size());
    }

    /**
     * Test of buscarPorId method, of class GeneroDAO.
     */
    @Test
    public void testBuscarPorId() {
        System.out.println("TEST CASE buscarPorId");
        Long id = 2L;
        Genero result = instance.buscarPorId(id);
        assertNotNull(result);
    }

}