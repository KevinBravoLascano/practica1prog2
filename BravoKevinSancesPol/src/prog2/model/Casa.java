package prog2.model;

public class Casa extends Allotjament {
    private String mida;
    private int habitacions;
    private int placesPersones;

    protected Casa(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones) {
        super(nom_, idAllotjament_, 7, 3);
        setMida(mida);
        setHabitacions(habitacions);
        setPlacesPersones(placesPersones);
    }

    public String getMida() {
        return mida;
    }

    public void setMida(String mida) {
        this.mida = mida;
    }

    public int getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }

    public int getPlacesPersones() {
        return placesPersones;
    }

    public void setPlacesPersones(int placesPersones) {
        this.placesPersones = placesPersones;
    }

    @Override
    public long getEstadaMinima(Temp temp) {
        return super.getEstadaMinima(temp);
    }
}
