package com.mycompany.semana10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jimen
 */
public class Nodo {
    private int dato;
    private Nodo izquierda;
    private Nodo derecha;
    
    public Nodo(int valor){
        this.dato = valor;
        this.derecha = null;
        this.izquierda = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
}
