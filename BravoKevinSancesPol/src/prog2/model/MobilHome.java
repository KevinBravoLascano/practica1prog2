package prog2.model;

public class MobilHome extends Casa{
    boolean terrassaBarbacoa;
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        super(nom_,idAllotjament_,mida,habitacions,placesPersones);
        this.terrassaBarbacoa = terrassaBarbacoa;
    }
}
