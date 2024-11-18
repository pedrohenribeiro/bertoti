import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private List<Tarefa> tarefas = new ArrayList<>();
    private List<GestorObserver> observers = new ArrayList<>();
    private EstrategiaDePrazo estrategiaDePrazo = new SemAjuste(); // Estratégia padrão

    public void setEstrategiaDePrazo(EstrategiaDePrazo estrategiaDePrazo) {
        this.estrategiaDePrazo = estrategiaDePrazo;
        notifyObservers();
    }

    public void addTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        notifyObservers();
    }

    public double getDuracaoTotal() {
        double duracaoTotal = tarefas.stream().mapToDouble(Tarefa::getDuracao).sum();
        return estrategiaDePrazo.ajustarPrazo(duracaoTotal);
    }

    public void addObserver(GestorObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        double duracaoTotal = getDuracaoTotal();
        for (GestorObserver observer : observers) {
            observer.update(duracaoTotal);
        }
    }
}
