
package proyecto.clases;

import java.util.ArrayList;


public class EstrategiaBusquedaTipo implements Estrategia {

    @Override
    public ArrayList<Producto> buscar(ArrayList<Producto> productos, String nombre, String creador, String valoracion, Double precioMin, Double precioMax, String tipo, Cliente c) {
        ArrayList<Producto> listaFinal = new ArrayList<>();
        Agregado agregado = new AgregadoConcreto(productos);
        Iterador iterador = agregado.crearIterador();
        while(iterador.hayMas()){
            Producto p = (Producto) iterador.elementoActual();
            if (tipo.equals("Videojuego") && p instanceof Videojuego)
            {
                listaFinal.add(p);
            }
            if (tipo.equals("Productividad") && p instanceof Productividad)
            {
                listaFinal.add(p);
            }
            if (tipo.equals("Antivirus") && p instanceof Antivirus)
            {
                listaFinal.add(p);
            }
            iterador.siguiente();
        }
        return listaFinal;
    }
    
}
