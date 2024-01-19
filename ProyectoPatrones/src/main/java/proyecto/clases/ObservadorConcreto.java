
package proyecto.clases;

import java.io.Serializable;

public class ObservadorConcreto implements Observador, Serializable{
    
    private Cliente cliente;
    private Sujeto sujeto;

    public ObservadorConcreto(Cliente cliente, Sujeto sujeto) {
        this.cliente = cliente;
        this.sujeto = sujeto;
        sujeto.getObservadores().add(this);
    }

    /**
     * Get the value of sujeto
     *
     * @return the value of sujeto
     */
    @Override
    public Sujeto getSujeto() {
        return sujeto;
    }

    /**
     * Set the value of sujeto
     *
     * @param sujeto new value of sujeto
     */
    @Override
    public void setSujeto(Sujeto sujeto) {
        this.sujeto = sujeto;
    }


    /**
     * Get the value of cliente
     *
     * @return the value of cliente
     */
    @Override
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Set the value of cliente
     *
     * @param cliente new value of cliente
     */
    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void actualizar() {
        Producto producto = sujeto.getProducto();
        Servidor proxy = new Proxy(new ServidorBBDD());
        if (producto.isAprobado())
        {
            System.out.println("notificando a " + cliente.getNombreUsuario());
            proxy.getClientebyCorreo(cliente.getCorreo()).addNotificacion("El producto: " + producto.getNombre() + " ya está disponible para la compra");
            proxy.guardarClientes();
            sujeto.getObservadores().remove(this);
        }
    }

}
