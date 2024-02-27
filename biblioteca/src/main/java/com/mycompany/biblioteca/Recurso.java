/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author user
 */
public class Recurso {
    
    private int id;
    private String titulo;
    private boolean disponible;
    
    
    // constructor
    
    public Recurso() {
    }

    public Recurso(int id, String titulo, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
    }
    
  
    // get y set
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
