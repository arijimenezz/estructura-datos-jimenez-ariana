/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana02;

/**
 *
 * @author jimen
 */
public class Semana02 {

    public static void main(String[] args) {
       //Recursividad 
       
       
    }
    //Ejemplo 1
    public static int factorial(int n){
        if(n==1){
            //Caso base: cuando n es 1
            return 1;
        }else{
           return n*factorial(n-1);
        }
        
            
    }
}
