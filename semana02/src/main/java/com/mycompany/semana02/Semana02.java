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
        //Es mas eficiente en arboles y grafos
     //imprime(5);
        
        int x = 6;
        int suma = sumaEnterosIterativo(x);
        int sumaR = sumaEnterosRecursiva(x);
        System.out.println("La suma de "+ x +" es "+suma);
        System.out.println("El sumaR de "+ x +" es "+sumaR);
        //System.out.println("El factorial de "+ x +" es "+factorial(x));
    }
     public static void imprime(int n){
            if(n==0){ //caso base
             return; //solo con void 
            } else {
                System.out.println(n);
                imprime(n-1); //caso recursivo
            }
                
        }
     //Ejemplo 1 Recursividad
     
     public static int factorial(int n){
         if(n==0){
             //Caso base: cuando n es 1
             return 1;
         } else {
             return n * factorial(n-1); //Llamada recursiva
         }
         
         }
     //Ejemplo 2 Suma de los enteros 1 hasta n
      public static int sumaEnterosIterativo(int limite){
          int resultado=0;
          for(int i=0;i<=limite;i++){
              resultado+=i;
          }
          return resultado;
      }
      public static int sumaEnterosRecursiva(int n){
        int resultado=0;
        if(n<=1){ //acercarlo a n 
            return n;
        }else{
            return n + sumaEnterosRecursiva(n-1);
        }
        
      }
      //Ejercicio Potencia 
      public static int potencia(int base, int exponente){
          if (exponente == 1){
          }
        return 0;
          
              
      }

             
         
     }

