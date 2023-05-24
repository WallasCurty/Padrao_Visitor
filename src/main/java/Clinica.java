public class Clinica implements Hospital{
    private int numeroSala;
    private int andar;

    private String telefone;

    public Clinica(int numeroSala, int andar, String telefone) {
        this.numeroSala = numeroSala;
        this.andar = andar;
        this.telefone = telefone;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirClinica(this);
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public int getAndar() {
        return andar;
    }

    public String getTelefone() {
        return telefone;
    }
}
