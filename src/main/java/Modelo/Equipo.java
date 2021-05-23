/*
 * GPL.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author ale
 */
public class Equipo {
    private String nombre;
    private String especialidad;
    private String descripcion;
    private List<Miembro> miembros;

    public Equipo(String nombre,String especialidad) {
        this.nombre = nombre;
        this.especialidad=especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void addMiembro(Miembro miembro){
        this.miembros.add(miembro);
    }

    public List<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Miembro> miembros) {
        this.miembros = miembros;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
        
}