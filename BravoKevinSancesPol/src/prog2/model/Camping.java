package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camping implements InCamping {
    private String nombre;
    protected ArrayList<Allotjament> allotjaments;
    protected ArrayList<Client> clients;

    Camping(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getNom() {
        return nombre;
    }

    @Override
    public LlistaReserves getLlistaReserves() {
        return null;
    }

    @Override
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return allotjaments;
    }

    @Override
    public ArrayList<Client> getLlistaClients() {
        return clients;
    }

    @Override
    public int getNumAllotjaments() {
        int size = allotjaments.size();
        return size;
    }

    @Override
    public int getNumReserves() {
        return 0;
    }

    @Override
    public int getNumClients() {
        int tamano = clients.size();
        return tamano;
    }

    @Override
    public void afegirClient(String nom_, String dni_) throws ExcepcioReserva {
        Client duxo = new Client(nom_,dni_);
        clients.add(duxo);
    }

    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        Parcela aquino = new Parcela(nom_,idAllotjament_,metres,connexioElectrica);
        allotjaments.add(aquino);
    }

    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        Bungalow mictia = new Bungalow(nom_,idAllotjament_,mida,habitacions,placesPersones,placesParquing,terrassa,tv,aireFred);
        allotjaments.add(mictia);
    }

    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        BungalowPremium sylvee = new BungalowPremium(nom_,idAllotjament_,mida,habitacions,placesPersones,placesParquing,terrassa,tv, aireFred,serveisExtra,codiWifi);
        allotjaments.add(sylvee);
    }

    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {

    }

    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {

    }

    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }

    @Override
    public float calculMidaTotalParceles() {
        return 0;
    }

    @Override
    public int calculAllotjamentsOperatius() {

        return 0;
    }

    @Override
    public Allotjament getAllotjamentEstadaMesCurta() {
        return null;
    }
}
