package proyecto.clases;


public class Usuario {
    
    private String correo;
    private String contraseña;

    public Usuario(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    /**
     * Get the value of contraseña
     *
     * @return the value of contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Set the value of contraseña
     *
     * @param contraseña new value of contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    /**
     * Get the value of correo
     *
     * @return the value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Set the value of correo
     *
     * @param correo new value of correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
