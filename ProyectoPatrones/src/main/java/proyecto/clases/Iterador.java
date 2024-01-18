package proyecto.clases;


public interface Iterador {
    
    public Object primero() throws IndexOutOfBoundsException;

    
    public Object siguiente() throws IndexOutOfBoundsException;

    
    public boolean hayMas();

    public Object elementoActual() throws IndexOutOfBoundsException;
}
