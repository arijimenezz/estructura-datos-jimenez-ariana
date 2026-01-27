/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

/**
 *
 * @author jimen
 */
public class Carro {
    String marca;
    private int velocidad;
    
    void arrancar(){
        System.out.println("Carro arranca");
        
    }
    
    
    void acelerar(){
        velocidad +=10;
        System.err.println("Carro acelera");
    }
    
    void frenar(){
        if (velocidad>=10){ //evitamos numeros negativos
        velocidad-=10;
        }
    }

    public int getVelocidad() {
        return velocidad;
    }
    
}
