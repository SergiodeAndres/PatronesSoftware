package proyecto.clases;

public class AdaptadorMonedaOtro implements OtraMoneda{
    
    private Dolar dolares;

    public AdaptadorMonedaOtro(Dolar dolares) {
        this.dolares = dolares;
    }
    /**
     * Get the value of dolares
     *
     * @return the value of dolares
     */
    public Dolar getDolares() {
        return dolares;
    }

    /**
     * Set the value of dolares
     *
     * @param dolares new value of dolares
     */
    public void setDolares(Dolar dolares) {
        this.dolares = dolares;
    }

    @Override
    public double getPrecio() {
        return Math.round((dolares.getCantidad() * 1.05)*100)/100.0;
    }

}
