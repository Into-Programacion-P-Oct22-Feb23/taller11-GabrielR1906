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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String cedula;
        String nombre;
        boolean bandera = true;
        String opcion;
        int numero;
        while (bandera == true) {
            System.out.println("Ingrese su nombre:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su numero de cedula:");
            cedula = entrada.nextLine();
            System.out.println("Ingrese 1 para calcular el valor a pagar de"
                    + "la luz; Ingrese 2 para calcular el precio de un"
                    + "inmueble");
            numero = entrada.nextInt();
            if (numero == 1) {
                calcularValorLuz(nombre, cedula);
            } else {
                if (numero == 2) {
                    calcularPredio(nombre, cedula);
                } else {
                    System.out.println("Error!!!!");
                }
            }
            System.out.println("Ingrese s para salir o cualquier otro"
                    + "caracter para contiuar");
            entrada.nextLine();
            opcion = entrada.nextLine();
            if ("s".equals(opcion)) {
                bandera = false;
            }
        }
    }
    
    public static void calcularValorLuz(String nombre, String cedula){
        Scanner entrada = new Scanner(System.in);
        double valor;
        double numkilowatios;
        System.out.println("Ingrese el valor del kilowatio:");
        valor = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatios usados en el mes:");
        numkilowatios = entrada.nextDouble();
        valor = valor * numkilowatios;
        System.out.printf("Cliente %s con cédula %s debe cancelar el"
                + "valor de $%.2f\n", nombre, cedula, valor);
    }
    
    public static void calcularPredio(String nombre, String cedula){
        Scanner entrada = new Scanner(System.in);
        double valor;
        double valorP;
        System.out.println("Ingrese el valor del inmueble:");
        valor = entrada.nextDouble();
        valorP = (valor * 2) / 100;
        System.out.printf("Cliente %s con cédula %s tiene un bien "
                + "inmueble valorado en $%.2f y tiene que pagar de predio "
                + "$%.2f\n", nombre, cedula, valor, valorP);
    }
}
