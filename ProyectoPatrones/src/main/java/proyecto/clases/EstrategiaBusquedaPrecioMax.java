
package proyecto.clases;

import java.util.ArrayList;


public class EstrategiaBusquedaPrecioMax implements Estrategia {

    @Override
    public ArrayList<Producto> buscar(ArrayList<Producto> productos, String nombre, String creador, String valoracion, Double precioMin, Double precioMax, String tipo, Cliente c) {
        ArrayList<Producto> listaFinal = new ArrayList<>();
        Agregado agregado = new AgregadoConcreto(productos);
        Iterador iterador = agregado.crearIterador();
        while(iterador.hayMas()){
            Producto p = (Producto) iterador.elementoActual();
            if (p.getPrecio(c) <= precioMax)
            {
                listaFinal.add(p);
            }
            iterador.siguiente();
        }
        return listaFinal;
    }
    
}
