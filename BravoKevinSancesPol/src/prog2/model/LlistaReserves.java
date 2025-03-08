package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class LlistaReserves implements InLlistaReserves {
    ArrayList<Reserva> reservas;

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
        } catch (ExcepcioReserva e) {
            System.out.println("Error de disponibilitat: " + e.getMessage());
        }

        try {
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
        } catch (ExcepcioReserva e) {
            System.out.println("Error d'estància mínima: " + e.getMessage());
        }

        Reserva reserva = new Reserva(allotjament, client, dataEntrada, dataSortida);
        reservas.add(reserva);
        System.out.println("Reserva realitzada correctament.");
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
            if (allotjament == r.getAllotjament()) {
                if ((entrada.isBefore(r.getSalida()) && entrada.isAfter(r.getEntrada())) || (salida.isBefore(r.getSalida()) && salida.isAfter(r.getEntrada()))) {
                    return false;
                }
            }
            ;
        }

        return true;
    }

    public boolean isEstadaMinima(Allotjament allotjament, LocalDate entrada, LocalDate salida) {
        Iterator<Reserva> it = reservas.iterator();

        long estancia = ChronoUnit.DAYS.between(entrada, salida);
        while (it.hasNext()) {
            Reserva r = it.next();
            if (allotjament == r.getAllotjament()) {
                if (allotjament.getEstadaMinima(allotjament.getTemporada(entrada)) <=estancia ) {
                    return true;
                }
            }
        }
        return false;
    }
}