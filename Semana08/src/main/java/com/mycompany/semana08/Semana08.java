/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana08;

/**
 *
 * @author jimen
 */
public class Semana08 {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
        lista.insertarInicio(10);
        lista.insertarInicio(20);
        lista.insertarInicio(30);
        System.out.println("Lista despues de insertar");
        lista.recorrer(); // 30 20 10
        lista.eliminarNodo(20);
        System.out.println("Lista despues de eliminar");
        lista.recorrer(); // 30 10
        System.out.println("10 en lista?: "+ lista.buscar(10)); //true 
        System.out.println("40 en lista?: "+ lista.buscar(40)); //false
        lista.insertarInicio(99);
        lista.insertarInicio(50);
        System.out.println("Lista despues de insertar");
        lista.recorrer(); // 50 99 30 10
        
        
        
    }
}
