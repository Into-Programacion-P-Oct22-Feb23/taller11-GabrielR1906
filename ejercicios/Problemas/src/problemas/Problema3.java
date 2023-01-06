/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {
static String mensaje = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double num4;
        
        System.out.println("Ingrese el primer dato");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo dato");
        num2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer dato");
        num3 = entrada.nextDouble();
        System.out.println("Ingrese el cuarto dato");
        num4 = entrada.nextDouble();
        obtenerPromedio(num1 , num2 , num3 , num4);
    }
    
    public static void obtenerPromedio(double num1 , double num2 , 
             double num3 , double num4) {
         double promedio;
         promedio = (num1 + num2 + num3 + num4) / 4;
         if ((promedio >= 0) && (promedio <= 5)){
             mensaje = "Regular";
         } else {
             if ((promedio > 5) && (promedio <= 8)){
                 mensaje = "Bueno";
             } else {
                 if ((promedio > 8) && (promedio <= 9)){
                     mensaje = "Muy Bueno";
                 } else {
                     if ((promedio > 9) && (promedio <= 10)){
                         mensaje = "Sobresaliente";
                     }
                 }
             }
         }
         System.out.println("El promedio cualitativo es: " + mensaje);
     }
    
    
    
}
