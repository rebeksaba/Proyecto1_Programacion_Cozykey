package cozykey.app;

/**
 * Subclase de {@link Producto} que representa los diferentes modelos de keycaps (teclas).
 * Incluye tipo de perfil y color.
 */

public class Keycap extends Producto {
    private String tipo; // XDA, MOT
    private String color; // rosa, azul, verde, rojo


    /**
     * Crea un modelo de keycap con perfil y color específico.
     */
    public Keycap(String nombre, double precio, int stock,String tipo, String color) {
        super(nombre, precio, stock);
        this.tipo = tipo;
        this.color = color;
    }

    /**
     * @return descripción detallada del modelo de keycap.
     */
    @Override
    public String getDescripcion() {
        return getNombre() + " (" + tipo + ", color " + color + ") - €" + getPrecio() + " | Stock: " + getStock();
    }

}
