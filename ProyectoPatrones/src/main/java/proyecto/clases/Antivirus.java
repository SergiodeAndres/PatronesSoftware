package proyecto.clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Antivirus extends Producto {
    private String versionActual;
    private LocalDate fechaVersionActual;
    private ArrayList<String> certificaciones;

    public Antivirus(String versionActual, LocalDate fechaVersionActual, ArrayList<String> certificaciones, String nombre, String condigoInterno, Creador creador, String descripcion, LocalDate fechaCreacion, Dolar precio, String caratula, String valoracionGeneral, ArrayList<Review> reviews, ArrayList<String> limitacionesTecnicas, boolean aprobado) {
        super(nombre, condigoInterno, creador, descripcion, fechaCreacion, precio, caratula, valoracionGeneral, reviews, limitacionesTecnicas, aprobado);
        this.versionActual = versionActual;
        this.fechaVersionActual = fechaVersionActual;
        this.certificaciones = certificaciones;
    }

    /**
     * Get the value of certificaciones
     *
     * @return the value of certificaciones
     */
    public ArrayList<String> getCertificaciones() {
        return certificaciones;
    }

    /**
     * Set the value of certificaciones
     *
     * @param certificaciones new value of certificaciones
     */
    public void setCertificaciones(ArrayList<String> certificaciones) {
        this.certificaciones = certificaciones;
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
