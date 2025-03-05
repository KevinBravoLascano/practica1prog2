package prog2.model;

public class MobilHome extends Casa{
    boolean terrassaBarbacoa;
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        super(nom_,idAllotjament_,mida,habitacions,placesPersones);
        this.terrassaBarbacoa = terrassaBarbacoa;
        estanciaMinAlta=5;
        estanciaMinBaixa=3;
    }

    @Override
    public boolean correcteFuncionament() {
        return terrassaBarbacoa;
    }
}
