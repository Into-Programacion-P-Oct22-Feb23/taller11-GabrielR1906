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
public class Problema7 {
    public static void main(String[] args){
        String[] arreglo = obtenerarreglo();
        imprimirvalorescon4o5caracteres(arreglo);
    }
    
    public static String[] obtenerarreglo(){
        Scanner entrada = new Scanner(System.in);
        int numdatos;
        
        System.out.println("Ingrese el numero de datos que se requiere "
                + "ingresar:");
        numdatos = entrada.nextInt();
        String[] arreglo = new String[numdatos];
        System.out.println("Ingrese ciudades del Ecuador:");
        entrada.nextLine();
        for (int i = 0; i < numdatos; i++) {
            System.out.println("Ingrese la ciudad " + (i+1));
            arreglo[i] = entrada.nextLine();
        }
        return arreglo;
    }
    
    public static void imprimirvalorescon4o5caracteres(String[] arreglo){
        System.out.println("\nLas ciudades que tienen unicamente "
                        + "4 o 5 caracteres en su nombre son:");
        for (int i = 0; i < arreglo.length; i++) {
            if( (arreglo[i].length() == 4) || (arreglo[i].length() == 5)){
                System.out.println(arreglo[i]); 
            }
        }
    }
    
}
