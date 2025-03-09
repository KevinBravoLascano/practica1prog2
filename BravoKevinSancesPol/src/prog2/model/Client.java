package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.util.regex.*;

public class Client {
    private String nombre;
    private String dni;

    public Client(String nombre, String dni) throws ExcepcioReserva {

        String regex = "^[A-Za-z0-9]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);

        if (matcher.matches()) {
            setNombre(nombre);
            setDni(dni);
        } else {
            throw new ExcepcioReserva();
        }
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
