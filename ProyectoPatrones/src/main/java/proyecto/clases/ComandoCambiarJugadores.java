/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

/**
 *
 * @author sergi
 */
public class ComandoCambiarJugadores implements Comando{
    private Producto producto;
    private int Jugadores;

    public ComandoCambiarJugadores(Producto producto, int Jugadores) {
        this.producto = producto;
        this.Jugadores = Jugadores;
    }

    /**
     * Get the value of producto
     *
     * @return the value of producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Set the value of producto
     *
     * @param producto new value of producto
     */
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    /**
     * Get the value of Jugadores
     *
     * @return the value of Jugadores
     */
    
    public int getJugadores() {
        return Jugadores;
    }

    /**
     * Set the value of Jugadores
     *
     * @param Jugadores new value of Jugadores
     */
    
    public void setJugadores(int Jugadores) {
        this.Jugadores = Jugadores;
    }

    @Override
    public void ejecutar() {
        Videojuego v = (Videojuego) producto;
        v.setJugadores(Jugadores);
    }

}
