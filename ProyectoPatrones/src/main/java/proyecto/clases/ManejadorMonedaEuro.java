package proyecto.clases;

public class ManejadorMonedaEuro extends Manejador {

    @Override
    public double calcularPrecio(Dolar precio, Cliente c) {
        double precioFinal;
        if (!c.getPais().equals("Reino Unido"))
        {
            OtraMoneda adaptador = new AdaptadorMonedaEuro(precio);
            precioFinal = adaptador.getPrecio();
        }
        else
        {
            precioFinal = getSucesor().calcularPrecio(precio, c);
        }
        return precioFinal;
    }
    
    @Override
    public double calcularPrecio(Dolar precio, Creador cr) {
        double precioFinal;
        if (!cr.getPais().equals("Reino Unido"))
        {
            OtraMoneda adaptador = new AdaptadorMonedaEuro(precio);
            precioFinal = adaptador.getPrecio();
        }
        else
        {
            precioFinal = getSucesor().calcularPrecio(precio, cr);
        }
        return precioFinal;
    }
    
}
