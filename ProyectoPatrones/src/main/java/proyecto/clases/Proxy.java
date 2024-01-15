
package proyecto.clases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


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

    public void addCliente(Cliente c){
        servidor.addCliente(c);
    }
    
    public void addCreadores(Creador c){
        servidor.addCreadores(c);
    }
    
    public void guardarClientes(){
        servidor.guardarClientes();
    }
    
    public void cargarClientes(){
        servidor.cargarClientes();
    }
    
    public void guardarCreadores(){
        servidor.guardarCreadores();
    }
    
    public void cargarCreadores(){
        servidor.cargarCreadores();
    }
    
    public int correoValido(String correo){
        return servidor.correoValido(correo);
    }
    
    public boolean comprobarContraseña(String correo, String con){
        return servidor.comprobarContraseña(correo, con);
    }

}
