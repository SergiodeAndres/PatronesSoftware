package proyecto.clases;

import java.io.Serializable;

public class Dolar implements Serializable{
    private double cantidad;

    public Dolar(double cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * Get the value of cantidad
     *
     * @return the value of cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Set the value of cantidad
     *
     * @param cantidad new value of cantidad
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Dolar{" + "cantidad=" + cantidad + '}';
    }

}
