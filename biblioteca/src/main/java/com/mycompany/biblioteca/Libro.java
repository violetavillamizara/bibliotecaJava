/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author user
 */
public class Libro extends Recurso{
    
    //atributos
    private String autor;

    //constructor
    public Libro(String autor){
        this.autor = autor;
    }
    
    public Libro(int id, String titulo, boolean disponible, String autor) {
        super(id, titulo, disponible);
        this.autor = autor;
    }
    
    //get y set 

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
}
