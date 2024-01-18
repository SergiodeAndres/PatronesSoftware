/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public abstract class Producto implements Serializable{
    private String nombre;
    private String condigoInterno;
    private Creador creador;
    private String descripcion;
    private LocalDate fechaCreacion;
    private Dolar precio;
    private String caratula;
    private String valoracionGeneral;
    private ArrayList<Review> reviews;
    private ArrayList<String> limitacionesTecnicas;
    private boolean aprobado;

    public Producto(String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        this.nombre = nombre;
        this.condigoInterno = condigoInterno;
        this.creador = creador;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.precio = precio;
        this.caratula = caratula;
        this.valoracionGeneral = valoracionGeneral;
        this.reviews = reviews;
        this.limitacionesTecnicas = limitacionesTecnicas;
        this.aprobado = aprobado;
    }

    /**
     * Get the value of aprobado
     *
     * @return the value of aprobado
     */
    public boolean isAprobado() {
        return aprobado;
    }

    /**
     * Set the value of aprobado
     *
     * @param aprobado new value of aprobado
     */
    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }


    /**
     * Get the value of limitacionesTecnicas
     *
     * @return the value of limitacionesTecnicas
     */
    public ArrayList<String> getLimitacionesTecnicas() {
        return limitacionesTecnicas;
    }

    /**
     * Set the value of limitacionesTecnicas
     *
     * @param limitacionesTecnicas new value of limitacionesTecnicas
     */
    public void setLimitacionesTecnicas(ArrayList<String> limitacionesTecnicas) {
        this.limitacionesTecnicas = limitacionesTecnicas;
    }


    /**
     * Get the value of reviews
     *
     * @return the value of reviews
     */
    public ArrayList<Review> getReviews() {
        return reviews;
    }

    /**
     * Set the value of reviews
     *
     * @param reviews new value of reviews
     */
    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }


    /**
     * Get the value of valoracionGeneral
     *
     * @return the value of valoracionGeneral
     */
    public String getValoracionGeneral() {
        return valoracionGeneral;
    }

    /**
     * Set the value of valoracionGeneral
     *
     * @param valoracionGeneral new value of valoracionGeneral
     */
    public void setValoracionGeneral(String valoracionGeneral) {
        this.valoracionGeneral = valoracionGeneral;
    }


    /**
     * Get the value of caratula
     *
     * @return the value of caratula
     */
    public String getCaratula() {
        return caratula;
    }

    /**
     * Set the value of caratula
     *
     * @param caratula new value of caratula
     */
    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }


    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public Dolar getPrecio() {
        return precio;
    }
    
    public double getPrecio(Cliente c) {
        Manejador manejadorDolar = new ManejadorMonedaDolar();
        Manejador manejadorEuro = new ManejadorMonedaEuro();
        Manejador manejadorOtro = new ManejadorMonedaOtro();
        manejadorDolar.setSucesor(manejadorEuro);
        manejadorEuro.setSucesor(manejadorOtro);
        return manejadorDolar.calcularPrecio(precio, c);
    }
    
    public double getPrecio(Creador cr) {
        Manejador manejadorDolar = new ManejadorMonedaDolar();
        Manejador manejadorEuro = new ManejadorMonedaEuro();
        Manejador manejadorOtro = new ManejadorMonedaOtro();
        manejadorDolar.setSucesor(manejadorEuro);
        manejadorEuro.setSucesor(manejadorOtro);
        return manejadorDolar.calcularPrecio(precio, cr);
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(Dolar precio) {
        this.precio = precio;
    }


    /**
     * Get the value of fechaCreacion
     *
     * @return the value of fechaCreacion
     */
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Set the value of fechaCreacion
     *
     * @param fechaCreacion new value of fechaCreacion
     */
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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


    /**
     * Get the value of creador
     *
     * @return the value of creador
     */
    public Creador getCreador() {
        return creador;
    }

    /**
     * Set the value of creador
     *
     * @param creador new value of creador
     */
    public void setCreador(Creador creador) {
        this.creador = creador;
    }

    
    /**
     * Get the value of condigoInterno
     *
     * @return the value of condigoInterno
     */
    public String getCondigoInterno() {
        return condigoInterno;
    }

    /**
     * Set the value of condigoInterno
     *
     * @param condigoInterno new value of condigoInterno
     */
    public void setCondigoInterno(String condigoInterno) {
        this.condigoInterno = condigoInterno;
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
   
}
