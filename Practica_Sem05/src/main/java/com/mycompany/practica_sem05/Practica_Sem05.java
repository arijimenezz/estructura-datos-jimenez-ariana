/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_sem05;

import com.mycompany.practica_sem05.Ejercicio1.PilaArreglo;
import com.mycompany.practica_sem05.Ejercicio1.PilaDinamica;
import java.util.Random;

/**
 *
 * @author jimen
 */
public class Practica_Sem05 {

    public static void main(String[] args) {
       PilaDinamica pila = new PilaDinamica();
       System.out.println("Apilando");
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.mostrarTamano();
        pila.verificar(5);
        pila.verificar(30);
       int cantidad=1_000_000;
       PilaArreglo pila2 = new PilaArreglo(cantidad);
       Random random = new Random();
       
       for (int i = 0; i < cantidad; i++) {
           int numero = random.nextInt(1_000_000);
            pila2.push(numero);
       }
       for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(1_000_000);
            pila.push(numero); // Dudas con ejercicio 2
        }
     
       
   
    }
}
