/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto.clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public interface Factoria {
    public Antivirus crearProducto(String versionActual, LocalDate fechaVersionActual, ArrayList<String> certificaciones, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado);
    public Videojuego crearProducto(ArrayList<String> generos, ArrayList<String> otrasPlataformas, boolean multijugador, int jugadores, boolean online, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado);
    public Productividad crearProducto(String versionActual, LocalDate fechaVersionActual, String tipo, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado);
}
