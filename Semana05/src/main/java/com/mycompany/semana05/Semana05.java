/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana05;

/**
 *
 * @author jimen
 */
public class Semana05 {

    public static void main(String[] args) {
        PilaDinamica pila = new PilaDinamica();
        System.out.println("Apilando");
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Mostrar pila");
        pila.mostrar(); // 30 20 10
        System.out.println("Desapilando " + pila.pop()); // 30
        System.out.println("Desapilando " + pila.pop()); // 20
        System.out.println("Mostramos pila");
        pila.mostrar(); //10
        System.out.println("Desapilando " + pila.pop());//10
        System.out.println("Intentando desapilar de pila vacia");
        pila.pop(); //Subdesbordamiento
        
        
    }
}
