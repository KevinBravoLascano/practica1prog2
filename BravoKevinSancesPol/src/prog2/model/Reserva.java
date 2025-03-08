package prog2.model;

import java.time.LocalDate;

public class Reserva {
    private Allotjament al;
    private Client peruano;
    private LocalDate entras;
    private LocalDate sales;

    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) {
        setAllotjament(allotjament);
        setClient(client);
        setEntrada(dataEntrada);
        setSalida(dataSortida);
    }

    public Allotjament getAllotjament() {
        return al;
    }

    public void setAllotjament(Allotjament allotjament) {
        al = allotjament;
    }

    public Client getClient() {
        return peruano;
    }

    public void setClient(Client client) {
        peruano = client;
    }

    public LocalDate getEntrada() {
        return entras;
    }

    public void setEntrada(LocalDate entrada) {
        entras = entrada;
    }

    public LocalDate getSalida() {
        return sales;
    }

    public void setSalida(LocalDate salida) {
        sales = salida;
    }
}
