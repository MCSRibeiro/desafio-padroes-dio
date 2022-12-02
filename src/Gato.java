public class Gato {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void miar() {
        comportamento.miar();
    }
}
