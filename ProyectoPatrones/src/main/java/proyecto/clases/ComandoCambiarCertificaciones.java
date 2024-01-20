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
public class ComandoCambiarCertificaciones implements Comando{
    private Producto producto;
    private ArrayList<String> Certificaciones;

    public ComandoCambiarCertificaciones(Producto producto, ArrayList<String> Certificaciones) {
        this.producto = producto;
        this.Certificaciones = Certificaciones;
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
     * Get the value of Certificaciones
     *
     * @return the value of Certificaciones
     */
    
    public ArrayList<String> getCertificaciones() {
        return Certificaciones;
    }

    /**
     * Set the value of Certificaciones
     *
     * @param Certificaciones new value of Certificaciones
     */
    
    public void setCertificaciones(ArrayList<String> Certificaciones) {
        this.Certificaciones = Certificaciones;
    }

    @Override
    public void ejecutar() {
        Antivirus a = (Antivirus) producto;
        a.setCertificaciones(Certificaciones);
    }

}
