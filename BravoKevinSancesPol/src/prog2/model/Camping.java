package prog2.model;

import prog2.vista.ExcepcioReserva;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;

import static prog2.model.InAllotjament.Temp.BAIXA;

public class Camping implements InCamping {
    private String nombre;
    protected ArrayList<Allotjament> allotjaments;
    protected ArrayList<Client> clients;
    protected LlistaReserves reservas;

    Camping(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getNom() {
        return nombre;
    }

    @Override
    public LlistaReserves getLlistaReserves() {

        return reservas;
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
        int tamano= reservas.getNumReserves();
        return tamano;
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
        Glamping lucasta = new Glamping(nom_,idAllotjament_,mida,habitacions,placesPersones,material,casaMascota);
        allotjaments.add(lucasta);
    }

    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        MobilHome feryfer = new MobilHome(nom_,idAllotjament_,mida,habitacions,placesPersones,terrassaBarbacoa);
        allotjaments.add(feryfer);
    }

    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        Allotjament peruvianHouse= buscarAllotjament(id_);
        Client emikukis = buscarClient(dni_);
        reservas.afegirReserva(peruvianHouse,emikukis,dataEntrada,dataSortida);
    }

    public static InAllotjament.Temp getTemporada(LocalDate data) {
        LocalDate iniciAlta = LocalDate.of(data.getYear(), Month.MARCH, 21);
        LocalDate fiAlta = LocalDate.of(data.getYear(), Month.SEPTEMBER, 20);

        if (!data.isBefore(iniciAlta) && !data.isAfter(fiAlta)) {
            return InAllotjament.Temp.ALTA;
        } else {
            return BAIXA;
        }
    }




    @Override
    public float calculMidaTotalParceles() {
        Iterator<Allotjament> it = allotjaments.iterator();
        float metros = 0.0f;
        while (it.hasNext()) {
            Allotjament allotjament = it.next();
            if(allotjament instanceof Parcela) {
                metros+= ((Parcela) allotjament).getMetres();

            }
        }
        return metros;
    }

    @Override
    public int calculAllotjamentsOperatius() {
        int operativos=0;
        Iterator<Allotjament> it = allotjaments.iterator();
        while (it.hasNext()) {
            Allotjament allotjament = it.next();
            if(allotjament.correcteFuncionament()) {
                operativos++;
            }
        }
        return operativos;
    }

    @Override
    public Allotjament getAllotjamentEstadaMesCurta() {
        long comparador=1000000;
        Iterator<Allotjament> it = allotjaments.iterator();
        Allotjament resultado=null;
        while (it.hasNext()) {
            Allotjament allotjament = it.next();
            if(allotjament.getEstadaMinima(BAIXA)<comparador) {
                comparador=allotjament.getEstadaMinima(BAIXA);
                resultado=allotjament;
            }
        }
        return resultado;
    }
    private Allotjament buscarAllotjament(String id){
        Iterator<Allotjament> it = allotjaments.iterator();
        while (it.hasNext()) {
            Allotjament allotjament = it.next();
            if(allotjament.getId().equals(id)) {
                return allotjament;
            }
        }
        return null;
    }
    private Client buscarClient(String dni){
        Iterator<Client> it = clients.iterator();
        while (it.hasNext()) {
            Client client = it.next();
            if(client.getDni().equals(dni)) {
                return client;
            }
        }
        return null;
    }
}
