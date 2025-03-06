package prog2.model;

public class Client {
    private String dni;
    private String nombre;
    protected Client(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
}
