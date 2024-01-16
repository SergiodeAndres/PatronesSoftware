
package proyecto.clases;


public interface Servidor {
    public void addCliente(Cliente c);
    
    public void addCreadores(Creador c);
    
    public void addCodigoDescuento(CodigoDescuento cd);
    
    public void removeCodigoDescuento(String cd);
    
    public void guardarClientes();
    
    public void guardarCreadores();
    
    public void guardarCodigosDescuento();
    
    public int correoValido(String correo);
    
    public void cargarClientes();
           
    public void cargarCreadores();
    
    public void cargarCodigosDescuento();
    
    public boolean comprobarContraseña(String correo, String con);
    
    public Cliente esCliente(String correo);
    
    public boolean existeCodigoDescuento (String cd);
    
    public CodigoDescuento getCodigoDescuento (String cd);
    
    public void addTarjetaCredito(TarjetaCredito tc);
    
    public void guardarTarjetasCredito();
    
    public void cargarTarjetasCredito();
    
    public TarjetaCredito getTarjetaCredito (String numero);
    
    public boolean existeTarjetaCredito(String numero); 
    
    public boolean saldoSuficienteTarjetaCredito(String numero, double saldo);
}
