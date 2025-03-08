package prog2.model;

public class MobilHome extends Casa {
    private boolean terrassaBarbacoa;

    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        super(nom_, idAllotjament_, mida, habitacions, placesPersones);
        setTerrassaBarbacoa(terrassaBarbacoa);
        estanciaMinAlta = 5;
        estanciaMinBaixa = 3;
    }

    public boolean isTerrassaBarbacoa() {
        return terrassaBarbacoa;
    }

    public void setTerrassaBarbacoa(boolean terrassaBarbacoa) {
        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    @Override
    public boolean correcteFuncionament() {
        return isTerrassaBarbacoa();
    }
}
