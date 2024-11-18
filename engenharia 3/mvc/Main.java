public class Main {
    public static void main(String[] args) {
        Projeto projeto = new Projeto();
        PainelDeProgresso painel = new PainelDeProgresso();

        // Configura o observador
        projeto.addObserver(painel);

        ProjetoController controller = new ProjetoController(projeto);

        // Adiciona atividades ao projeto
        controller.adicionarTarefa(new Atividade("Construção das fundações", 120));
        controller.adicionarTarefa(new Atividade("Construção das paredes", 200));

        // Adiciona uma fase inteira ao projeto
        Fase acabamento = new Fase();
        acabamento.addTarefa(new Atividade("Pintura", 50));
        acabamento.addTarefa(new Atividade("Instalações elétricas", 80));
        controller.adicionarTarefa(acabamento);

        // Aplica um ajuste de prazo de 15%
        controller.aplicarAjuste(new AjusteDePrazo(15));
    }
}
