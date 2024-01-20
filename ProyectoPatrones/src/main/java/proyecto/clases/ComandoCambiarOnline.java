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
public class ComandoCambiarOnline implements Comando{
    private Producto producto;
    private boolean Online;

    public ComandoCambiarOnline(Producto producto, boolean Online) {
        this.producto = producto;
        this.Online = Online;
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
     * Get the value of Online
     *
     * @return the value of Online
     */
    
    public boolean getOnline() {
        return Online;
    }

    /**
     * Set the value of Online
     *
     * @param Online new value of Online
     */
    
    public void setOnline(boolean Online) {
        this.Online = Online;
    }

    @Override
    public void ejecutar() {
        Videojuego v = (Videojuego) producto;
        v.setOnline(Online);
    }

}
