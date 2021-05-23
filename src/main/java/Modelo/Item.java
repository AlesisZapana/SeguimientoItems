package Modelo;

/**
 *
 * @author ale
 */
public class Item {
    private String nombre;
    private Prioridad prioridad;
    private Integer numEstadoActual;
    private Estado estadoActual;
    private Tipo tipo;
    private Miembro responsable;
    private Equipo equipo;

    public Item(String nombre, Prioridad prioridad, Estado estadoActual, Tipo tipo,Equipo equipo, Miembro responsable) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.estadoActual = estadoActual;
        this.tipo = tipo;
        this.responsable=responsable;
        this.equipo=equipo;
        this.numEstadoActual=0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }   

    public Miembro getResponsable() {
        return responsable;
    }

    public void setResponsable(Miembro responsable) {
        this.responsable = responsable;
    }

    public Integer getNumEstadoActual() {
        return numEstadoActual;
    }

    public void setNumEstadoActual(Integer numEstadoActual) {
        this.numEstadoActual = numEstadoActual;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
}
