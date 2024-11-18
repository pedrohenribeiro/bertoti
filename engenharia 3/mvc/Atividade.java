public class Atividade implements Tarefa {
    private String descricao;
    private double duracao; // Duração em horas

    public Atividade(String descricao, double duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
    }

    @Override
    public double getDuracao() {
        return duracao;
    }
}
