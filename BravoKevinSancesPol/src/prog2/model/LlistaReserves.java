package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;

public class LlistaReserves implements InLlistaReserves {
    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }

    @Override
    public int getNumReserves() {
        return 0;
    }
}
