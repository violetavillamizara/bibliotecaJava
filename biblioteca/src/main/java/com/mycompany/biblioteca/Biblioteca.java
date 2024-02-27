/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Biblioteca {
    
    //lista atributo
    private List<Recurso> recursos;

    //constructor 
    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    //get y set
    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }
    
    
    
    
    public void agregarRecurso(Recurso recurso){
        recursos.add(recurso);
    }
    
    public void prestarRecurso(int id){
        for(Recurso recurso : recursos){
            if(recurso.getId() == id && recurso.isDisponible() == true){
                recurso.setDisponible(false);
            }
        }
    }
    
    public void buscarRecursoPorTitulo(String titulo){
        for(Recurso recurso : recursos){
            if(recurso.getTitulo().equals(titulo)){
                //return recursos.;
            }
        }

    }
}
