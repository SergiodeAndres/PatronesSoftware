
package proyecto.clases;


public interface Servidor {
    public void addCliente(Cliente c);
    
    public void addCreadores(Creador c);
    
    public void guardarClientes();
    
    public void guardarCreadores();
    
    public int correoValido(String correo);
    
    public void cargarClientes();
           
    public void cargarCreadores();
    
    public boolean comprobarContraseña(String correo, String con);
    
    public Cliente esCliente(String correo);
}
