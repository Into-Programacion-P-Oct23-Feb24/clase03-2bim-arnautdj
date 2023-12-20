/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {
    
    public static void main(String[] args) {
    
    int[][] arreglo = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
    int valor = 0;
    
        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo.length; c++) {
                if (f==c) {
                    valor = valor + arreglo[f][c];
                }
            }
        }
        
        System.out.printf("%d\n", valor);
    
        /*
        Hago dos ciclos repetitivos for para recorrer el arreglo. Mediante una
        cadena acumuladora, sumo los valores el arreglo en todas las posiciones 
        que pertenezcan a la diagonal principal. Para identificar estos valores
        hago una condicion que compruebe si el valor de la fila es igual al valor
        de la columna
        */
        
    }
}
