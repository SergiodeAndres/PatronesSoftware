/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

/**
 *
 * @author sergi
 */
public class FactoriaVideojuego implements Factoria {
    
    private FactoriaVideojuego instanciaUnica;
    

    /**
     * Get the value of instanciaUnica
     *
     * @return the value of instanciaUnica
     */
    public FactoriaVideojuego getInstanciaUnica() {
        return instanciaUnica;
    }

    /**
     * Set the value of instanciaUnica
     *
     * @param instanciaUnica new value of instanciaUnica
     */
    public void setInstanciaUnica(FactoriaVideojuego instanciaUnica) {
        this.instanciaUnica = instanciaUnica;
    }

    @Override
    public Producto crearProducto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
