public class Main {
    public static void main(String[] args) {
        // Cliente usa apenas o Facade
        EventoOrganizador eventoOrganizador = new EventoOrganizador();
        eventoOrganizador.organizarEvento();
    }
}