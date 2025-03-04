package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class LlistaReserves implements InLlistaReserves {
    ArrayList<Reserva> reservas;
    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }

    @Override
    public int getNumReserves() {
        int tamano=reservas.size();
        return tamano;
    }
}
