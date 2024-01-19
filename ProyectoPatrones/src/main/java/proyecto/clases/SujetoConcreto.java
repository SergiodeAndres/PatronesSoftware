package proyecto.clases;

import java.io.Serializable;
import java.util.ArrayList;

public class SujetoConcreto implements Sujeto, Serializable{
    private Producto producto;
    private ArrayList<Observador> observadores = new ArrayList<>();

    /**
     * Get the value of observadores
     *
     * @return the value of observadores
     */
    @Override
    public ArrayList<Observador> getObservadores() {
        return observadores;
    }

    /**
     * Set the value of observadores
     *
     * @param observadores new value of observadores
     */
    @Override
    public void setObservadores(ArrayList<Observador> observadores) {
        this.observadores = observadores;
    }


    /**
     * Get the value of producto
     *
     * @return the value of producto
     */
    @Override
    public Producto getProducto() {
        return producto;
    }

    /**
     * Set the value of producto
     *
     * @param producto new value of producto
     */
    @Override
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void notificarObservadores() {
        Object[] obArray = observadores.toArray();

        for (int i = 0; i < obArray.length; ++i) {
            Observador o = (Observador) obArray[i];
            o.actualizar();
        }
    }

}
