package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;

public class Reserva {
    private Allotjament al;
    private Client peruano;
    private LocalDate entras;
    private LocalDate sales;

    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        setAllotjament_(allotjament);
        setSoci(client);
        setDataEntrada(dataEntrada);
        setDataSortida(dataSortida);
    }

    public Allotjament getAllotjament_() {
        return al;
    }

    public void setAllotjament_(Allotjament allotjament) {
        al = allotjament;
    }

    public Client getSoci() {
        return peruano;
    }

    public void setSoci(Client client) {
        peruano = client;
    }

    public LocalDate getDataEntrada() {
        return entras;
    }

    public void setDataEntrada(LocalDate entrada) {
        entras = entrada;
    }

    public LocalDate getDataSortida() {
        return sales;
    }

    public void setDataSortida(LocalDate salida) {
        sales = salida;
    }
}
