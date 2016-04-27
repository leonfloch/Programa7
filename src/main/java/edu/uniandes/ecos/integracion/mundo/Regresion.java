package edu.uniandes.ecos.integracion.mundo;

import java.util.LinkedList;

/**
 * Clase principal en la cual se coordinan los calculos de la Regresion lineal
 * @author Leonardo Valbuena Calderon
 * @date 29/02/2016
 */
public class Regresion {
    
    /**
     * datos con la info de: Estimated Proxy Size
     */
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
     * indica el tamano del programa 11
     */
    private static final double ESTIMACION = 386;
    
    

    /**
     * Se toma la informacion de los archivos y se realiza el calculos
     * de la regresion lineal para cada uno de los casos de prueba
     * @return 
     */
    //@METODO
    public LinkedList iniciarCalculos() {
        LinkedList<Resultado> tablaCalculada = new LinkedList<Resultado>();
        
        //test1
        LinkedList datosX = Archivo.obtenerDatos(EST_PROXY_SIZE);
        LinkedList datosY = Archivo.obtenerDatos(ACTUAL_ADD_MOD_SIZE);
        tablaCalculada.add(this.calcularRegresion(datosX, datosY));
        
        //test2        
        datosY = Archivo.obtenerDatos(ACTUAL_DEVEP_HOURS);
        tablaCalculada.add(this.calcularRegresion(datosX, datosY));
        
        //test3
        datosX = Archivo.obtenerDatos(PLAN_ADD_MODIF_SIZE);
        datosY = Archivo.obtenerDatos(ACTUAL_ADD_MOD_SIZE);
        tablaCalculada.add(this.calcularRegresion(datosX, datosY));
        
        //test4
        datosY = Archivo.obtenerDatos(ACTUAL_DEVEP_HOURS);
        tablaCalculada.add(this.calcularRegresion(datosX, datosY));
        
        return tablaCalculada;
    }
    
    
    /**
     * Calcula la regresion lineal a partir de los datos enviados
     * @param datosX
     * @param datosy
     * @return 
     */
    //@METODO
    public Resultado calcularRegresion(LinkedList datosX, LinkedList datosY) {
                
        double sumX = Cal.sumatoria(datosX);
        double sumY = Cal.sumatoria(datosY);
        
        double cuadradoX = Cal.sumElevarAlCuadrado(datosX);
        double cuadradoY = Cal.sumElevarAlCuadrado(datosY);
        double multiplicacion = Cal.sumMultiplicacion(datosX, datosY);
        
        double promedioX = sumX / datosX.size();
        double promedioY = sumY / datosY.size();
        
        //calculo B1
        double param1 = (multiplicacion - (10 * promedioX * promedioY)) / 
                ((cuadradoX) - (10 * (Math.pow(promedioX, 2))));
        
        //calculo rxy
        double rXy =  (10 * multiplicacion - (sumX * sumY)) / 
                Math.sqrt(((10 * (cuadradoX) - (Math.pow(sumX, 2))) * (10 * (cuadradoY) - (Math.pow(sumY, 2)))));
        
        //calculo r al cuadrado
        double rCuadrado = rXy * rXy;
        
        //caculo B0
        double param0 = promedioY - param1 * promedioX;
        
        //calulo yk
        double yk = param0 + (param1 * ESTIMACION);
                        
        Resultado resultado = new Resultado(param0, param1, rXy, rCuadrado, yk);        
        return resultado;
    }
    
}
