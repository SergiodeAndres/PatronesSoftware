/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public class ComandoCambiarMultijugador implements Comando{
    private Producto producto;
    private boolean Multijugador;

    public ComandoCambiarMultijugador(Producto producto, boolean Multijugador) {
        this.producto = producto;
        this.Multijugador = Multijugador;
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
     * Get the value of Multijugador
     *
     * @return the value of Multijugador
     */
    
    public boolean getMultijugador() {
        return Multijugador;
    }

    /**
     * Set the value of Multijugador
     *
     * @param Multijugador new value of Multijugador
     */
    
    public void setMultijugador(boolean Multijugador) {
        this.Multijugador = Multijugador;
    }

    @Override
    public void ejecutar() {
        Videojuego v = (Videojuego) producto;
        v.setMultijugador(Multijugador);
    }

}
