package cozykey.app;

public class Keycap extends Producto {
    private String tipo; // XDA, MOT
    private String color; // rosa, azul, verde, rojo

    public Keycap(String nombre, double precio, int stock,String tipo, String color) {
        super(nombre, precio, stock);
        this.tipo = tipo;
        this.color = color;
    }

    @Override
    public String getDescripcion() {
        return getNombre() + " (" + tipo + ", color " + color + ") - €" + getPrecio() + " | Stock: " + getStock();
    }

}
