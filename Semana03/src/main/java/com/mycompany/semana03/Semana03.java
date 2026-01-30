/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana03;

/**
 *
 * @author jimen
 */
public class Semana03 { //Repaso recursividad

    public static void main(String[] args) {
        //imprime(4);
        suma(6);
        //System.out.println(suma(5));
        sumaR(6);
        System.out.println(sumaR(6));
           
    }
    static void imprime(int n){ //Cuenta Regresiva
           for (int i=n; i>0; i--) { //i cambia en cada iteracion
               System.out.println(i);
           }
    }
    //1. Que cambia? i cambia en cada iteracion
    //2. Condicion parada i==0 -> condicion base
    static void imprimirR(int n){  
        if(n>0){
        System.out.println(n);
        imprimirR(n-1); //llamada recursiva
        } 
       
    }
    static int suma(int n){
        int total = 0;
        for (int i = n; i > 0; i--){
            total+= i;
        }
        return total;
    }
    //1. i cambia en cada iteracion
    // cond parada i==0
    static int sumaR(int n){
        if(n==0){
            return n;
        } else {
        return n + sumaR(n-1); // llamada recursiva
        }
    }

    
           
        
}
