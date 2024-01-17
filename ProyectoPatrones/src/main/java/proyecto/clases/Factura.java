package proyecto.clases;

import java.time.LocalDate;

public class Factura {
    
    private Cliente cliente;
    private Producto producto;
    private LocalDate fechaCompra;
    private Dolar precioFinal;

    public Factura(Cliente cliente, Producto producto, LocalDate fechaCompra, Dolar precioFinal) {
        this.cliente = cliente;
        this.producto = producto;
        this.fechaCompra = fechaCompra;
        this.precioFinal = precioFinal;
    }

    /**
     * Get the value of precioFinal
     *
     * @return the value of precioFinal
     */
    public Dolar getPrecioFinal() {
        return precioFinal;
    }

    /**
     * Set the value of precioFinal
     *
     * @param precioFinal new value of precioFinal
     */
    public void setPrecioFinal(Dolar precioFinal) {
        this.precioFinal = precioFinal;
    }


    /**
     * Get the value of fechaCompra
     *
     * @return the value of fechaCompra
     */
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Set the value of fechaCompra
     *
     * @param fechaCompra new value of fechaCompra
     */
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
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
     * Get the value of cliente
     *
     * @return the value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Set the value of cliente
     *
     * @param cliente new value of cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
