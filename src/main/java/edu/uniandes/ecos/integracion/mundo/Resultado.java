package edu.uniandes.ecos.integracion.mundo;

/**
 * Representa cada uno de los valores calculados en la regresion lineal
 * @author Leonardo Valbuena Calderon
 * @date 26/04/2016
 */
public class Resultado {
    
    /**
     * parametro B0
     */
    private double parametroCero;
    private double parametroCeroAct;
    
    /**
     * parametro B1
     */
    private double parametroUno;
    private double parametroUnoAct;
    
    /**
     * Correlacion coeficientes r x,y
     */
    private double coeficienteRxy;
    private double coeficienteRxyAct;
    
    /**
     * Correlacion coeficientes r 2
     */
    private double coeficienteR2;
    private double coeficienteR2Act;
    
    /**
     * Calculo prediccion mejorada
     */
    private double prediccion;
    private double prediccionAct;
    
    /**
     * significancia
     */
    private double significance;
    private double significanceAct;        
    
    /**
     * rango
     */
    private double Rango;
    private double RangoAct;
    
    /**
     * upi
     */
    private double upi;
    private double upiAct;
    
    /**
     * lpi
     */
    private double lpi;
    private double lpiAct;

    /**
     * Constructor
     * @param parametroCero
     * @param parametroUno
     * @param coeficienteRxy
     * @param coeficienteR2
     * @param prediccion 
     */
    //@METODO
    public Resultado(double parametroCero, double parametroUno, double coeficienteRxy, 
            double coeficienteR2, double prediccion) {
        this.parametroCero = parametroCero;
        this.parametroUno = parametroUno;
        this.coeficienteRxy = coeficienteRxy;
        this.coeficienteR2 = coeficienteR2;
        this.prediccion = prediccion;
    }

    

    /**
     * 
     * @return 
     */
    //@METODO
    public double getParametroCero() {
        return Cal.redondeo(parametroCero, 4);
    }

    /**
     * 
     * @param parametroCero 
     */
    //@METODO
    public void setParametroCero(double parametroCero) {
        this.parametroCero = parametroCero;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getParametroUno() {
        return Cal.redondeo(parametroUno, 4);
    }

    /**
     * 
     * @param parametroUno 
     */
    //@METODO
    public void setParametroUno(double parametroUno) {
        this.parametroUno = parametroUno;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getCoeficienteRxy() {
        return Cal.redondeo(coeficienteRxy, 4);
    }

    /**
     * 
     * @param coeficienteRxy 
     */
    //@METODO
    public void setCoeficienteRxy(double coeficienteRxy) {
        this.coeficienteRxy = coeficienteRxy;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getCoeficienteR2() {
        return Cal.redondeo(coeficienteR2, 4);
    }

    /**
     * 
     * @param coeficienteR2 
     */
    //@METODO
    public void setCoeficienteR2(double coeficienteR2) {
        this.coeficienteR2 = coeficienteR2;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getPrediccion() {
        return Cal.redondeo(prediccion, 4);
    }

    /**
     * 
     * @param prediccion 
     */
    //@METODO
    public void setPrediccion(double prediccion) {
        this.prediccion = prediccion;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getSignificance() {
        return significance;
    }

    /**
     * 
     * @param significance 
     */
    //@METODO
    public void setSignificance(double significance) {
        this.significance = significance;
    }

    

    /**
     * 
     * @return 
     */
    //@METODO
    public double getRango() {
        return Rango;
    }

    /**
     * 
     * @param Rango 
     */
    //@METODO
    public void setRango(double Rango) {
        this.Rango = Rango;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getUpi() {
        return upi;
    }

    /**
     * 
     * @param upi 
     */
    //@METODO
    public void setUpi(double upi) {
        this.upi = upi;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getLpi() {
        return lpi;
    }

    /**
     * 
     * @param lpi 
     */
    //@METODO
    public void setLpi(double lpi) {
        this.lpi = lpi;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getParametroCeroAct() {
        return parametroCeroAct;
    }

    /**
     * 
     * @param parametroCeroAct 
     */
    //@METODO
    public void setParametroCeroAct(double parametroCeroAct) {
        this.parametroCeroAct = parametroCeroAct;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getParametroUnoAct() {
        return parametroUnoAct;
    }

    /**
     * 
     * @param parametroUnoAct 
     */
    //@METODO
    public void setParametroUnoAct(double parametroUnoAct) {
        this.parametroUnoAct = parametroUnoAct;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getCoeficienteRxyAct() {
        return coeficienteRxyAct;
    }

    /**
     * 
     * @param coeficienteRxyAct 
     */
    //@METODO
    public void setCoeficienteRxyAct(double coeficienteRxyAct) {
        this.coeficienteRxyAct = coeficienteRxyAct;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getCoeficienteR2Act() {
        return coeficienteR2Act;
    }

    /**
     * 
     * @param coeficienteR2Act 
     */
    //@METODO
    public void setCoeficienteR2Act(double coeficienteR2Act) {
        this.coeficienteR2Act = coeficienteR2Act;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getPrediccionAct() {
        return prediccionAct;
    }

    /**
     * 
     * @param prediccionAct 
     */
    //@METODO
    public void setPrediccionAct(double prediccionAct) {
        this.prediccionAct = prediccionAct;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getSignificanceAct() {
        return significanceAct;
    }

    /**
     * 
     * @param significanceAct 
     */
    //@METODO
    public void setSignificanceAct(double significanceAct) {
        this.significanceAct = significanceAct;
    }

    

    /**
     * 
     * @return 
     */
    //@METODO
    public double getRangoAct() {
        return RangoAct;
    }

    /**
     * 
     * @param RangoAct 
     */
    //@METODO
    public void setRangoAct(double RangoAct) {
        this.RangoAct = RangoAct;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getUpiAct() {
        return upiAct;
    }

    /**
     * 
     * @param upiAct 
     */
    //@METODO
    public void setUpiAct(double upiAct) {
        this.upiAct = upiAct;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getLpiAct() {
        return lpiAct;
    }

    /**
     * 
     * @param lpiAct 
     */
    //@METODO
    public void setLpiAct(double lpiAct) {
        this.lpiAct = lpiAct;
    }
    
    
    
    
    
}
