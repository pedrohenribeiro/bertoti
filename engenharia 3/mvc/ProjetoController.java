public class ProjetoController {
    private Projeto projeto;

    public ProjetoController(Projeto projeto) {
        this.projeto = projeto;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        projeto.addTarefa(tarefa);
    }

    public void aplicarAjuste(EstrategiaDePrazo estrategiaDePrazo) {
        projeto.setEstrategiaDePrazo(estrategiaDePrazo);
    }
}
