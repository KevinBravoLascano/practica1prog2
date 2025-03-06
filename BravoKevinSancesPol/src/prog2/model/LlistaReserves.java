package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class LlistaReserves implements InLlistaReserves {
    ArrayList<Reserva> reservas;

    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if(allotjamentDisponible(allotjament,dataEntrada,dataSortida)&&isEstadaMinima(allotjament,dataEntrada,dataSortida)){
            Reserva acto= new Reserva(allotjament,client,dataEntrada,dataSortida);
            reservas.add(acto);
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