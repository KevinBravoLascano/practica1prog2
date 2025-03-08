package prog2.model;

public class Parcela extends Allotjament {
    protected float metres;
    protected boolean conexioElectrica;

    public Parcela(String nombre, String id, float metres, boolean connexioElectrica) {
        super(nombre, id, 4, 2);
        this.setMetres(metres);
        this.setConexioElectrica(connexioElectrica);
    }

    public float getMetres() {
        return metres;
    }

    public void setMetres(float metres) {
        this.metres = metres;
    }

    public boolean isConexioElectrica() {
        return conexioElectrica;
    }

    public void setConexioElectrica(boolean conexioElectrica) {
        this.conexioElectrica = conexioElectrica;
    }

    @Override
    public boolean correcteFuncionament() {
        return this.isConexioElectrica();
    }
}
