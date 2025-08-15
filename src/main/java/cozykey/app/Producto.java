package cozykey.app;

public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int stock;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public abstract String getDescripcion();

}
