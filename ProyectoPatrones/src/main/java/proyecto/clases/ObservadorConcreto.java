
package proyecto.clases;

public class ObservadorConcreto implements Observador{
    
    private Cliente cliente;
    private Sujeto sujeto;

    /**
     * Get the value of sujeto
     *
     * @return the value of sujeto
     */
    public Sujeto getSujeto() {
        return sujeto;
    }

    /**
     * Set the value of sujeto
     *
     * @param sujeto new value of sujeto
     */
    public void setSujeto(Sujeto sujeto) {
        this.sujeto = sujeto;
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

}
