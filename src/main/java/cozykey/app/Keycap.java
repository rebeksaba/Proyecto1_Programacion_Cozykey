package cozykey.app;

public class Keycap extends Producto {
    private String tipo; // XDA, MOT
    private String color; // rosa, azul, verde, rojo

    public Keycap(String nombre, double precio, String tipo, String color) {
        super(nombre, precio);
        this.tipo = tipo;
        this.color = color;
    }

    @Override
    public String getDescripcion() {
        return nombre + "(" + tipo + ", color " + color + ") - €" + precio;
    }

}
