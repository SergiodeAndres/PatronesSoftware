package proyecto.clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class FactoriaAntivirus implements Factoria{
    
    private static FactoriaAntivirus instanciaUnica;

    private FactoriaAntivirus() {
    }
    
    /**
     * Get the value of instanciaUnica
     *
     * @return the value of instanciaUnica
     */
    public static FactoriaAntivirus getInstanciaUnica() {
        if (instanciaUnica == null)
        {
            instanciaUnica = new FactoriaAntivirus();
        }
        return instanciaUnica;
    }

    @Override
    public Antivirus crearProducto(String versionActual, LocalDate fechaVersionActual, ArrayList<String> certificaciones, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        return (new Antivirus(versionActual, fechaVersionActual, certificaciones, nombre, condigoInterno, creador, descripcion, fechaCreacion, precio, caratula, valoracionGeneral, reviews, limitacionesTecnicas, aprobado));
    }

    @Override
    public Videojuego crearProducto(ArrayList<String> generos, ArrayList<String> otrasPlataformas, boolean multijugador, int jugadores, boolean online, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Productividad crearProducto(String versionActual, LocalDate fechaVersionActual, String tipo, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
