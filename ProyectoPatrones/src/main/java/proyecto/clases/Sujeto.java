package proyecto.clases;

import java.util.ArrayList;


public interface Sujeto {
    
    public ArrayList<Observador> getObservadores();

    public void setObservadores(ArrayList<Observador> observadores);

    public Producto getProducto();

    public void setProducto(Producto producto);
    
    public void notificarObservadores();
}
