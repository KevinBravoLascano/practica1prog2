package prog2.model;

public class BungalowPremium extends Bungalow{
    boolean serveisExtra;
    String codiWifi;

    BungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred,boolean serveisExtra, String codiWifi) {
        super(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
        estanciaMinAlta = 7;
        estanciaMinBaixa = 4;
    }

    @Override
    public boolean correcteFuncionament() {
        boolean correcte1=super.correcteFuncionament();
        if(correcte1 && codiWifi.length()>=8 && codiWifi.length()<=16) {
            return true;
        }
        return false;
    }
}
