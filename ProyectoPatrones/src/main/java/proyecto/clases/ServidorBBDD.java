/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author sergi
 */
public class ServidorBBDD implements Servidor {
    private static ArrayList<Cliente> clientes = new ArrayList<>(); 
    private static ArrayList<Creador> creadores = new ArrayList<>();
    private static ArrayList<CodigoDescuento> codigosDescuento = new ArrayList<>();
    private static ArrayList<TarjetaCredito> tarjetasCredito = new ArrayList<>();
    private static ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<>();
    private static ArrayList<Factura> facturas = new ArrayList<>();
    private static ArrayList<Productividad> productividad = new ArrayList<>();
    private static ArrayList<Antivirus> antivirus = new ArrayList<>();
    private static ArrayList<Videojuego> videojuegos = new ArrayList<>();
    
    @Override
    public void guardarClientes() {
        try {
            //Si hay datos los guardamos
            if (!clientes.isEmpty()) {
                //Serialización de los clientes
                FileOutputStream ostreamClientes = new FileOutputStream("clientes.dat");
                ObjectOutputStream oosClientes = new ObjectOutputStream(ostreamClientes);
                //se guarda el array en el archivo
                oosClientes.writeObject(clientes);
                ostreamClientes.close();
            } 
            else {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage()+ ioe.toString());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void cargarClientes() {
        try {
            //Lectura de los clientes
            FileInputStream istreamClientes = new FileInputStream("clientes.dat");
            ObjectInputStream oisClientes = new ObjectInputStream(istreamClientes);
            clientes = (ArrayList) oisClientes.readObject();
            istreamClientes.close();
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void guardarCreadores() {
        try {
            //Si hay datos los guardamos
            if (!creadores.isEmpty()) {
                //Serialización de los clientes
                FileOutputStream ostreamCreadores = new FileOutputStream("creadores.dat");
                ObjectOutputStream oosCreadores = new ObjectOutputStream(ostreamCreadores);
                //se guarda el array en el archivo
                oosCreadores.writeObject(creadores);
                ostreamCreadores.close();
            } 
            else {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage()+ ioe.toString());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void cargarCreadores() {
        try {
            //Lectura de los clientes
            FileInputStream istreamClientes = new FileInputStream("creadores.dat");
            ObjectInputStream oisClientes = new ObjectInputStream(istreamClientes);
            creadores = (ArrayList) oisClientes.readObject();
            istreamClientes.close();
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void guardarCodigosDescuento() {
        try {
            //Si hay datos los guardamos
            if (!codigosDescuento.isEmpty()) {
                //Serialización de los clientes
                FileOutputStream ostreamClientes = new FileOutputStream("codigosDescuento.dat");
                ObjectOutputStream oosClientes = new ObjectOutputStream(ostreamClientes);
                //se guarda el array en el archivo
                oosClientes.writeObject(codigosDescuento);
                ostreamClientes.close();
            } 
            else {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage()+ ioe.toString());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void cargarCodigosDescuento() {
        try {
            //Lectura de los clientes
            FileInputStream istreamClientes = new FileInputStream("codigosDescuento.dat");
            ObjectInputStream oisClientes = new ObjectInputStream(istreamClientes);
            codigosDescuento = (ArrayList) oisClientes.readObject();
            istreamClientes.close();
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void guardarCuentasBancarias() {
        try {
            //Si hay datos los guardamos
            if (!cuentasBancarias.isEmpty()) {
                //Serialización de los clientes
                FileOutputStream ostreamCuentasBancarias = new FileOutputStream("cuentasBancarias.dat");
                ObjectOutputStream oosCuentasBancarias = new ObjectOutputStream(ostreamCuentasBancarias);
                //se guarda el array en el archivo
                oosCuentasBancarias.writeObject(cuentasBancarias);
                ostreamCuentasBancarias.close();
            } 
            else {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage()+ ioe.toString());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void cargarCuentasBancarias() {
        try {
            //Lectura de los clientes
            FileInputStream istreamCuentasBancarias = new FileInputStream("cuentasBancarias.dat");
            ObjectInputStream oisCuentasBancarias = new ObjectInputStream(istreamCuentasBancarias);
            cuentasBancarias = (ArrayList) oisCuentasBancarias.readObject();
            istreamCuentasBancarias.close();
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void addCliente(Cliente c){
        clientes.add(c);
    }
    
    @Override
    public void addCreadores(Creador c){
        creadores.add(c);
    }
    
    @Override
    public void addCodigoDescuento(CodigoDescuento cd){
        codigosDescuento.add(cd);
    }
    
    @Override
    public void addCuentaBancaria(CuentaBancaria cb){
        cuentasBancarias.add(cb);
    }
    
    @Override
    public void removeCodigoDescuento(String cd){
        for (CodigoDescuento c: codigosDescuento)
        {
            if (c.getCodigo().equals(cd))
            {
                codigosDescuento.remove(c);
            }
        }
    }
    
    @Override
    public int correoValido(String correo){
         List<String> lista_correos = clientes.stream()
                .map(Cliente::getCorreo)
                .collect(Collectors.toList());
         List<String> lista_correos_creadores = creadores.stream()
                .map(Creador::getCorreo)
                .collect(Collectors.toList());
        //Se comprueba que el correo introducido no está en la lista
        if (lista_correos.contains(correo) || lista_correos_creadores.contains(correo)){
            lista_correos.removeAll(lista_correos);
            lista_correos_creadores.removeAll(lista_correos_creadores);
            return 1; 
        }
        else {
            //Se comprueba que el correo es válido (tiene un @, tiene .com o .es y no es el correo del administrador)
            lista_correos.removeAll(lista_correos);
            lista_correos_creadores.removeAll(lista_correos_creadores);
            if (correo.contains("@") && !correo.equals("admin") && (correo.contains(".com")||correo.contains(".es"))) { 
                return 0;
            }
            else { 
                return 2;
            }
        }
    }
    
    @Override
    public boolean comprobarContraseña(String correo, String con){
        ArrayList<String> lista_correos = new ArrayList<>();
        ArrayList<String> lista_contraseñas = new ArrayList<>();
        for (int i = 0; i < creadores.size();i++){
            lista_correos.add(creadores.get(i).getCorreo());
            lista_contraseñas.add(creadores.get(i).getContraseña());
        }
        for (int i = 0; i < clientes.size();i++){
            lista_correos.add(clientes.get(i).getCorreo());
            lista_contraseñas.add(clientes.get(i).getContraseña());
        }
        int pos = lista_correos.indexOf(correo);
        String contraseña = lista_contraseñas.get(pos);
        return (contraseña.equals(con));
    }
    
    @Override
    public Cliente esCliente(String correo) {
        Cliente cliente = null; 
        for (Cliente c: clientes)
        {
            if (c.getCorreo().equals(correo))
            {
                cliente = c;
            }
        }
        return cliente; 
    }

    @Override
    public boolean existeCodigoDescuento(String cd) {
        boolean veredicto = false; 
        for (CodigoDescuento c: codigosDescuento)
        {
            if (c.getCodigo().equals(cd))
            {
                veredicto = true;
            }
        }
        return veredicto;
    }

    @Override
    public CodigoDescuento getCodigoDescuento(String cd) {
        CodigoDescuento codigo = null; 
        for (CodigoDescuento c: codigosDescuento)
        {
            if (c.getCodigo().equals(cd))
            {
                codigo = c;
            }
        }
        return codigo; 
    }

    @Override
    public void addTarjetaCredito(TarjetaCredito tc) {
        tarjetasCredito.add(tc);
    }

    @Override
    public void guardarTarjetasCredito() {
        try {
            //Si hay datos los guardamos
            if (!tarjetasCredito.isEmpty()) {
                //Serialización de los clientes
                FileOutputStream ostreamClientes = new FileOutputStream("tarjetasCredito.dat");
                ObjectOutputStream oosClientes = new ObjectOutputStream(ostreamClientes);
                //se guarda el array en el archivo
                oosClientes.writeObject(tarjetasCredito);
                ostreamClientes.close();
            } 
            else {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage()+ ioe.toString());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void cargarTarjetasCredito() {
        try {
            //Lectura de los clientes
            FileInputStream istreamClientes = new FileInputStream("tarjetasCredito.dat");
            ObjectInputStream oisClientes = new ObjectInputStream(istreamClientes);
            tarjetasCredito = (ArrayList) oisClientes.readObject();
            istreamClientes.close();
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public boolean existeTarjetaCredito(String numero) {
        boolean veredicto = false; 
        for (TarjetaCredito tc: tarjetasCredito)
        {
            if (tc.getNumeroTarjeta().equals(numero))
            {
                veredicto = true;
            }
        }
        return veredicto;
    }

    @Override
    public boolean saldoSuficienteTarjetaCredito(String numero, double saldo) {
        boolean veredicto = false; 
        for (TarjetaCredito tc: tarjetasCredito)
        {
            if (tc.getNumeroTarjeta().equals(numero) && tc.getSaldo() >= saldo)
            {
                veredicto = true;
            }
        }
        return veredicto;
    }

    @Override
    public TarjetaCredito getTarjetaCredito(String numero) {
        TarjetaCredito tarjeta = null; 
        for (TarjetaCredito tc: tarjetasCredito)
        {
            if (tc.getNumeroTarjeta().equals(numero))
            {
                tarjeta = tc;
            }
        }
        return tarjeta;
    }
    
    @Override
    public boolean comprobarCuentaBancaria(String numeroCuenta){
        List<String> lista_numeroCuenta = cuentasBancarias.stream()
                .map(CuentaBancaria::getNumeroCuenta)
                .collect(Collectors.toList());
        
        //Comprobamos si el número de cuenta ya existe
        return !lista_numeroCuenta.contains(numeroCuenta);
    }
    
    @Override
    public Creador esCreador(String correo) {
        Creador creador = null; 
        for (Creador c: creadores)
        {
            if (c.getCorreo().equals(correo))
            {
                creador = c;
            }
        }
        return creador; 
    }

    @Override
    public void cargarFacturas() {
        try {
            //Lectura de los clientes
            FileInputStream istreamCuentasBancarias = new FileInputStream("facturas.dat");
            ObjectInputStream oisCuentasBancarias = new ObjectInputStream(istreamCuentasBancarias);
            facturas = (ArrayList) oisCuentasBancarias.readObject();
            istreamCuentasBancarias.close();
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void guardarFacturas() {
        try {
            //Si hay datos los guardamos
            if (!facturas.isEmpty()) {
                //Serialización de los clientes
                FileOutputStream ostreamClientes = new FileOutputStream("facturas.dat");
                ObjectOutputStream oosClientes = new ObjectOutputStream(ostreamClientes);
                //se guarda el array en el archivo
                oosClientes.writeObject(facturas);
                ostreamClientes.close();
            } 
            else {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage()+ ioe.toString());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void addProductividad(Productividad p){
        productividad.add(p);
    }
    
    @Override
    public void guardarProductividad() {
        try {
            //Si hay datos los guardamos
            if (!productividad.isEmpty()) {
                //Serialización de los clientes
                FileOutputStream ostreamProductividad = new FileOutputStream("productividad.dat");
                ObjectOutputStream oosProductividad = new ObjectOutputStream(ostreamProductividad);
                //se guarda el array en el archivo
                oosProductividad.writeObject(productividad);
                ostreamProductividad.close();
            } 
            else {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage()+ ioe.toString());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void cargarProductividad() {
        try {
            //Lectura de los clientes
            FileInputStream istreamProductividad = new FileInputStream("productividad.dat");
            ObjectInputStream oisProductividad = new ObjectInputStream(istreamProductividad);
            productividad = (ArrayList) oisProductividad.readObject();
            istreamProductividad.close();
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void addAntivirus(Antivirus a){
        antivirus.add(a);
    }
    
    @Override
    public void guardarAntivirus() {
        try {
            //Si hay datos los guardamos
            if (!antivirus.isEmpty()) {
                //Serialización de los clientes
                FileOutputStream ostreamAntivirus = new FileOutputStream("antivirus.dat");
                ObjectOutputStream oosAntivirus = new ObjectOutputStream(ostreamAntivirus);
                //se guarda el array en el archivo
                oosAntivirus.writeObject(antivirus);
                ostreamAntivirus.close();
            } 
            else {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage()+ ioe.toString());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void cargarAntivirus() {
        try {
            //Lectura de los clientes
            FileInputStream istreamAntivirus = new FileInputStream("antivirus.dat");
            ObjectInputStream oisAntivirus = new ObjectInputStream(istreamAntivirus);
            antivirus = (ArrayList) oisAntivirus.readObject();
            istreamAntivirus.close();
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void addVideojuego(Videojuego v) {
        videojuegos.add(v);
    }

    @Override
    public void guardarVideojuegos() {
        try {
            //Si hay datos los guardamos
            if (!videojuegos.isEmpty()) {
                //Serialización de los clientes
                FileOutputStream ostreamAntivirus = new FileOutputStream("videojuegos.dat");
                ObjectOutputStream oosAntivirus = new ObjectOutputStream(ostreamAntivirus);
                //se guarda el array en el archivo
                oosAntivirus.writeObject(videojuegos);
                ostreamAntivirus.close();
            } 
            else {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage()+ ioe.toString());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void cargarVideojuegos() {
        try {
            //Lectura de los clientes
            FileInputStream istreamAntivirus = new FileInputStream("videojuegos.dat");
            ObjectInputStream oisAntivirus = new ObjectInputStream(istreamAntivirus);
            videojuegos = (ArrayList) oisAntivirus.readObject();
            istreamAntivirus.close();
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    @Override
    public ArrayList<Productividad> getProductividad() {
        return productividad;
    }

    @Override
    public ArrayList<Antivirus> getAntivirus() {
        return antivirus;
    }
    
    public ArrayList<Factura> getFacturas(){
        return facturas;
    }
}