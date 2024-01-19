
package proyecto.clases;

import java.util.ArrayList;


public class EstrategiaBusquedaCompleta implements Estrategia {

    @Override
    public ArrayList<Producto> buscar(ArrayList<Producto> productos, String nombre, String creador, String valoracion, Double precioMin, Double precioMax, String tipo, Cliente c) {
        ArrayList<Producto> listaAEliminar = new ArrayList<>();
        Agregado agregado = new AgregadoConcreto(productos);
        Iterador iterador = agregado.crearIterador();
        while(iterador.hayMas())
        {
            Producto p = (Producto) iterador.elementoActual();
            if(nombre != null && !p.getNombre().contains(nombre) && !listaAEliminar.contains(p))
            {
                listaAEliminar.add(p);
            }
            if(creador != null && !p.getCreador().getCorreo().equals(creador) && !listaAEliminar.contains(p))
            {
                listaAEliminar.add(p);
            }
            if(valoracion != null && !p.getValoracionGeneral().equals(valoracion) && !listaAEliminar.contains(p))
            {
                listaAEliminar.add(p);
            }
            if(precioMin != null && p.getPrecio(c) < precioMin && !listaAEliminar.contains(p))
            {
                listaAEliminar.add(p);
            }
            if(precioMax != null && p.getPrecio(c) > precioMax && !listaAEliminar.contains(p))
            {
                listaAEliminar.add(p);
            }
            if(tipo.equals("Antivirus") && !(p instanceof Antivirus) && !listaAEliminar.contains(p))
            {
                listaAEliminar.add(p);
            }
            if(tipo.equals("Productividad") && !(p instanceof Productividad) && !listaAEliminar.contains(p))
            {
                listaAEliminar.add(p);
            }
            if(tipo.equals("Videojuego") && !(p instanceof Videojuego) && !listaAEliminar.contains(p))
            {
                listaAEliminar.add(p);
            }
            iterador.siguiente();
        }
        productos.removeAll(listaAEliminar);
        return productos;
    }
    
}
