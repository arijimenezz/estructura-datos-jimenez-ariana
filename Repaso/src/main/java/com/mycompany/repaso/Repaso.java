/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repaso;

/**
 *
 * @author jimen
 */
public class Repaso {

    public static void main(String[] args) {
        Carro auto = new Carro();
        auto.arrancar();
        auto.acelerar();
        
       
        System.out.println("Velocidad auto " + auto.getVelocidad());
        
        CarroElectrico ev = new CarroElectrico();
        ev.cargar();
        System.out.println("Que hace la moto");
        Moto enduro = new Moto();
        enduro.acelerar();
        auto.acelerar();
    }
}
