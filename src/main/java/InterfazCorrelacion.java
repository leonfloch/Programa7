

import edu.uniandes.ecos.integracion.mundo.Correlacion;
import edu.uniandes.ecos.integracion.mundo.Resultado;

import java.util.Iterator;
import java.util.LinkedList;

import static spark.SparkBase.staticFileLocation;
import static spark.Spark.get;
import static spark.SparkBase.port;
import static spark.Spark.get;
import static spark.SparkBase.port;

/**
 * Clase de presentacion donde se muestran los resultados.
 *
 * @author Leonardo Valbuena Calderon
 * @date 25/03/2016
 */
public class InterfazCorrelacion {

    /**
     * Main de la aplicacion
     *
     * @param args
     */
    //@METODO
    public static void main(String[] args) {        
        Correlacion correlacion = new Correlacion();
        mostrarResultados(correlacion.iniciarOperaciones());
    }

    /**
     * Utilizando Heroku se muestran los resultados
     *
     * @param result
     */
    //@METODO
    public static void mostrarResultados(LinkedList result) {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
        get("/", (req, res) -> getHtml(result));
    }

    /**
     * Genera el codigo html del resultado
     *
     * @param result
     * @return
     */
    //@METODO
    public static StringBuffer getHtml(LinkedList result) {
        StringBuffer html = new StringBuffer();
        html.append("<table border=1>");
        html.append("<tr>");        
        html.append("<th>Test</th>");
        html.append("<th>Parameter</th>");
        html.append("<th>Expected<br>Value</th>");
        html.append("<th>Actual<br>Value</th>");
        html.append("</tr>");
        html.append("<tr>");        

        Iterator iterador = result.iterator();    
        int cont = 1;
        while (iterador.hasNext()) {
            Resultado res = (Resultado) iterador.next();
            
            html.append("<tr>");
            html.append("<td rowspan=\"9\">Test " +  cont  +"</td>");
            html.append("<td>r x,y</td>");
            html.append("<td>" + res.getCoeficienteRxyAct() + "</td>");
            html.append("<td>" + res.getCoeficienteRxy() + "</td>");            
            html.append("</tr>");            
            html.append("<tr>");            
            html.append("<td>r^2</td>");
            html.append("<td>" + res.getCoeficienteR2Act() + "</td>");
            html.append("<td>" + res.getCoeficienteR2() + "</td>");
            html.append("</tr>");
            html.append("<tr>");            
            html.append("<td>significance</td>");
            html.append("<td>" + res.getSignificanceAct() + "</td>");
            html.append("<td>" + res.getSignificance() + "</td>");
            html.append("</tr>");
            html.append("<tr>");            
            html.append("<td>Bo</td>");
            html.append("<td>" + res.getParametroCeroAct() + "</td>");
            html.append("<td>" + res.getParametroCero() + "</td>");
            html.append("</tr>");
            html.append("<tr>");            
            html.append("<td>B1</td>");
            html.append("<td>" + res.getParametroUnoAct() + "</td>");
            html.append("<td>" + res.getParametroUno() + "</td>");
            html.append("</tr>");
            html.append("<tr>");            
            html.append("<td>Yk</td>");
            html.append("<td>" + res.getPrediccionAct()+ "</td>");
            html.append("<td>" + res.getPrediccion() + "</td>");
            html.append("</tr>");
            html.append("<tr>");            
            html.append("<td>Range</td>");
            html.append("<td>" + res.getRangoAct() + "</td>");
            html.append("<td>" + res.getRango() + "</td>");
            html.append("</tr>");
            html.append("<tr>");            
            html.append("<td>UPI (70%)-</td>");
            html.append("<td>" + res.getUpiAct() + "</td>");
            html.append("<td>" + res.getUpi() + "</td>");
            html.append("</tr>");
            html.append("<tr>");            
            html.append("<td>LPI (70%)</td>");
            html.append("<td>" + res.getLpiAct() + "</td>");
            html.append("<td>" + res.getLpi() + "</td>");
            html.append("</tr>");
            cont++;
        }
        html.append("</table>");
        html.append("</body>");
        html.append("</html>");
        return html;
    }

    

}
