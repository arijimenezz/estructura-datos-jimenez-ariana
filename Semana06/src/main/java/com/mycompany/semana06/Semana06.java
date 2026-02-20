/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana06;

/**
 *
 * @author jimen
 */
public class Semana06 {

    public static void main(String[] args) {
        try{
            Cola cola = new Cola();
            cola.encolar(10);
            cola.encolar(20);
            cola.encolar(30);
            
            System.out.println("Elemento al frente: " + cola.frente()); //10
            System.out.println("Elemento retornado: " + cola.desencolar()); //10
            System.out.println("Elemento al frente: " + cola.frente()); // 20
            
            cola.encolar(40);
            
            while(!cola.esVacia()){
                System.out.println("Elemento retornado " + cola.desencolar());// 20 30 40
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
