package cozykey.app;

import java.util.ArrayList;

/**
 * Representa una venta realizada por un cliente en una fecha determinada.
 * Contiene una lista de productos y permite calcular el total.
 */

public class Venta {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private String fecha;


    /**
     * Crea una venta asociada a un cliente y a una fecha.
     */
    public Venta(Cliente cliente, String fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    /**
     * Añade un producto a la venta.
     */
    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Calcula el total de la venta sumando los precios de los productos.
     */
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    /** @return cliente de la venta */
    public Cliente getCliente() {
        return cliente;
    }

    /** @return fecha de la venta */
    public String getFecha() {
        return fecha;
    }

    /** @return lista de productos vendidos */
    public ArrayList<Producto> getProductos() {
        return  productos;
    }

    /**
     * @return resumen de la venta.
     */
    @Override
    public String toString() {
        return "Venta realizada el " + fecha + " por " + cliente.getNombre() +
                " - Total: €" + String.format("%.2f", calcularTotal());

    }

}
