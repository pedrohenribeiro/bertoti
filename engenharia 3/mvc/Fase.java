import java.util.ArrayList;
import java.util.List;

public class Fase implements Tarefa {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void addTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public double getDuracao() {
        return tarefas.stream().mapToDouble(Tarefa::getDuracao).sum();
    }
}
