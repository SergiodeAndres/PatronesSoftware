/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

/**
 *
 * @author sergi
 */
public class ComandoCambiarCaratula implements Comando{
    private Producto producto;
    private String Caratula;

    public ComandoCambiarCaratula(Producto producto, String Caratula) {
        this.producto = producto;
        this.Caratula = Caratula;
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
     * Get the value of Caratula
     *
     * @return the value of Caratula
     */
    
    public String getCaratula() {
        return Caratula;
    }

    /**
     * Set the value of Caratula
     *
     * @param Caratula new value of Caratula
     */
    
    public void setCaratula(String Caratula) {
        this.Caratula = Caratula;
    }

    @Override
    public void ejecutar() {
        producto.setCaratula(Caratula);
    }

}
