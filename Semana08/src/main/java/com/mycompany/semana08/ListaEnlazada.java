/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana08;

/**
 *
 * @author jimen
 */
public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza=null;
    }
    
    public void insertarInicio(int valor){
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
    }
    public void insertarOrdenado(int valor){
        Nodo nuevo = new Nodo(valor);
        if(cabeza == null || cabeza.getDato()> valor){
            nuevo.getSiguiente();
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while(actual.getSiguiente() != null && actual.getSiguiente().getDato()<valor){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            actual.setSiguiente(nuevo);
        }
    }
    public void eliminarNodo(int valor){
        Nodo actual = cabeza;
        Nodo anterior = null;
        while(actual!=null && actual.getDato() != valor){
            anterior = actual;
            actual = actual.getSiguiente();
        } 
        if (actual == null){
            cabeza = actual.getSiguiente();
        } else {
            anterior.setSiguiente(actual.getSiguiente());
        }
    }
    public boolean buscar(int valor){
        Nodo actual = cabeza;
        while(actual!= null){
            if(actual.getDato() == valor){
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    public void recorrer(){
         Nodo actual = cabeza;
        while(actual!= null){
            System.out.println(actual.getDato()+" -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("NULL");
    }
    
            
}
