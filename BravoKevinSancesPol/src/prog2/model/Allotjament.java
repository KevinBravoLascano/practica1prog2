package prog2.model;

import java.time.LocalDate;
import java.time.MonthDay;

public class Allotjament implements InAllotjament {
    protected String nombre;
    protected String id;
    protected long estanciaMinBaixa;
    protected long estanciaMinAlta;
    public Allotjament(String nom_, String idAllotjament_,int estanciaMinAlta_, int estanciaMinBaixa_) {
        nombre=nom_;
        id=idAllotjament_;
        this.estanciaMinAlta=estanciaMinAlta_;
        this.estanciaMinBaixa=estanciaMinBaixa_;
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
        MonthDay empiezaAlta = MonthDay.of(3, 21);
        MonthDay terminaAlta = MonthDay.of(9, 20);

        MonthDay fechaTemporal = MonthDay.from(fecha);

        if (fechaTemporal.isAfter(empiezaAlta) && fechaTemporal.isBefore(terminaAlta)) {
            return Temp.ALTA;  // Temporada Alta
        } else {
            return Temp.BAIXA;  // Temporada Baja
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

    @Override
    public String toString() {
        return "Nom=" + nombre + ", Id=" + id + ", estada mínima en temp ALTA: " + estanciaMinAlta + ", estada mínima en temp BAIXA: " + estanciaMinBaixa + ".";
    }

}
