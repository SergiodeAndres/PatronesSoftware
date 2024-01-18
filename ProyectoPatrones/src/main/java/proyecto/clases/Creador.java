package proyecto.clases;

public class Creador extends Usuario {
    
    private String nombreUsuario;
    private String pais;
    private String tipo;
    private CuentaBancaria cuentaBancaria;

    public Creador(String nombreUsuario, String pais, String tipo, CuentaBancaria cuentaBancaria, String correo, String contraseña) {
        super(correo, contraseña);
        this.nombreUsuario = nombreUsuario;
        this.pais = pais;
        this.tipo = tipo;
        this.cuentaBancaria = cuentaBancaria;
    }

    /**
     * Get the value of cuentaBancaria
     *
     * @return the value of cuentaBancaria
     */
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    /**
     * Set the value of cuentaBancaria
     *
     * @param cuentaBancaria new value of cuentaBancaria
     */
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
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

    @Override
    public String toString() {
        return "Creador{" + "nombreUsuario=" + nombreUsuario + ", pais=" + pais + ", tipo=" + tipo + ", cuentaBancaria=" + cuentaBancaria + '}';
    }

}
