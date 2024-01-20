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
public class ComandoCambiarOtrasPlataformas implements Comando{
    private Producto producto;
    private ArrayList<String> OtrasPlataformas;

    public ComandoCambiarOtrasPlataformas(Producto producto, ArrayList<String> OtrasPlataformas) {
        this.producto = producto;
        this.OtrasPlataformas = OtrasPlataformas;
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
     * Get the value of OtrasPlataformas
     *
     * @return the value of OtrasPlataformas
     */
    
    public ArrayList<String> getOtrasPlataformas() {
        return OtrasPlataformas;
    }

    /**
     * Set the value of OtrasPlataformas
     *
     * @param OtrasPlataformas new value of OtrasPlataformas
     */
    
    public void setOtrasPlataformas(ArrayList<String> OtrasPlataformas) {
        this.OtrasPlataformas = OtrasPlataformas;
    }

    @Override
    public void ejecutar() {
        Videojuego v = (Videojuego) producto;
        v.setOtrasPlataformas(OtrasPlataformas);
    }

}
