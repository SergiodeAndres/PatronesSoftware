package proyecto.clases;

public class AdaptadorMonedaX {
    
    private Dolar dolares;

    public AdaptadorMonedaX(Dolar dolares) {
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

}
