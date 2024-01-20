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
public class ComandoCambiarGeneros implements Comando{
    private Producto producto;
    private ArrayList<String> Generos;

    public ComandoCambiarGeneros(Producto producto, ArrayList<String> Generos) {
        this.producto = producto;
        this.Generos = Generos;
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
     * Get the value of Generos
     *
     * @return the value of Generos
     */
    
    public ArrayList<String> getGeneros() {
        return Generos;
    }

    /**
     * Set the value of Generos
     *
     * @param Generos new value of Generos
     */
    
    public void setGeneros(ArrayList<String> Generos) {
        this.Generos = Generos;
    }

    @Override
    public void ejecutar() {
        Videojuego v = (Videojuego) producto;
        v.setGeneros(Generos);
    }

}
