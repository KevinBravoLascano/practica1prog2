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

    // Constructor con parámetros personalizados
    public ExcepcioReserva(String clientName, String clientDni, String allotjamentId, LocalDate dataEntrada, LocalDate dataSortida, String messageType) {
        super(generateMessage(clientName, clientDni, allotjamentId, dataEntrada, dataSortida, messageType));
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
}
