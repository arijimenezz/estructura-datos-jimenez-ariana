/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_sem05.Ejercicio1;

import com.mycompany.practica_sem05.Ejercicio1.Nodo;

/**
 *
 * @author jimen
 */
public class PilaDinamica {
     private Nodo cima;
    
    public PilaDinamica(){
        this.cima = null;
        
    }
    
    public void push(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguiente(cima);
        cima = nuevoNodo;
    }
    
    public int pop(){
        if(cima == null){
            System.out.println("Subdesbordamiento");
            return -1;
        }
        int dato = cima.getDato();
        cima = cima.getSiguiente();
        return dato;
    }
     public void mostrar(){
         if(cima == null){
             System.out.println("Pila vacia");
             return;
         }
         Nodo actual = cima;
         System.out.println("Contenido de pila: ");
         while(actual != null){
             System.out.println(actual.getDato());
             actual = actual.getSiguiente();
         }
     }
     public void mostrarTamano(){
         if(cima == null){
             System.out.println("Pila vacia");
         return;
         } 
         Nodo actual = cima;
         int contador = 0;
         while(actual != null){
             contador ++;
             actual = actual.getSiguiente();  
         }
     System.out.println("Tama_o de pila: "+contador);
 }
     public void verificar(int elemento){
         Nodo actual = cima;
         while(actual != null){
             if(actual.getDato() == elemento){
                 System.out.println("Elemento "+elemento+" encontrado en la pila");
                 return;
             }
             actual = actual.getSiguiente();
         }
         System.out.println("Elemento "+elemento+" no encontrado");
         
     }
     
}
     
