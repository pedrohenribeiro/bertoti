package src;

public class Main {
    public static void main(String[] args) {
        Projeto projeto = new Projeto();
        Gerente gerente = new Gerente();
        Equipe equipe = new Equipe();

        // Adiciona os observadores ao projeto
        projeto.addObserver(gerente);
        projeto.addObserver(equipe);

        // Simula as mudanças de status do projeto
        projeto.mudarParaPlanejando();
        projeto.mudarParaEmDesenvolvimento();
        projeto.mudarParaTestando();
        projeto.mudarParaConcluido();
    }
}
