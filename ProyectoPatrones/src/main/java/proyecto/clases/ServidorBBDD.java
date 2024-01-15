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
    
    public void addCliente(Cliente c){
        clientes.add(c);
    }
    
    public void addCreadores(Creador c){
        creadores.add(c);
    }
    
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
}
