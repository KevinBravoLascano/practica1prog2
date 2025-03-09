package prog2.model;

public class Parcela extends Allotjament {
    protected float metres;
    protected boolean conexioElectrica;

    public Parcela(String nombre, String id, float metres, boolean connexioElectrica) {
        super(nombre, id, 4, 2);
        this.setMida(metres);
        this.setConnexioElectrica(connexioElectrica);
    }

    public float getMida() {
        return metres;
    }

    public void setMida(float metres) {
        this.metres = metres;
    }

    public boolean isConnexioElectrica() {
        return conexioElectrica;
    }

    public void setConnexioElectrica(boolean conexioElectrica) {
        this.conexioElectrica = conexioElectrica;
    }

    @Override
    public boolean correcteFuncionament() {
        return this.isConnexioElectrica();
    }
}
