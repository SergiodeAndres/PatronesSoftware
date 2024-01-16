package proyecto.clases;
import java.io.Serializable;

public class TarjetaCredito implements Serializable{
    
    private String numeroTarjeta;
    private double saldo;

    public TarjetaCredito(String numeroTarjeta, double saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
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

    /**
     * Get the value of numeroTarjeta
     *
     * @return the value of numeroTarjeta
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Set the value of numeroTarjeta
     *
     * @param numeroTarjeta new value of numeroTarjeta
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

}
