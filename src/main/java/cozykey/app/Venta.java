package cozykey.app;

import java.util.ArrayList;

public class Venta {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private String fecha;

    public Venta(Cliente cliente, String fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }
    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public String getFecha() {
        return fecha;
    }
    public ArrayList<Producto> getProductos() {
        return  productos;
    }
    @Override
    public String toString() {
        return "Venta realizada el " + fecha + " por " + cliente.getNombre() +
                " - Total: €" + String.format("%.2f", calcularTotal());

    }

}
