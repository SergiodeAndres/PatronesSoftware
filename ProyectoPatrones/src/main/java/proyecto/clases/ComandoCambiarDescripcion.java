/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

/**
 *
 * @author sergi
 */
public class ComandoCambiarDescripcion implements Comando{
    private Producto producto;
    private String descripcion;

    public ComandoCambiarDescripcion(Producto producto, String descripcion) {
        this.producto = producto;
        this.descripcion = descripcion;
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
     * Get the value of descripcion
     *
     * @return the value of descripcion
     */
    
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Set the value of descripcion
     *
     * @param descripcion new value of descripcion
     */
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void ejecutar() {
        producto.setDescripcion(descripcion);
    }

}
