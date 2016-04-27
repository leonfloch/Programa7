package edu.uniandes.ecos.integracion.test;

import edu.uniandes.ecos.integracion.mundo.Archivo;
import edu.uniandes.ecos.integracion.mundo.Cal;
import edu.uniandes.ecos.integracion.mundo.Regresion;
import edu.uniandes.ecos.integracion.mundo.Resultado;
import java.util.LinkedList;
import junit.framework.TestCase;
import org.junit.*;



/**
 * Se definen los cuatro casos de test a probar
 * @author Leonardo Valbuena Calderon
 * @date 19/02/2016
 */
public class CorrelacionTest extends TestCase {
    
    
    private static final String EST_PROXY_SIZE = "data/EstimatedProxySize.txt";
    
    /**
     * datos con la info de: Plan Added and Modified size
     */
    private static final String PLAN_ADD_MODIF_SIZE = "data/PlanAddedandModifiedsize.txt";
    
    /**
     * datos con la info de: Actual Added and Modified Size
     */    
    private static final String ACTUAL_ADD_MOD_SIZE = "data/ActualAddedandModifiedSize.txt";    
    
    /**
     * datos con la info de: Actual Development Hours
     */
    private static final String ACTUAL_DEVEP_HOURS = "data/ActualDevelopmentHours.txt";
    
    /**
     * calse donde se realizan los calculos
     */
    private Regresion reg = new Regresion();
    
    
    /**
     * Test 1 valida el valor de la prediccion calculado
     */
    @Test
    //@METODO
    public void test1() {        
        LinkedList datosx = Archivo.obtenerDatos(EST_PROXY_SIZE);
        LinkedList datosY = Archivo.obtenerDatos(ACTUAL_ADD_MOD_SIZE);
        Resultado result = reg.calcularRegresion(datosx, datosY);
        double esperado = 644.429;        
        assertEquals(esperado, Cal.redondeo(result.getPrediccion(), 3));
    }
    
    /**
     * Test 2 valida el valor de la prediccion calculado
     */
    @Test
    //@METODO
    public void test2() {
        LinkedList datosx = Archivo.obtenerDatos(EST_PROXY_SIZE);
        LinkedList datosY = Archivo.obtenerDatos(ACTUAL_DEVEP_HOURS);
        Resultado result = reg.calcularRegresion(datosx, datosY);
        double esperado = 60.858;        
        assertEquals(esperado, Cal.redondeo(result.getPrediccion(), 3));
    }
    
    /**
     * Test 3 valida el valor de la prediccion calculado
     */
    @Test
    //@METODO
    public void test3() {
        LinkedList datosX = Archivo.obtenerDatos(PLAN_ADD_MODIF_SIZE);
        LinkedList datosY = Archivo.obtenerDatos(ACTUAL_ADD_MOD_SIZE);
        Resultado result = reg.calcularRegresion(datosX, datosY);
        double esperado = 528.4294;        
        assertEquals(esperado, Cal.redondeo(result.getPrediccion(), 4));
    }
    
    /**
     * Test 4 valida el valor de la prediccion calculado
     */
    @Test
    //@METODO
    public void test4() {
        LinkedList datosX = Archivo.obtenerDatos(PLAN_ADD_MODIF_SIZE);
        LinkedList datosY = Archivo.obtenerDatos(ACTUAL_DEVEP_HOURS);
        Resultado result = reg.calcularRegresion(datosX, datosY);
        double esperado = 49.4994;
        assertEquals(esperado, Cal.redondeo(result.getPrediccion(), 4));
    }
}
