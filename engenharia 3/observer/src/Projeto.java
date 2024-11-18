package src;

import java.util.List;
import java.util.ArrayList;

class Projeto {
    private String planejando = "Projeto está sendo planejado";
    private String emDesenvolvimento = "Projeto está em desenvolvimento";
    private String testando = "Projeto está sendo testado";
    private String concluido = "Projeto foi concluído";
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public String getPlanejando() {
        return planejando;
    }

    public String getEmDesenvolvimento() {
        return emDesenvolvimento;
    }

    public String getTestando() {
        return testando;
    }

    public String getConcluido() {
        return concluido;
    }

    public void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    // Métodos para simular mudança de status e notificar observadores
    public void mudarParaPlanejando() {
        notifyObservers(planejando);
    }

    public void mudarParaEmDesenvolvimento() {
        notifyObservers(emDesenvolvimento);
    }

    public void mudarParaTestando() {
        notifyObservers(testando);
    }

    public void mudarParaConcluido() {
        notifyObservers(concluido);
    }
}
