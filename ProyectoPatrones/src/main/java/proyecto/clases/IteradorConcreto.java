package proyecto.clases;

public class IteradorConcreto implements Iterador {
    
    private int indice;
    private AgregadoConcreto agregado;
    public IteradorConcreto(int indice, AgregadoConcreto agregado) {
        this.indice = indice;
        this.agregado = agregado;
    }
    
    /**
     * Get the value of agregado
     *
     * @return the value of agregado
     */
    public AgregadoConcreto getAgregado() {
        return agregado;
    }

    /**
     * Set the value of agregado
     *
     * @param agregado new value of agregado
     */
    public void setAgregado(AgregadoConcreto agregado) {
        this.agregado = agregado;
    }

    /**
     * Get the value of indice
     *
     * @return the value of indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * Set the value of indice
     *
     * @param indice new value of indice
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

}
