package proyecto.clases;

public class ManejadorMonedaOtro extends Manejador {

    @Override
    public double calcularPrecio(Dolar precio, Cliente c) {
        double precioFinal;
        OtraMoneda adaptador = new AdaptadorMonedaOtro(precio);
        precioFinal = adaptador.getPrecio();
        return precioFinal;
    }
    
    @Override
    public double calcularPrecio(Dolar precio, Creador cr) {
        double precioFinal;
        OtraMoneda adaptador = new AdaptadorMonedaOtro(precio);
        precioFinal = adaptador.getPrecio();
        return precioFinal;
    }
    
}
