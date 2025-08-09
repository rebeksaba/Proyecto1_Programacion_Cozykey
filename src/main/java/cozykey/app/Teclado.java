package cozykey.app;

public class Teclado extends Producto {
    private String tipoSwitch;
    private boolean conCable;

    public Teclado(String nombre, double precio, String tipoSwitch, boolean conCable) {
        super(nombre, precio);
        this.tipoSwitch = tipoSwitch;
        this.conCable = conCable;
    }

    @Override
    public String getDescripcion() {
        return nombre + "con switches " + tipoSwitch +
                (conCable ? " con cable" : ", inalámbrico") +
                " - €" + precio;
    }
}
