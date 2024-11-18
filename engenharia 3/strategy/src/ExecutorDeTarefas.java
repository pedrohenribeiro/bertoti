public class ExecutorDeTarefas {
    private Tarefa tarefa;

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public void executarTarefa() {
        tarefa.executar();
    }
}
