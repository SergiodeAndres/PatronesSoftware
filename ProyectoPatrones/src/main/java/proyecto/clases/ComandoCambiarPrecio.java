/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

/**
 *
 * @author sergi
 */
public class ComandoCambiarPrecio implements Comando{
    private Producto producto;
    private Dolar Precio;

    public ComandoCambiarPrecio(Producto producto, Dolar Precio) {
        this.producto = producto;
        this.Precio = Precio;
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
     * Get the value of Precio
     *
     * @return the value of Precio
     */
    
    public Dolar getPrecio() {
        return Precio;
    }

    /**
     * Set the value of Precio
     *
     * @param Precio new value of Precio
     */
    
    public void setPrecio(Dolar Precio) {
        this.Precio = Precio;
    }

    @Override
    public void ejecutar() {
        producto.setPrecio(Precio);
    }

}
