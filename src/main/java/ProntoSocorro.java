public class ProntoSocorro implements Hospital {
    private int numeroSala;
    private String telefone;

    public ProntoSocorro(int numeroSala, String telefone) {
        this.numeroSala = numeroSala;
        this.telefone = telefone;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirProntoSocorro(this);
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public String getTelefone() {
        return telefone;
    }
}
