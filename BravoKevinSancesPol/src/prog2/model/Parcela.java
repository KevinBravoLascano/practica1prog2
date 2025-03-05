package prog2.model;

public class Parcela extends Allotjament{
    protected float metres;
    protected boolean conexioElectrica;
    public Parcela(String nombre, String id, float metres, boolean connexioElectrica){
        super(nombre,id,4,2);
        this.metres= this.metres;
        this.conexioElectrica=conexioElectrica;


    }
    public float getMetres(){

        return metres;
    }

    @Override
    public boolean correcteFuncionament() {

        return conexioElectrica;
    }
}
