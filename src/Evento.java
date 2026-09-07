import java.time.LocalDateTime;
public class Evento {

    private String nomeEvento;
    private LocalDateTime dataHoraAtualEvento;
    private DiaDaSemana diaDaSemanaEvento;

    public Evento(String nomeEvento, LocalDateTime dataHoraAtualEvento, DiaDaSemana diaDaSemanaEvento){
        this.nomeEvento = nomeEvento;
        this.dataHoraAtualEvento = dataHoraAtualEvento;
        this.diaDaSemanaEvento = diaDaSemanaEvento;
    }

    void exibirEvento() {
        System.out.println(nomeEvento);
        System.out.println(dataHoraAtualEvento);
        System.out.println(diaDaSemanaEvento);
    }
}