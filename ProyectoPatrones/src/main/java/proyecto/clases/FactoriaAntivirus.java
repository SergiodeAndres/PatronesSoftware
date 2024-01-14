package proyecto.clases;

public class FactoriaAntivirus implements Factoria{
    
    private FactoriaAntivirus instanciaUnica;

    /**
     * Get the value of instanciaUnica
     *
     * @return the value of instanciaUnica
     */
    public FactoriaAntivirus getInstanciaUnica() {
        return instanciaUnica;
    }

    /**
     * Set the value of instanciaUnica
     *
     * @param instanciaUnica new value of instanciaUnica
     */
    public void setInstanciaUnica(FactoriaAntivirus instanciaUnica) {
        this.instanciaUnica = instanciaUnica;
    }

    @Override
    public Producto crearProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
