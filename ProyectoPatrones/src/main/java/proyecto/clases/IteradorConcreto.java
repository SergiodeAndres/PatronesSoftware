package proyecto.clases;

public class IteradorConcreto implements Iterador {
    
    private int indice;
    private AgregadoConcreto agregado;
    public IteradorConcreto(AgregadoConcreto agregado) {
        this.indice = 0;
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

    @Override
    public Object primero() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (!agregado.getElementos().isEmpty()) {
            indice = 0;
            objeto = agregado.getElementos().get(0);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    @Override
    public Object siguiente() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.getElementos().size()) {
            objeto = agregado.getElementos().get(indice);
            indice = indice + 1;
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    @Override
    public boolean hayMas() {
        boolean veredicto = true;
        if (agregado.getElementos().isEmpty() || indice == agregado.getElementos().size()) {
            veredicto = false;
        }
        return veredicto;
    }

    @Override
    public Object elementoActual() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.getElementos().size()) {
            objeto = agregado.getElementos().get(indice);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

}
