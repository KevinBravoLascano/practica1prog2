package prog2.model;

public class Glamping extends Casa {
    private String material;
    private boolean casaMascota;

    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        super(nom_, idAllotjament_, mida, habitacions, placesPersones);
        setMaterial(material);
        setCasaMascota(casaMascota);
        estanciaMinAlta = 5;
        estanciaMinBaixa = 3;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isCasaMascota() {
        return casaMascota;
    }

    public void setCasaMascota(boolean casaMascota) {
        this.casaMascota = casaMascota;
    }

    @Override
    public boolean correcteFuncionament() {
        return isCasaMascota();
    }
}
