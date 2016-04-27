package edu.uniandes.ecos.integracion.mundo;

import java.util.LinkedList;

/**
 * Clase principal en la cual se coordinan los calculos de la Correlacion
 * @author Leonardo Valbuena Calderon
 * @date 26/04/2016
 */
public class Correlacion {
    
    /**
     * realiza el calculo de las tablas
     * @return lista con los resultados
     */
    //@METODO
    public LinkedList iniciarOperaciones() {
        LinkedList<Resultado> tablaCalculada = new LinkedList<Resultado>();
        
        Regresion regresion = new Regresion();
        tablaCalculada = regresion.iniciarCalculos();        
        
        return tablaCalculada;
    }
    
    
    
    /**
     * calcula el valor del rango
     * @param n datos historicos
     * @param x 
     * @return rango calculado
     */
    //@METODO
    public double calcularRango(LinkedList n, double x) {
        double rango = 0;
        IntegradorX integradorX = new IntegradorX();
        integradorX.buscarX(0.35, n.size()-2, x);
        
        return rango;
    }
    
    /**
     * Realiza el calculo del UPI
     * @param rango
     * @param yk
     * @return valor calculado
     */
    //@METODO
    public double calcularUPI(double rango, double yk) {
        double upi = 0;
        
        
        return upi;
    }
    
    /**
     * Realiza el calculo del LPI
     * @param rango
     * @param yk
     * @return valor calculado
     */
    //@METODO
    public double calcularLPI(double rango, double yk) {
        double lpi = 0;
        
        
        return lpi;
    }
    
}
