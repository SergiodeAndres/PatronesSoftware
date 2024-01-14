package proyecto.clases;

import java.util.ArrayList;

public class SujetoConcreto implements Sujeto {
    private Producto producto;
    private ArrayList<Observador> observadores;

    /**
     * Get the value of observadores
     *
     * @return the value of observadores
     */
    public ArrayList<Observador> getObservadores() {
        return observadores;
    }

    /**
     * Set the value of observadores
     *
     * @param observadores new value of observadores
     */
    public void setObservadores(ArrayList<Observador> observadores) {
        this.observadores = observadores;
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

}
