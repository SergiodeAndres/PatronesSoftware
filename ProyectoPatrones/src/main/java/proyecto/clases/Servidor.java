
package proyecto.clases;


public interface Servidor {
    public abstract void addCliente(Cliente c);
    
    public abstract void addCreadores(Creador c);
    
    public abstract void guardarClientes();
    
    public abstract void guardarCreadores();
    
    public abstract int correoValido(String correo);
    
    public abstract void cargarClientes();
           
    public abstract void cargarCreadores();
    
    public abstract boolean comprobarContraseña(String correo, String con);
}
