/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author user
 */
public class Main {
    
    public static void main(String[] args) {
        Revista juegos = new Revista(1, tipoRevista.juegos);
        Revista cocina = new Revista(2, tipoRevista.cocina);
        Revista chismes = new Revista(3, tipoRevista.chismes);
        Revista news = new Revista(4, tipoRevista.noticias);
        Revista modelos = new Revista(5, tipoRevista.pasarela);
        
        Libro hola = new Libro(1, "hola", true, "yo");
    }
    
}
