
package proyecto.clases;

public abstract class Manejador {
    
    private Manejador sucesor;

    /**
     * Get the value of sucesor
     *
     * @return the value of sucesor
     */
    public Manejador getSucesor() {
        return sucesor;
    }

    /**
     * Set the value of sucesor
     *
     * @param sucesor new value of sucesor
     */
    public void setSucesor(Manejador sucesor) {
        this.sucesor = sucesor;
    }

}
