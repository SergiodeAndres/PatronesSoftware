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
}