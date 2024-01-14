package proyecto.clases;

import java.util.ArrayList;

public class AgregadoConcreto implements Agregado {
    
    private ArrayList elementos;
    public AgregadoConcreto(ArrayList elementos) {
        this.elementos = elementos;
    }
    
    

    /**
     * Get the value of elementos
     *
     * @return the value of elementos
     */
    public ArrayList getElementos() {
        return elementos;
    }

    /**
     * Set the value of elementos
     *
     * @param elementos new value of elementos
     */
    public void setElementos(ArrayList elementos) {
        this.elementos = elementos;
    }

}
