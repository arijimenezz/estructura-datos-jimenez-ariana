/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec03;

import java.util.*;

/**
 *
 * @author jimen
 */
public class Practica {
    //suma
    public int sumaIterativa(int[] lista){
       int suma=0;
       for(int i=0; i<lista.length;i++){
         suma+= lista[i];
       }
       return suma;   
   }
    //1. parametro i es el que cambia
    //2. i==lista.length se detiene
    public int sumaRecursiva (int[] lista, int index){
        if(index == lista.length){
            return 0;
        } else {
            return lista[index] + sumaRecursiva(lista, index + 1);
        }
    }
    
    
    
   
      
                
            
        
    
    //encontrar numero maximo 
}
