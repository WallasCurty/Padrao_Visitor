public class CentroCirurgico implements Hospital{
    private int numeroSala;
    private int andar;

    public CentroCirurgico(int numeroSala, int andar) {
        this.numeroSala = numeroSala;
        this.andar = andar;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCentroCirurgico(this);
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public int getAndar() {
        return andar;
    }
}
