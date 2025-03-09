package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class LlistaReserves implements InLlistaReserves {
    ArrayList<Reserva> reservas;


    public LlistaReserves() {
        this.reservas = new ArrayList<>();
    }

    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) {
        try {
            if (!allotjamentDisponible(allotjament, dataEntrada, dataSortida)) {
                throw new ExcepcioReserva(
                        client.getNom(),
                        client.getDni(),
                        allotjament.getId(),
                        dataEntrada,
                        dataSortida,
                        "ALLOTJAMENT_NO_DISPONIBLE"
                );
            }

            if (!isEstadaMinima(allotjament, dataEntrada, dataSortida)) {
                throw new ExcepcioReserva(
                        client.getNom(),
                        client.getDni(),
                        allotjament.getId(),
                        dataEntrada,
                        dataSortida,
                        "ESTADA_MINIMA_INCOMPLETA"
                );
            }

            Reserva reserva = new Reserva(allotjament, client, dataEntrada, dataSortida);
            reservas.add(reserva);
            System.out.println("Reserva realitzada correctament.");

        } catch (ExcepcioReserva e) {
            System.out.println("Error en la reserva: " + e.getMessage());

        }
    }

    @Override
    public int getNumReserves() {
        int tamano = reservas.size();
        return tamano;
    }

    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate entrada, LocalDate salida) {
        Iterator<Reserva> it = reservas.iterator();
        while (it.hasNext()) {
            Reserva r = it.next();
            if (allotjament == r.getAllotjament_()) {
                if ((entrada.isBefore(r.getDataSortida()) && entrada.isAfter(r.getDataEntrada())) || (salida.isBefore(r.getDataSortida()) && salida.isAfter(r.getDataEntrada()))) {
                    return false;
                }
            }
            ;
        }

        return true;
    }

    public boolean isEstadaMinima(Allotjament allotjament, LocalDate entrada, LocalDate salida) {
        if (ChronoUnit.DAYS.between(entrada, salida) >= allotjament.getEstadaMinima(allotjament.getTemporada(entrada))) {
            return true;
        } else {
            return false;
        }
    }
}