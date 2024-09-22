/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 * Programa que cuenta el número de vocales
 * @author Hernan
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        // declarar variables
        String palabra;
        int palabraIndice, cantidadVocales;
        Scanner lectura = new Scanner(System.in);

        // entrada de datos
        System.out.println("Ingresa una palabra: ");
        palabra = lectura.nextLine();

        // procesado de datos
        palabraIndice = 0;
        cantidadVocales = 0;
        while (palabraIndice < palabra.length()) {
           char letraActual =  palabra.charAt(palabraIndice);
           if (letraActual == 'a' ||  letraActual == 'e' || letraActual == 'i' || letraActual == 'o' || letraActual == 'u') {
               cantidadVocales++;
           }
           palabraIndice++;
        }
        
        // salida de datos
        System.out.println("La cantidad de vocales es: " + cantidadVocales);
    }
}
