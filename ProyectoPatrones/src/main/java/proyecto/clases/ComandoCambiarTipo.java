/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

/**
 *
 * @author sergi
 */
public class ComandoCambiarTipo implements Comando{
    private Producto producto;
    private String Tipo;

    public ComandoCambiarTipo(Producto producto, String Tipo) {
        this.producto = producto;
        this.Tipo = Tipo;
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
     * Get the value of Tipo
     *
     * @return the value of Tipo
     */
    
    public String getTipo() {
        return Tipo;
    }

    /**
     * Set the value of Tipo
     *
     * @param Tipo new value of Tipo
     */
    
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public void ejecutar() {
        Productividad p = (Productividad) producto;
        p.setTipo(Tipo);
    }

}
