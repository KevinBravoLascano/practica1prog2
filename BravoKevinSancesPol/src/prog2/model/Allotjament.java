package prog2.model;

public class Allotjament implements InAllotjament {
    protected String nombre;
    protected String id;
    Allotjament(String nom_, String idAllotjament_){
        nombre=nom_;
        id=idAllotjament_;
    }
    @Override
    public String getNom() {
        return nombre;
    }

    @Override
    public void setNom(String nom) {
        Allotjament.this.nombre = nom;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        Allotjament.this.id = id;
    }

    @Override
    public long getEstadaMinima(Temp temp) {
        return 0;
    }

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {

    }

    @Override
    public boolean correcteFuncionament() {
        return false;
    }
}
