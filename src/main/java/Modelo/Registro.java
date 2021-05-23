/*
 * GPL.
 */
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author ale
 */
public class Registro {
    
    private Item registro;
    private LocalDateTime fecha;

    public Registro(Item registro, LocalDateTime fecha) {
        this.registro = registro;
        this.fecha = fecha;
    }

    public Item getRegistro() {
        return registro;
    }

    public void setRegistro(Item registro) {
        this.registro = registro;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
    
}
