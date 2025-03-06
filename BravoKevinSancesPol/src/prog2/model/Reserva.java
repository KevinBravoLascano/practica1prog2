package prog2.model;

import java.time.LocalDate;

public class Reserva {
    Allotjament al;
    Client peruano;
    LocalDate entras;
    LocalDate sales;
    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida){
        al = allotjament;
        peruano = client;
        entras=dataEntrada;
        sales=dataSortida;
    }
    public Allotjament getAllotjament() {
        return al;
    }
    public LocalDate getEntrada() {
        return entras;
    }
    public LocalDate getSalida() {
        return sales;
    }
}
