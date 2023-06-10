import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuartoSuiteTest {

    QuartoSuite suite;

    @BeforeEach
    void setUp(){
        suite = new QuartoSuite();
    }

    @Test
    void deveRetornarDiaria(){
        assertEquals(55.0, suite.getDiaria());
    }

    @Test
    void deveRetornarTipoQuarto(){
        assertEquals("Suíte", suite.getTipo());
    }

    @Test
    void deveSimularValorEstadia(){
        Integer dias = 30;
        assertEquals(1650.0, suite.simularEstadia(dias));
    }

    @Test
    void deveRetornarInformacoes(){
        suite.setNumero("505");
        String respostaEsperada =
            "{\n" +
            "   numero: 505,\n" +
            "   diaria: 55.0,\n" +
            "   tipo: Suíte\n" +
            "}";

        assertEquals(respostaEsperada, suite.getInfo());
    }
}
