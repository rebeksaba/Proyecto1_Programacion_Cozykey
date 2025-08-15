package cozykey.app;

public class Teclado extends Producto {
    private String tipoSwitch;
    private boolean conCable;

    public Teclado(String nombre, double precio, int stock, String tipoSwitch, boolean conCable) {
        super(nombre, precio, stock);
        this.tipoSwitch = tipoSwitch;
        this.conCable = conCable;
    }

    @Override
    public String getDescripcion() {
        return getNombre() + " con switches " + tipoSwitch +
                (conCable ? " con cable" : ", inalámbrico") +
                " - €" + getPrecio() + " | Stock: " + getStock();
    }
}
