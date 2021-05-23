/*
 * GPL.
 */
package Modelo;

import Controlador.RegistroController;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author ale
 */
public class Historial {
    
    private static ArrayList<Registro> registros=new ArrayList<Registro>();

    public static ArrayList<Registro> getRegistros() {
        return registros;
    }

    public static void setRegistros(ArrayList<Registro> registros) {
        Historial.registros = registros;
    }
    
    public static void addRegistro(Registro registro){        
        registros.add(registro);
    }
}
