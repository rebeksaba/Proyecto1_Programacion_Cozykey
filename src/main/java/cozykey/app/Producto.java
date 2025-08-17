package cozykey.app;

/**
 * Clase abstracta que representa un producto dentro de la aplicación CozyKey.
 * Define atributos comunes como nombre, precio y stock, y exige una descripción específica
 * para cada tipo de producto mediante el método {@code getDescripcion()}.
 */

public abstract class Producto {
    /** Nombre producto. */
    protected String nombre;
    /** Precio producto. */
    protected double precio;
    /** Cantidad en stock. */
    protected int stock;


    /**Constructor*/

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Métodos de acceso para los atributos del producto.
     */
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
