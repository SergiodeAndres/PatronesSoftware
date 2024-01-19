package proyecto.clases;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    private String nombreUsuario;
    private String pais;
    private ArrayList<String> notificaciones;
    private ArrayList<CodigoDescuento> llavero;
    private ArrayList<Producto> libreria;
    private double saldo;

    public Cliente(String nombreUsuario, String pais, ArrayList<String> notificaciones, ArrayList<CodigoDescuento> llavero, ArrayList<Producto> libreria, double saldo, String correo, String contraseña) {
        super(correo, contraseña);
        this.nombreUsuario = nombreUsuario;
        this.pais = pais;
        this.notificaciones = notificaciones;
        this.llavero = llavero;
        this.libreria = libreria;
        this.saldo = saldo;
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
    
    /**
     * Get the value of saldo
     *
     * @return the value of saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Set the value of saldo
     *
     * @param saldo new value of saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void addCodigoDescuento(CodigoDescuento cd) {
        this.llavero.add(cd);
    }
    
    public void addNotificacion(String notificacion) {
        notificaciones.add(notificacion);
    }
    
    public void removeNotificacion(int indice) {
        notificaciones.remove(indice);
    }
    
    public void removeCodigo(int indice) {
        llavero.remove(indice);
    }
    
    public void addProducto(Producto p) {
        libreria.add(p);
    }
    
    public CodigoDescuento getCodigoFromLlavero(String c) {
        CodigoDescuento codigo = null; 
        for (CodigoDescuento cd : llavero)
        {
            if (cd.getCodigo().equals(c))
            {
                codigo = cd;
            }
        }
        return codigo;
    }
}
