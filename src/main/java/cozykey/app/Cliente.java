package cozykey.app;

public class Cliente {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;

    public Cliente(int id, String nombre, String email, String telefono, String direccion){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public String getTeléfono() {
        return telefono;
    }
    public String getDirección() {
        return direccion;
    }
    public void  setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", teléfono='" + telefono + '\'' +
                ", dirección='" + direccion + '\'' +
                '}';
    }
}
