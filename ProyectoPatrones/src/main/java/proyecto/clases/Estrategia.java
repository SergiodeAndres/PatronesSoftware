package proyecto.clases;

import java.util.ArrayList;

public interface Estrategia {
    public ArrayList<Producto> buscar(ArrayList<Producto> productos, String nombre, String creador, String valoracion, double precioMin, double precioMax, String tipo, Cliente c);
}
