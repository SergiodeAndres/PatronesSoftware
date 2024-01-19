package proyecto.clases;

import java.util.ArrayList;

public class Busqueda {
    private Estrategia estrategia;
    private ArrayList<Producto> lista;

    public Busqueda(Estrategia estrategia, ArrayList<Producto> lista) {
        this.estrategia = estrategia;
        this.lista = lista;
    }

    /**
     * Get the value of lista
     *
     * @return the value of lista
     */
    public ArrayList<Producto> getLista() {
        return lista;
    }

    /**
     * Set the value of lista
     *
     * @param lista new value of lista
     */
    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }


    /**
     * Get the value of estrategia
     *
     * @return the value of estrategia
     */
    public Estrategia getEstrategia() {
        return estrategia;
    }

    /**
     * Set the value of estrategia
     *
     * @param estrategia new value of estrategia
     */
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    
    public ArrayList<Producto> ejecutarEstrategia(String nombre, String creador, String valoracion, Double precioMinimo, Double precioMaximo, String tipo, Cliente c) {
        return estrategia.buscar(lista, nombre, creador, valoracion, precioMinimo, precioMaximo, tipo, c);
    }

}
