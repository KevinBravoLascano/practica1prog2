package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.util.regex.*;

public class Client {
    private String nombre;
    private String dni;

    public Client(String nombre, String dni) throws ExcepcioReserva {

        String regex = "^[0-9]{8}[A-Za-z]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);

        if (matcher.matches()) {
            setNombre(nombre);
            setDni(dni);
        } else {
            throw new ExcepcioReserva(getNom(), getDni());
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
