package prog2.vista;


import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author lauraigual
 */
public class ExcepcioReserva extends Exception {

    public static final String ALLOTJAMENT_NO_DISPONIBLE = "no està disponible";
    public static final String ESTADA_MINIMA_INCOMPLETA = "no compleixen l'estada mínima";
    public static final String ERROR_DNI = "El DNI ha de tenir 9 caràcters.";
    public static final String ERROR_ID_ALLOTJAMENT = "No hi ha cap Allotjament amb aquest id %s";

    public ExcepcioReserva(String clientName, String clientDni, String allotjamentId, LocalDate dataEntrada, LocalDate dataSortida, String messageType) {
        super(generateMessage(clientName, clientDni, allotjamentId, dataEntrada, dataSortida, messageType));
    }

    public ExcepcioReserva(){
        super(generateMessage2());
    }

    public ExcepcioReserva(String id){
        super(generateMessage3(id));
    }

    private static String generateMessage(String clientName, String clientDni, String allotjamentId, LocalDate dataEntrada, LocalDate dataSortida, String messageType) {
        switch (messageType) {
            case "ALLOTJAMENT_NO_DISPONIBLE":
                return String.format(ALLOTJAMENT_NO_DISPONIBLE);
            case "ESTADA_MINIMA_INCOMPLETA":
                return String.format(ESTADA_MINIMA_INCOMPLETA);
            default:
                return "Error desconegut";
        }
    }

    private static String generateMessage2(){
        return String.format(ERROR_DNI);
    }

    private static String generateMessage3(String id_){
        return String.format(ERROR_ID_ALLOTJAMENT, id_);
    }
}
