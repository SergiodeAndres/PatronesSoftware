/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

/**
 *
 * @author sergi
 */
public class ComandoCambiarNombre implements Comando{
    private Producto producto;
    private String nombre;

    public ComandoCambiarNombre(Producto producto, String nombre) {
        this.producto = producto;
        this.nombre = nombre;
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
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void ejecutar() {
        producto.setNombre(nombre);
    }

}
