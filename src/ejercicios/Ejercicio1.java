/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 * Crear un programa que permite ingresar un número grande y otro número de una cifra; y determina la cantidad que se repite el número de una cifra dentro del número grande.
 * 
 * Por ejemplo:
 * numeroGrande = 1234252
 * cifraBuscada = 2
 * Resultado
 * cantidadCifraBuscada= 3
 * @author Hernan
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // declarar variables
        int numeroGrande, cifraBuscada, cantidadCifraBuscada;
        Scanner lectura = new Scanner(System.in);
            
        // entrada de datos
        System.out.println("Ingresa el número grande: ");
        numeroGrande = lectura.nextInt();
        
        System.out.println("Ingresa la cifra buscada: ");
        cifraBuscada = lectura.nextInt();
        
        // proceso de datos
        cantidadCifraBuscada = 0;
        
        while (numeroGrande > 0) {
            int cifraActual = numeroGrande % 10;
            if (cifraActual == cifraBuscada) {
                cantidadCifraBuscada++;
            }
            numeroGrande = numeroGrande / 10;
        }
        
        // salida de datos
        System.out.println("La cantidad de dígitos es: " + cantidadCifraBuscada);
    }
}
