/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana04;

/**
 *
 * @author jimen
 */
public class Semana04 {

    public static void main(String[] args) {
        Pila pila = new Pila(); //instancia
        
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        pila.apilar(40);
        
        System.out.println("Pila despues apilar");
        System.out.println(pila.mostrarPila());
        
        System.out.println("Elem desapilado: " +pila.desapilar());
        System.out.println("Pila despues de desapilar: ");
        System.out.println(pila.mostrarPila());
        
        System.out.println("Elem desapilado: " +pila.desapilar());
        System.out.println("Pila despues de desapilar: ");
        System.out.println(pila.mostrarPila());
    }
}
