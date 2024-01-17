package proyecto.clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class FactoriaConcreta implements Factoria{
    private static FactoriaConcreta instanciaUnica;

    public FactoriaConcreta() {
    }
    
    /**
     * Get the value of instanciaUnica
     *
     * @return the value of instanciaUnica
     */
    public static FactoriaConcreta getInstanciaUnica() {
        if (instanciaUnica == null)
        {
            instanciaUnica = new FactoriaConcreta();
        }
        return instanciaUnica;
    }
    
    @Override
    public Antivirus crearProducto(String versionActual, LocalDate fechaVersionActual, ArrayList<String> certificaciones, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        return (new Antivirus(versionActual, fechaVersionActual, certificaciones, nombre, condigoInterno, creador, descripcion, fechaCreacion, precio, caratula, valoracionGeneral, reviews, limitacionesTecnicas, aprobado));
    }
    
    @Override
    public Productividad crearProducto(String versionActual, LocalDate fechaVersionActual, String tipo, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        return(new Productividad(versionActual, fechaVersionActual, tipo, nombre, condigoInterno, creador, descripcion, fechaCreacion, precio, caratula, valoracionGeneral, reviews, limitacionesTecnicas, aprobado));
    }
    
    @Override
    public Videojuego crearProducto(ArrayList<String> generos, ArrayList<String> otrasPlataformas, boolean multijugador, int jugadores, boolean online, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        return (new Videojuego(generos, otrasPlataformas, multijugador, jugadores, online, nombre, condigoInterno, creador, descripcion, fechaCreacion, precio, caratula, valoracionGeneral, reviews, limitacionesTecnicas, aprobado));
    }
}
