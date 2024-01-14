/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

/**
 *
 * @author sergi
 */
public class FactoriaProductividad implements Factoria{
    
    private FactoriaProductividad instanciaUnica;

    /**
     * Get the value of instanciaUnica
     *
     * @return the value of instanciaUnica
     */
    public FactoriaProductividad getInstanciaUnica() {
        return instanciaUnica;
    }

    /**
     * Set the value of instanciaUnica
     *
     * @param instanciaUnica new value of instanciaUnica
     */
    public void setInstanciaUnica(FactoriaProductividad instanciaUnica) {
        this.instanciaUnica = instanciaUnica;
    }

    @Override
    public Producto crearProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
