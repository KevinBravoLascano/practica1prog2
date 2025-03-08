package prog2.model;

public class Client {
    private String nombre;
    private String dni;

    public Client(String nombre, String dni) {
        setNombre(nombre);
        setDni(dni);
    }

    public String getNom() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
