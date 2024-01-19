package proyecto.clases;

import java.io.Serializable;

public class CodigoDescuento implements Serializable{
    
    private String codigo;
    private double cantidad;
    private Producto producto;

    public CodigoDescuento(String codigo, double cantidad, Producto producto) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.producto = producto;
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
     * Get the value of cantidad
     *
     * @return the value of cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Set the value of cantidad
     *
     * @param cantidad new value of cantidad
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set the value of codigo
     *
     * @param codigo new value of codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
