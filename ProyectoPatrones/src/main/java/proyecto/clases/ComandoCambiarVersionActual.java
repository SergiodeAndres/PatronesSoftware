/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

import java.time.LocalDate;

/**
 *
 * @author sergi
 */
public class ComandoCambiarVersionActual implements Comando{
    private Producto producto;
    private String VersionActual;

    public ComandoCambiarVersionActual(Producto producto, String VersionActual) {
        this.producto = producto;
        this.VersionActual = VersionActual;
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
     * Get the value of VersionActual
     *
     * @return the value of VersionActual
     */
    
    public String getVersionActual() {
        return VersionActual;
    }

    /**
     * Set the value of VersionActual
     *
     * @param VersionActual new value of VersionActual
     */
    
    public void setVersionActual(String VersionActual) {
        this.VersionActual = VersionActual;
    }

    @Override
    public void ejecutar() {
        if (producto instanceof Productividad)
        {
            Productividad p = (Productividad) producto;
            p.setVersionActual(VersionActual);
            p.setFechaVersionActual(LocalDate.now());
        }
        else 
        {
            Antivirus a = (Antivirus) producto;
            a.setVersionActual(VersionActual);
            a.setFechaVersionActual(LocalDate.now());
        }
        
    }

}
