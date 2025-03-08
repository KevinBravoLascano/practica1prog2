package prog2.model;

import java.time.LocalDate;

public class Allotjament implements InAllotjament {
    protected String nombre;
    protected String id;
    protected long estanciaMinBaixa;
    protected long estanciaMinAlta;
    public Allotjament(String nom_, String idAllotjament_,int estanciaMinAlta_, int estanciaMinBaixa_) {
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
        if(temp==Temp.ALTA){
            return estanciaMinAlta;
        }
        else{
            return estanciaMinBaixa;
        }
    }
    public Temp getTemporada(LocalDate fecha) {
        LocalDate empiezaAlta=LocalDate.of(2025,3,21);
        LocalDate terminaAlta=LocalDate.of(2025,9,20);
        if(fecha.isAfter(empiezaAlta)&&fecha.isBefore(terminaAlta)){
            return Temp.ALTA;
        }else{
            return Temp.BAIXA;
        }

    }
    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        this.estanciaMinAlta = estadaMinimaALTA_;
        this.estanciaMinBaixa = estadaMinimaBAIXA_;
    }

    @Override
    public boolean correcteFuncionament() {
        return false;
    }
}