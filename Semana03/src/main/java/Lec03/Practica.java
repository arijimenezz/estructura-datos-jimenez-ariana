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
    public int encontrarMaximo(int[] lista){
        int maximo=lista[0];
        for(int i=0; i<lista.length; i++){
        if(lista[i]>maximo){
            maximo=lista[i];
        }   
        
        }
         return maximo;
    }
    //Ejemplo del PROFE // Diferencia de lo que hice, es crear el parametro max no como una variable local
    public int encontrarMaxR(int[]lista, int index, int max){
        if(index<lista.length){
            if(lista[index]> max){
            max = lista[index];
            }
            return encontrarMaxR(lista, index+1, max);
        } else {
            return max;
        }
    }
    
    
    
}
