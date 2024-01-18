package proyecto.clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Productividad extends Producto{
    private String versionActual;
    private LocalDate fechaVersionActual;
    private String tipo;

    public Productividad(String versionActual, LocalDate fechaVersionActual, String tipo, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        super(nombre, condigoInterno, creador, descripcion, fechaCreacion, precio, caratula, valoracionGeneral, reviews, limitacionesTecnicas, aprobado);
        this.versionActual = versionActual;
        this.fechaVersionActual = fechaVersionActual;
        this.tipo = tipo;
    }

    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Set the value of tipo
     *
     * @param tipo new value of tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * Get the value of fechaVersionActual
     *
     * @return the value of fechaVersionActual
     */
    public LocalDate getFechaVersionActual() {
        return fechaVersionActual;
    }

    /**
     * Set the value of fechaVersionActual
     *
     * @param fechaVersionActual new value of fechaVersionActual
     */
    public void setFechaVersionActual(LocalDate fechaVersionActual) {
        this.fechaVersionActual = fechaVersionActual;
    }


    /**
     * Get the value of versionActual
     *
     * @return the value of versionActual
     */
    public String getVersionActual() {
        return versionActual;
    }

    /**
     * Set the value of versionActual
     *
     * @param versionActual new value of versionActual
     */
    public void setVersionActual(String versionActual) {
        this.versionActual = versionActual;
    }

}
