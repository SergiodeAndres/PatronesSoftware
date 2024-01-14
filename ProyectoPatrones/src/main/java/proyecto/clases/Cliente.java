package proyecto.clases;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    private String nombreUsuario;
    private String pais;
    private ArrayList<String> notificaciones;
    private ArrayList<CodigoDescuento> llavero;
    private ArrayList<Producto> libreria;

    public Cliente(String nombreUsuario, String pais, ArrayList<String> notificaciones, ArrayList<CodigoDescuento> llavero, ArrayList<Producto> libreria, String correo, String contraseña) {
        super(correo, contraseña);
        this.nombreUsuario = nombreUsuario;
        this.pais = pais;
        this.notificaciones = notificaciones;
        this.llavero = llavero;
        this.libreria = libreria;
    }

    /**
     * Get the value of libreria
     *
     * @return the value of libreria
     */
    public ArrayList<Producto> getLibreria() {
        return libreria;
    }

    /**
     * Set the value of libreria
     *
     * @param libreria new value of libreria
     */
    public void setLibreria(ArrayList<Producto> libreria) {
        this.libreria = libreria;
    }


    /**
     * Get the value of llavero
     *
     * @return the value of llavero
     */
    public ArrayList<CodigoDescuento> getLlavero() {
        return llavero;
    }

    /**
     * Set the value of llavero
     *
     * @param llavero new value of llavero
     */
    public void setLlavero(ArrayList<CodigoDescuento> llavero) {
        this.llavero = llavero;
    }

    /**
     * Get the value of notificaciones
     *
     * @return the value of notificaciones
     */
    public ArrayList<String> getNotificaciones() {
        return notificaciones;
    }

    /**
     * Set the value of notificaciones
     *
     * @param notificaciones new value of notificaciones
     */
    public void setNotificaciones(ArrayList<String> notificaciones) {
        this.notificaciones = notificaciones;
    }


    /**
     * Get the value of pais
     *
     * @return the value of pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Set the value of pais
     *
     * @param pais new value of pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Get the value of nombreUsuario
     *
     * @return the value of nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Set the value of nombreUsuario
     *
     * @param nombreUsuario new value of nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

}
