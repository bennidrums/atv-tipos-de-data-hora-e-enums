import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataHoraMain {
    public static void main(String[] args) {

        LocalDateTime dataHoraAtualEvento = LocalDateTime.now();
        DayOfWeek diaJava = dataHoraAtualEvento.getDayOfWeek();
        DiaDaSemana diaDaSemana=null;

        switch (diaJava) {
            case SUNDAY:
                diaDaSemana = DiaDaSemana.DOMINGO;
                break;
            case MONDAY:
                diaDaSemana = DiaDaSemana.SEGUNDA;
                break;
            case TUESDAY:
                diaDaSemana = DiaDaSemana.TERÇA;
                break;
            case WEDNESDAY:
                diaDaSemana = DiaDaSemana.QUARTA;
                break;
            case THURSDAY:
                diaDaSemana = DiaDaSemana.QUINTA;
                break;
            case FRIDAY:
                diaDaSemana = DiaDaSemana.SEXTA;
                break;
            case SATURDAY:
                diaDaSemana = DiaDaSemana.SÁBADO;
                break;
        }

        Evento evento = new Evento("\nReunião",dataHoraAtualEvento, diaDaSemana);
        evento.exibirEvento();
        LocalDateTime novaDataHora = dataHoraAtualEvento.plusDays(5);
        System.out.println("\nNova data: "+ novaDataHora);

        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        ZoneId zoneIdGmt = ZoneId.of("GMT");
        ZonedDateTime dataHoraSaoPaulo = dataHoraAtualEvento.atZone(zoneId);
        ZonedDateTime dataHoraGmt = novaDataHora.atZone(zoneIdGmt);

        System.out.println("Data hora: "+ dataHoraSaoPaulo);
        System.out.println("GMT: "+ dataHoraGmt);
    }
}