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
public class Problema2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        System.out.println("Ingrese el numero 1 para obtener el area de un"
                + "cuadrado; el numero 2 para obtener el area de un triangulo;"
                + " y el numero 3 para obtener el area de un rectangulo:");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        if (numero == 1) {
            obtenerAreaCuadrado();
        } else {
            if (numero == 2) {
                obtenerAreaTriangulo();
            } else {
                if (numero == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Error!!!!");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double resultado;
        System.out.println("Ingrese el lado");
        lado = entrada.nextDouble();
        resultado = lado * lado;
        System.out.println("El area del cuadrado es:" + resultado);
    }
    
    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double resultado;
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        resultado = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + resultado);
    }
    
    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double resultado;
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        resultado = base * altura;
        System.out.println("El area del rectangulo es: " + resultado);
    }
}
