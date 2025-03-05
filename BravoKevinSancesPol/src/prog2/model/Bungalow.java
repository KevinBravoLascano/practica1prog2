package prog2.model;

public class Bungalow extends Casa{
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;
    Bungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred){
        super(nom_,idAllotjament_,mida,habitacions,placesPersones);
        this.placesParquing=placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
        estanciaMinAlta = 7;
        estanciaMinBaixa = 4;
    }

    @Override
    public boolean correcteFuncionament() {
        return aireFred;
    }
}
