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
public class ComandoCambiarLimitaciones implements Comando{
    private Producto producto;
    private ArrayList<String> LimitacionesTecnicas;

    public ComandoCambiarLimitaciones(Producto producto, ArrayList<String> LimitacionesTecnicas) {
        this.producto = producto;
        this.LimitacionesTecnicas = LimitacionesTecnicas;
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
     * Get the value of LimitacionesTecnicas
     *
     * @return the value of LimitacionesTecnicas
     */
    
    public ArrayList<String> getLimitacionesTecnicas() {
        return LimitacionesTecnicas;
    }

    /**
     * Set the value of LimitacionesTecnicas
     *
     * @param LimitacionesTecnicas new value of LimitacionesTecnicas
     */
    
    public void setLimitacionesTecnicas(ArrayList<String> LimitacionesTecnicas) {
        this.LimitacionesTecnicas = LimitacionesTecnicas;
    }

    @Override
    public void ejecutar() {
        producto.setLimitacionesTecnicas(LimitacionesTecnicas);
    }

}
