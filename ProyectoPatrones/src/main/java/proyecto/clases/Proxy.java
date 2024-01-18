
package proyecto.clases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


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
    public void addCuentaBancaria(CuentaBancaria cb){
        servidor.addCuentaBancaria(cb);
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
    public void guardarCuentasBancarias(){
        servidor.guardarCuentasBancarias();
    }
    
    @Override
    public void cargarCuentasBancarias(){
        servidor.cargarCuentasBancarias();
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

    @Override
    public void addCodigoDescuento(CodigoDescuento cd) {
        servidor.addCodigoDescuento(cd);
    }

    @Override
    public void removeCodigoDescuento(String cd) {
        servidor.removeCodigoDescuento(cd);
    }

    @Override
    public void guardarCodigosDescuento() {
        servidor.guardarCodigosDescuento();
    }

    @Override
    public void cargarCodigosDescuento() {
        servidor.cargarCodigosDescuento();
    }

    @Override
    public boolean existeCodigoDescuento(String cd) {
        return servidor.existeCodigoDescuento(cd);
    }

    @Override
    public CodigoDescuento getCodigoDescuento(String cd) {
        return servidor.getCodigoDescuento(cd);
    }

    @Override
    public void addTarjetaCredito(TarjetaCredito tc) {
        servidor.addTarjetaCredito(tc);
    }

    @Override
    public void guardarTarjetasCredito() {
        servidor.guardarTarjetasCredito();
    }

    @Override
    public void cargarTarjetasCredito() {
        servidor.cargarTarjetasCredito();
    }

    @Override
    public boolean existeTarjetaCredito(String numero) {
        return servidor.existeTarjetaCredito(numero);
    }

    @Override
    public boolean saldoSuficienteTarjetaCredito(String numero, double saldo) {
        return servidor.saldoSuficienteTarjetaCredito(numero, saldo);
    }

    @Override
    public TarjetaCredito getTarjetaCredito(String numero) {
        return servidor.getTarjetaCredito(numero);
    }
    
    @Override
    public boolean comprobarCuentaBancaria(String numeroCuenta){
        return servidor.comprobarCuentaBancaria(numeroCuenta);
    }
    
    @Override
    public Creador esCreador(String correo){
        return servidor.esCreador(correo);
    }

    @Override
    public void cargarFacturas() {
        servidor.cargarFacturas();
    }

    @Override
    public void guardarFacturas() {
        servidor.guardarFacturas();
    }
    
    @Override
    public void addProductividad(Productividad p){
        servidor.addProductividad(p);
    }
    
    @Override
    public void guardarProductividad(){
        servidor.guardarProductividad();
    }
    
    @Override
    public void cargarProductividad(){
        servidor.cargarProductividad();
    }

    @Override
    public void addAntivirus(Antivirus a){
        servidor.addAntivirus(a);
    }
    
    @Override
    public void guardarAntivirus(){
        servidor.guardarAntivirus();
    }
    
    @Override
    public void cargarAntivirus(){
        servidor.cargarAntivirus();
    }

    @Override
    public void addVideojuego(Videojuego v) {
        servidor.addVideojuego(v);
    }

    @Override
    public void guardarVideojuegos() {
        servidor.guardarVideojuegos();
    }

    @Override
    public void cargarVideojuegos() {
        servidor.cargarVideojuegos();
    }

    @Override
    public ArrayList<Videojuego> getVideojuegos() {
        return servidor.getVideojuegos();
    }

    @Override
    public ArrayList<Productividad> getProductividad() {
        return servidor.getProductividad();
    }

    @Override
    public ArrayList<Antivirus> getAntivirus() {
        return servidor.getAntivirus();
    }
    
    @Override
    public ArrayList<Factura> getFacturas(){
        return servidor.getFacturas();
    }
    
    @Override
    public void removeVideojuego(String codigoInterno){
        servidor.removeVideojuego(codigoInterno);
    }
    
    @Override
    public void removeProductividad(String codigoInterno){
        servidor.removeProductividad(codigoInterno);
    }
    
    @Override
    public void removeAntivirus(String codigoInterno){
        servidor.removeAntivirus(codigoInterno);
    }
}
