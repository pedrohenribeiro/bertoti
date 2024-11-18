public class EventoOrganizador {
    private EspacoReserva espacoReserva;
    private BuffetReserva buffetReserva;
    private EntretenimentoReserva entretenimentoReserva;

    public EventoOrganizador() {
        espacoReserva = new EspacoReserva();
        buffetReserva = new BuffetReserva();
        entretenimentoReserva = new EntretenimentoReserva();
    }

    public void organizarEvento() {
        System.out.println("Vamos organizar tudo para o seu evento...");
        espacoReserva.espacoReserva();
        buffetReserva.buffetReserva();
        entretenimentoReserva.entretenimentoReserva();
        System.out.println("Evento organizado com sucesso.");
    }
}