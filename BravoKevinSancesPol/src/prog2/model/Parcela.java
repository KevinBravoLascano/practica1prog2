package prog2.model;

public class Parcela extends Allotjament{
    protected float metres;
    protected boolean conexioElectrica;
    public Parcela(String nombre, String id, float metres, boolean connexioElectrica){
        super(nombre,id);
        this.metres= this.metres;
        this.conexioElectrica=conexioElectrica;

    }
}
