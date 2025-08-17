package cozykey.app;

/**
 * Representa un cliente de CozyKey.
 * Contiene información como nombre, DNI, email, teléfono y dirección.
 * Cada cliente tiene un identificador único (PK).
 *
 * @author Rebeca
 * @version 1.0
 */

public class Cliente {
    private static int contadorId = 1;

    private int id;
    private String nombre;
    private String DNI;
    private String email;
    private String telefono;
    private String direccion;

    /**
     * Constructor con ID manual.
     */

    public Cliente(int id, String nombre, String DNI, String email, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.DNI = DNI;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Constructor con ID automático.
     */


    public Cliente(String nombre, String DNI, String email, String telefono, String direccion){
        this.id = contadorId++;
        this.nombre = nombre;
        this.DNI = DNI;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /** @return ID del cliente/getters */
    public int getId() {
        return id;
    }
    /** @return Nombre del cliente */
    public String getNombre() {
        return nombre;
    }
    public String getDNI() {
        return DNI;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }

    /** setters */
    public void  setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Representación en texto del cliente.
     */

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", email='" + email + '\'' +
                ", teléfono='" + telefono + '\'' +
                ", dirección='" + direccion + '\'' +
                '}';
    }
}
