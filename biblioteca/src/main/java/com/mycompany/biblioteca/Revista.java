/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author user
 */
public class Revista extends Recurso{

    private int numero;
    private tipoRevista tipo;
    
    
    //constructor
    
    public Revista(int numero, tipoRevista tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    
    
    //get y set

    public int getNumero() {
        return numero;
    }

    public tipoRevista getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(tipoRevista tipo) {
        this.tipo = tipo;
    }
    
}
