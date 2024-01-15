/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public class FactoriaProductividad implements Factoria{
    
    private static FactoriaProductividad instanciaUnica;

    public FactoriaProductividad() {
    }

    /**
     * Get the value of instanciaUnica
     *
     * @return the value of instanciaUnica
     */
    public static FactoriaProductividad getInstanciaUnica() {
        if (instanciaUnica == null)
        {
            instanciaUnica = new FactoriaProductividad();
        }
        return instanciaUnica;
    }

    @Override
    public Antivirus crearProducto(String versionActual, LocalDate fechaVersionActual, ArrayList<String> certificaciones, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Videojuego crearProducto(ArrayList<String> generos, ArrayList<String> otrasPlataformas, boolean multijugador, int jugadores, boolean online, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Productividad crearProducto(String versionActual, LocalDate fechaVersionActual, String tipo, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        return(new Productividad(versionActual, fechaVersionActual, tipo, nombre, condigoInterno, creador, descripcion, fechaCreacion, precio, caratula, valoracionGeneral, reviews, limitacionesTecnicas, aprobado));
    }

}
