import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HospitalVisitorTest {
    @Test
    void deveExibirCentroCirurgico() {
        CentroCirurgico centroCirurgico = new CentroCirurgico(2100, 2);

        HospitalVisitor visitor = new HospitalVisitor();

        assertEquals("CentroCirurgico{numeroSala='2100', andar='2'}", visitor.exibir(centroCirurgico));
    }

    @Test
    void deveExibirProntoSocorro() {
        ProntoSocorro prontoSocorro = new ProntoSocorro(1500, "2135689063");

        HospitalVisitor visitor = new HospitalVisitor();

        assertEquals("ProntoSocorro{numeroSala='1500', telefone='2135689063'}", visitor.exibir(prontoSocorro));
    }

    @Test
    void deveExibirClinica() {
        Clinica clinica = new Clinica(3100, 3,"245368494");

        HospitalVisitor visitor = new HospitalVisitor();

        assertEquals("Clinica{numeroSala='3100', andar='3', telefone='245368494'}", visitor.exibir(clinica));
    }
}
