
package proyecto.clases;


public class Proxy implements Servidor {
    
    private ServidorBBDD servidor;

    public Proxy(ServidorBBDD servidor) {
        this.servidor = servidor;
    }
    
    /**
     * Get the value of servidor
     *
     * @return the value of servidor
     */
    public ServidorBBDD getServidor() {
        return servidor;
    }

    /**
     * Set the value of servidor
     *
     * @param servidor new value of servidor
     */
    public void setServidor(ServidorBBDD servidor) {
        this.servidor = servidor;
    }

}
