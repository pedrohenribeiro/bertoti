public class Main {
    public static void main(String[] args) {
        ExecutorDeTarefas executor = new ExecutorDeTarefas();

        executor.setTarefa(new TarefaEmails());
        executor.executarTarefa();

        executor.setTarefa(new TarefaDocumentos());
        executor.executarTarefa();
    }
}
