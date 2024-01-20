
package proyecto.clases;

import java.io.Serializable;

public class Review implements Serializable{
    private boolean positiva;
    private String comentario;
    private Cliente cliente;

    public Review(boolean positiva, String comentario, Cliente cliente) {
        this.positiva = positiva;
        this.comentario = comentario;
        this.cliente = cliente;
    }

    /**
     * Get the value of cliente
     *
     * @return the value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Set the value of cliente
     *
     * @param cliente new value of cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    /**
     * Get the value of comentario
     *
     * @return the value of comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Set the value of comentario
     *
     * @param comentario new value of comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    /**
     * Get the value of positiva
     *
     * @return the value of positiva
     */
    public boolean isPositiva() {
        return positiva;
    }

    /**
     * Set the value of positiva
     *
     * @param positiva new value of positiva
     */
    public void setPositiva(boolean positiva) {
        this.positiva = positiva;
    }

    @Override
    public String toString() {
        return "Review: " + positiva + ", comentario=" + comentario + '}';
    }

}
