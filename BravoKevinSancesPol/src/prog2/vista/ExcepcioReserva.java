package prog2.vista;


import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author lauraigual
 */
public class ExcepcioReserva extends Exception {

    public static final String ALLOTJAMENT_NO_DISPONIBLE = "L’allotjament amb identificador %s no està disponible en la data demanada %s pel client %s amb DNI: %s.";
    public static final String ESTADA_MINIMA_INCOMPLETA = "Les dates sol·licitades pel client %s amb DNI: %s no compleixen l'estada mínima per l'allotjament amb identificador %s.";
    public static final String ERROR_DNI = "El dni proporcionat per %s amb numero %s és incorrecte.";
    public static final String ERROR_ID_ALLOTJAMENT = "No hi ha cap Allotjament amb aquest id %s";

    public ExcepcioReserva(String clientName, String clientDni, String allotjamentId, LocalDate dataEntrada, LocalDate dataSortida, String messageType) {
        super(generateMessage(clientName, clientDni, allotjamentId, dataEntrada, dataSortida, messageType));
    }

    public ExcepcioReserva(String clientName, String clientDni ){
        super(generateMessage2(clientName, clientDni));
    }

    public ExcepcioReserva(String id){
        super(generateMessage3(id));
    }

    private static String generateMessage(String clientName, String clientDni, String allotjamentId, LocalDate dataEntrada, LocalDate dataSortida, String messageType) {
        switch (messageType) {
            case "ALLOTJAMENT_NO_DISPONIBLE":
                return String.format(ALLOTJAMENT_NO_DISPONIBLE, allotjamentId, dataEntrada.toString(), clientName, clientDni);
            case "ESTADA_MINIMA_INCOMPLETA":
                return String.format(ESTADA_MINIMA_INCOMPLETA, clientName, clientDni, allotjamentId);
            default:
                return "Error desconegut";
        }
    }

    private static String generateMessage2(String clientName, String clientDni){
        return String.format(ERROR_DNI, clientName, clientDni);
    }

    private static String generateMessage3(String id_){
        return String.format(ERROR_ID_ALLOTJAMENT, id_);
    }
}
