package proyecto.clases;

public class ManejadorMonedaDolar extends Manejador {

    @Override
    public double calcularPrecio(Dolar precio, Cliente c) {
        double precioFinal = precio.getCantidad();
        if(!c.getPais().equals("E.E.U.U"))
        {
            precioFinal = getSucesor().calcularPrecio(precio, c);
        }
        return precioFinal;
    }
    
    @Override
    public double calcularPrecio(Dolar precio, Creador cr) {
        double precioFinal = precio.getCantidad();
        if(!cr.getPais().equals("E.E.U.U"))
        {
            precioFinal = getSucesor().calcularPrecio(precio, cr);
        }
        return precioFinal;
    }
    
}
