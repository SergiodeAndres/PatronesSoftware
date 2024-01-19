
package proyecto.clases;

import java.util.ArrayList;


public interface Servidor {
    public void addCliente(Cliente c);
    
    public void addCreadores(Creador c);
    
    public void addCodigoDescuento(CodigoDescuento cd);
    
    public void addCuentaBancaria(CuentaBancaria cb);
    
    public void removeCodigoDescuento(String cd);
    
    public void guardarClientes();
    
    public void guardarCreadores();
    
    public void guardarCodigosDescuento();
    
    public void guardarCuentasBancarias();
    
    public int correoValido(String correo);
    
    public void cargarClientes();
           
    public void cargarCreadores();
    
    public void cargarCodigosDescuento();
    
    public void cargarCuentasBancarias();
    
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
    
    public boolean comprobarCuentaBancaria(String numeroCuenta);
    
    public Creador esCreador(String correo);
    
    public void cargarFacturas();
    
    public void guardarFacturas();
    
    public void addProductividad(Productividad p);
    
    public void guardarProductividad();
    
    public void cargarProductividad();
    
    public void addAntivirus(Antivirus s);
    
    public void guardarAntivirus();
    
    public void cargarAntivirus();
    
    public void addVideojuego(Videojuego v);
    
    public void guardarVideojuegos();
    
    public void cargarVideojuegos();
    
    public ArrayList<Videojuego> getVideojuegos();
    
    public ArrayList<Productividad> getProductividad();
    
    public ArrayList<Antivirus> getAntivirus();
    
    public ArrayList<Factura> getFacturas();
    
    public void removeVideojuego(String codigoInterno);
    
    public void removeProductividad(String codigoInterno);
    
    public void removeAntivirus(String codigoInterno);
    
    public Producto getProductoByCodigo(String codigoInterno);
    
    public void addSujeto(Sujeto s);
    
    public void removeSujeto(Sujeto s);
    
    public void cargarSujetos();
    
    public void guardarSujetos();
    
    public boolean clienteSuscritoProducto(Cliente c, Producto p);
    
    public Sujeto getSujetoProducto(Producto p);
    
    public Producto getProductoByNombre(String nombre);
    
    public Cliente getClientebyCorreo(String correo);
    
    public void addFactura(Factura f);
    
    public ArrayList<CodigoDescuento> getCodigosDescuentoPorProducto(Producto p);
}
