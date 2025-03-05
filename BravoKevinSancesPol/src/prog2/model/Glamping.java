package prog2.model;

public class Glamping extends Casa{
    String material;
    boolean casaMascota;
    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota){
        super(nom_,idAllotjament_,mida,habitacions,placesPersones);
        this.material = material;
        this.casaMascota = casaMascota;
        estanciaMinAlta=5;
        estanciaMinBaixa=3;
    }

    @Override
    public boolean correcteFuncionament() {
        return casaMascota;
    }
}
