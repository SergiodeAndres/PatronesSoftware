
package proyecto.clases;

public class Review {
    private boolean positiva;
    private String comentario;

    public Review(boolean positiva, String comentario) {
        this.positiva = positiva;
        this.comentario = comentario;
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

}
