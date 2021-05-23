/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author ale
 */
public class Tipo {
    private String nombre;
    private List<Estado> estados;
    
    //cambiarlo a string o dejarlo en estados. No hay un límite para la asignación de estados.
    //Debería cambiar toda la estructura.     
    public Tipo(String nombre, List<Estado> estados) {
        this.nombre = nombre;
        this.estados = estados;        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
    
    public void addEstado(Estado estado){
        estados.add(estado);
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
    
}
