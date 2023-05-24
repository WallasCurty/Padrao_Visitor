public class HospitalVisitor implements Visitor{
    public String exibir(Hospital hospital) {
        return hospital.aceitar(this);
    }

    @Override
    public String exibirCentroCirurgico(CentroCirurgico centroCirurgico) {
        return "CentroCirurgico{" +
                "numeroSala='" + centroCirurgico.getNumeroSala() + '\'' +
                ", andar='" + centroCirurgico.getAndar() + '\'' +
                '}';
    }

    @Override
    public String exibirProntoSocorro(ProntoSocorro prontoSocorro) {
        return "ProntoSocorro{" +
                "numeroSala='" + prontoSocorro.getNumeroSala() + '\'' +
                ", telefone='" + prontoSocorro.getTelefone() + '\'' +
                '}';
    }

    @Override
    public String exibirClinica(Clinica clinica) {
        return  "Clinica{" +
                "numeroSala='" + clinica.getNumeroSala() + '\'' +
                ", andar='" + clinica.getAndar() + '\'' +
                ", telefone='" + clinica.getTelefone() + '\'' +
                '}';
    }
}
