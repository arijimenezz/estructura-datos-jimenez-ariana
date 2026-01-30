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
public class Main {
    public static void main(String[] args){ //Conteo 
        // Big Oh notation -> Complejidad tiempo IMPORTANTE
        List<Integer> miLista = new ArrayList<>();
        miLista.add(2);
        miLista.add(4);
        miLista.add(99);
        int indice = 0;
        
        //System.out.println(contarElementos(miLista, indice));
        
        Practica practica = new Practica();
        int[] miOtraLista ={2,5,3,7,2};
        System.out.println(practica.sumaIterativa(miOtraLista));
        //System.out.println(practica.sumaRecursiva(miOtraLista,0));
        
        
        
    }
    public static int contarElementos(List<Integer> lista, int index){//index posicion // Nota: En recursion hay que 
                                                                      //pensar una variable local como un parametro
        
        if(index == lista.size()){//caso base 
            return 0;
        } else{
            return 1+ contarElementos(lista, index +1);//llamada recursiva
        }
        }
    
        
    
}
