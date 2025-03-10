package prog2.model;

public class BungalowPremium extends Bungalow {
    private boolean serveisExtra;
    private String codiWifi;

    public BungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        super(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        setServeisExtra(serveisExtra);
        setCodiWifi(codiWifi);
    }

    public boolean isServeisExtra() {
        return serveisExtra;
    }

    public void setServeisExtra(boolean serveisExtra) {
        this.serveisExtra = serveisExtra;
    }

    public String getCodiWifi() {
        return codiWifi;
    }

    public void setCodiWifi(String codiWifi) {
        this.codiWifi = codiWifi;
    }

    @Override
    public boolean correcteFuncionament() {
        boolean correcte1 = super.correcteFuncionament();
        return correcte1 && codiWifi.length() >= 8 && codiWifi.length() <= 16;
    }
}
