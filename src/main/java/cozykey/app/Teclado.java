package cozykey.app;

/**
 * Subclase de {@link Producto} que representa un teclado.
 * Incluye tipo de switch (tipo de sonido que hace la tecla al pulsarse) y si es alámbrico o inalámbrico.
 */

public class Teclado extends Producto {
    private String tipoSwitch;
    private boolean conCable;


    /**
     * Crea un teclado con sus atributos específicos.
     */
    public Teclado(String nombre, double precio, int stock, String tipoSwitch, boolean conCable) {
        super(nombre, precio, stock);
        this.tipoSwitch = tipoSwitch;
        this.conCable = conCable;
    }


    /**
     * @return descripción del teclado
     */
    @Override
    public String getDescripcion() {
        return getNombre() + " con switches " + tipoSwitch +
                (conCable ? " con cable" : ", inalámbrico") +
                " - €" + getPrecio() + " | Stock: " + getStock();
    }
}
