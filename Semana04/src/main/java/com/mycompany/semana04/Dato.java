package com.mycompany.semana04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jimen
 */
public class Dato {
    private int valor;
    private Dato abajo;

    public Dato(int valor) {
        this.valor = valor;
        this.abajo = null;
    }

    public int getValor() {
        return valor;
    }

    public Dato getAbajo() {
        return abajo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setAbajo(Dato abajo) {
        this.abajo = abajo;
    }
    
}
