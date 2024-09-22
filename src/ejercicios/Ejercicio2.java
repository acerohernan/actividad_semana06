/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 * Buscar la cantidad de letra que se repite dentro de la palabra
 * @author Hernan
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // declarar variables
        String palabra;
        char letraBuscada;
        int palabraIndice,cantidadLetraBuscada;
        Scanner lectura = new Scanner(System.in);
        
        // entrada de datos
        System.out.println("Ingresa una palabra: ");
        palabra = lectura.nextLine();
        
        System.out.println("Ingresa una letra a buscar: ");
        letraBuscada = lectura.nextLine().charAt(0);
        
        // procesado de datos
        palabraIndice = 0;
        cantidadLetraBuscada = 0;
        while(palabraIndice < palabra.length()) {
           char letraActual =  palabra.charAt(palabraIndice);
           if (letraActual == letraBuscada) {
               cantidadLetraBuscada++;
           }
           palabraIndice++;
        }
        
        // salida de datos
        System.out.println("La cantidad que se repite la letra buscada es: " + cantidadLetraBuscada);
    }
}
