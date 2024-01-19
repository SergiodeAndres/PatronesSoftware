
package proyecto.clases;


public interface Observador {
    
    public Sujeto getSujeto();

    public void setSujeto(Sujeto sujeto);
    
    public Cliente getCliente();
    
    public void setCliente(Cliente cliente);
    
    public void actualizar();
}
