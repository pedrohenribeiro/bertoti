public class AjusteDePrazo implements EstrategiaDePrazo {
    private double porcentagem;

    public AjusteDePrazo(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public double ajustarPrazo(double totalHoras) {
        return totalHoras - (totalHoras * porcentagem / 100);
    }
}
