
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

    @Override
    public void addCliente(Cliente c){
        servidor.addCliente(c);
    }
    
    @Override
    public void addCreadores(Creador c){
        servidor.addCreadores(c);
    }
    
    @Override
    public void guardarClientes(){
        servidor.guardarClientes();
    }
    
    @Override
    public void cargarClientes(){
        servidor.cargarClientes();
    }
    
    @Override
    public void guardarCreadores(){
        servidor.guardarCreadores();
    }
    
    @Override
    public void cargarCreadores(){
        servidor.cargarCreadores();
    }
    
    @Override
    public int correoValido(String correo){
        return servidor.correoValido(correo);
    }
    
    @Override
    public boolean comprobarContraseña(String correo, String con){
        return servidor.comprobarContraseña(correo, con);
    }
    
    @Override
    public Cliente esCliente(String correo) {
        return servidor.esCliente(correo);
    }

}
