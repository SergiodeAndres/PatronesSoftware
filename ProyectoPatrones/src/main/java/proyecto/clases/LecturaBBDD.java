
package proyecto.clases;

import java.util.ArrayList;

public class LecturaBBDD {
    private ArrayList<Videojuego> listaVideojuegos;
    private ArrayList<Productividad> listaProductividad;
    private ArrayList<Antivirus> listaAntivirus;

    public LecturaBBDD(ArrayList<Videojuego> listaVideojuegos, ArrayList<Productividad> listaProductividad, ArrayList<Antivirus> listaAntivirus) {
        this.listaVideojuegos = listaVideojuegos;
        this.listaProductividad = listaProductividad;
        this.listaAntivirus = listaAntivirus;
    }
    
    public LecturaBBDD(LecturaBBDD lectura) {
        this.listaVideojuegos = lectura.getListaVideojuegos();
        this.listaProductividad = lectura.getListaProductividad();
        this.listaAntivirus = lectura.getListaAntivirus();
    }

    /**
     * Get the value of listaAntivirus
     *
     * @return the value of listaAntivirus
     */
    public ArrayList<Antivirus> getListaAntivirus() {
        return listaAntivirus;
    }

    /**
     * Set the value of listaAntivirus
     *
     * @param listaAntivirus new value of listaAntivirus
     */
    public void setListaAntivirus(ArrayList<Antivirus> listaAntivirus) {
        this.listaAntivirus = listaAntivirus;
    }


    /**
     * Get the value of listaProductividad
     *
     * @return the value of listaProductividad
     */
    public ArrayList<Productividad> getListaProductividad() {
        return listaProductividad;
    }

    /**
     * Set the value of listaProductividad
     *
     * @param listaProductividad new value of listaProductividad
     */
    public void setListaProductividad(ArrayList<Productividad> listaProductividad) {
        this.listaProductividad = listaProductividad;
    }


    /**
     * Get the value of listaVideojuegos
     *
     * @return the value of listaVideojuegos
     */
    public ArrayList<Videojuego> getListaVideojuegos() {
        return listaVideojuegos;
    }

    /**
     * Set the value of listaVideojuegos
     *
     * @param listaVideojuegos new value of listaVideojuegos
     */
    public void setListaVideojuegos(ArrayList<Videojuego> listaVideojuegos) {
        this.listaVideojuegos = listaVideojuegos;
    }
    
    public ArrayList<Videojuego> getListaVideojuegosPorCreador(Creador c){
        ArrayList<Videojuego> lista = new ArrayList<>();
        
        for (Videojuego v:listaVideojuegos){
            if (v.getCreador().getCorreo().equals(c.getCorreo())){
                lista.add(v);
            }
        }
        
        return lista;
    }
    
    public ArrayList<Productividad> getListaProductividadPorCreador(Creador c){
        ArrayList<Productividad> lista = new ArrayList<>();
        
        for (Productividad p:listaProductividad){
            if (p.getCreador().getCorreo().equals(c.getCorreo())){
                lista.add(p);
            }
        }
        
        return lista;
    }
    
    public ArrayList<Antivirus> getListaAntivirusPorCreador(Creador c){
        ArrayList<Antivirus> lista = new ArrayList<>();
        
        for (Antivirus a:listaAntivirus){
            if (a.getCreador().getCorreo().equals(c.getCorreo())){
                lista.add(a);
            }
        }
        
        return lista;
    }
    
    public ArrayList<String> getListaCreadoresConProductos() {
        ArrayList<String> correos = new ArrayList<>();
        for (Antivirus a:listaAntivirus){
            if (!correos.contains(a.getCreador().getCorreo()))
            {
                correos.add(a.getCreador().getCorreo());
            }
        }
        for (Videojuego v:listaVideojuegos){
            if (!correos.contains(v.getCreador().getCorreo()))
            {
                correos.add(v.getCreador().getCorreo());
            }
        }
        for (Productividad p:listaProductividad){
            if (!correos.contains(p.getCreador().getCorreo()))
            {
                correos.add(p.getCreador().getCorreo());
            }
        }
        return correos;
    }

}