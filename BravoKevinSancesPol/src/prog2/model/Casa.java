package prog2.model;

public class Casa extends Allotjament{
    protected String mida;
    protected int habitacions;
    protected int placesPersones;
    Casa(String nom_,String idAllotjament_,String mida,int habitacions, int placesPersones) {
        super(nom_, idAllotjament_);
        this.mida=mida;
        this.habitacions=habitacions;
        this.placesPersones=placesPersones;
    }
}
