/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args){
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media;
        double desviacion;
        media = obtenermediaaritmetica(informacion);
        desviacion = obtenerdesviacionestandar(informacion, media);
        System.out.printf("El valor de la media aritetica es: %.2f\n"
                + "el valor de la desviacion estandar es: %.2f\n",
                media, desviacion);
    }
    
    public static double obtenermediaaritmetica(int[] datos){
        double suma = 0;
        double mediaaritmetica;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        mediaaritmetica = suma / datos.length;
        
        return mediaaritmetica;
    }
    
    public static double obtenerdesviacionestandar(int[] datos, double media){
        double a = 0;
        double desviacionestandar;
        for (int i = 0; i < datos.length; i++) {
            a = a + Math.pow((datos[i] - media), 2);
        }
        desviacionestandar = Math.sqrt(a/datos.length);
        
        return desviacionestandar;
    }
}
