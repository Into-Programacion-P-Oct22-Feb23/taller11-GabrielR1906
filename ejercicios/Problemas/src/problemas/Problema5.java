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
public class Problema5 {
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int suma;
        suma = obtenersuma(informacion);
        System.out.println(suma);
    }
    
    
    public static int obtenersuma(int[][] datos){
        int suma = 0;
        String mensaje = "";
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                suma = suma + datos[i][j];
            }
        }
        return suma;
    }
}
