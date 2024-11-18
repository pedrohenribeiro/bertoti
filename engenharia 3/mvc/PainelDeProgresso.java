public class PainelDeProgresso implements GestorObserver {
    @Override
    public void update(double duracaoTotal) {
        System.out.println("Duração total atualizada: " + duracaoTotal + " horas");
    }
}
