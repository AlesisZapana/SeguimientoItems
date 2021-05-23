/*
 * GPL.
 */
package Modelo;

/**
 *
 * @author ale
 */
public class Prioridad {
    private String nombre;
    private Integer valor;

    public Prioridad(String nombre,Integer valor) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
