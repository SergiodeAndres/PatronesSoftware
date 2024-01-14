
package proyecto.clases;

import java.time.LocalDate;
import java.util.ArrayList;


public class Videojuego extends Producto {
    
    private ArrayList<String> generos;
    private ArrayList<String> otrasPlataformas;
    private boolean multijugador;
    private int jugadores;
    private boolean online;
    public Videojuego(ArrayList<String> generos, ArrayList<String> otrasPlataformas, boolean multijugador, int jugadores, boolean online, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        super(nombre, condigoInterno, creador, descripcion, fechaCreacion, precio, caratula, valoracionGeneral, reviews, limitacionesTecnicas, aprobado);
        this.generos = generos;
        this.otrasPlataformas = otrasPlataformas;
        this.multijugador = multijugador;
        this.jugadores = jugadores;
        this.online = online;
    }
    
    /**
     * Get the value of online
     *
     * @return the value of online
     */
    public boolean isOnline() {
        return online;
    }

    /**
     * Set the value of online
     *
     * @param online new value of online
     */
    public void setOnline(boolean online) {
        this.online = online;
    }


    /**
     * Get the value of jugadores
     *
     * @return the value of jugadores
     */
    public int getJugadores() {
        return jugadores;
    }

    /**
     * Set the value of jugadores
     *
     * @param jugadores new value of jugadores
     */
    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }


    /**
     * Get the value of multijugador
     *
     * @return the value of multijugador
     */
    public boolean isMultijugador() {
        return multijugador;
    }

    /**
     * Set the value of multijugador
     *
     * @param multijugador new value of multijugador
     */
    public void setMultijugador(boolean multijugador) {
        this.multijugador = multijugador;
    }


    /**
     * Get the value of otrasPlataformas
     *
     * @return the value of otrasPlataformas
     */
    public ArrayList<String> getOtrasPlataformas() {
        return otrasPlataformas;
    }

    /**
     * Set the value of otrasPlataformas
     *
     * @param otrasPlataformas new value of otrasPlataformas
     */
    public void setOtrasPlataformas(ArrayList<String> otrasPlataformas) {
        this.otrasPlataformas = otrasPlataformas;
    }


    /**
     * Get the value of generos
     *
     * @return the value of generos
     */
    public ArrayList<String> getGeneros() {
        return generos;
    }

    /**
     * Set the value of generos
     *
     * @param generos new value of generos
     */
    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

}
