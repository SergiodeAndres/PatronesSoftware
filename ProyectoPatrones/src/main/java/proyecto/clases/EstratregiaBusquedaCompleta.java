
package proyecto.clases;

import java.util.ArrayList;


public class EstratregiaBusquedaCompleta implements Estrategia {

    @Override
    public ArrayList<Producto> buscar(ArrayList<Producto> productos, String nombre, String creador, String valoracion, double precioMin, double precioMax, String tipo, Cliente c) {
        ArrayList<Producto> listaFinal = new ArrayList<>();
        Agregado agregado = new AgregadoConcreto(productos);
        Iterador iterador = agregado.crearIterador();
        
        return listaFinal;
    }
    
}
