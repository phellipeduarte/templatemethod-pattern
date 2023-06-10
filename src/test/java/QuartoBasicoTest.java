import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuartoBasicoTest {

    QuartoBasico quarto;

    @BeforeEach
    void setUp(){
        quarto = new QuartoBasico();
    }

    @Test
    void deveRetornarDiaria(){
        assertEquals(25.0, quarto.getDiaria());
    }

    @Test
    void deveRetornarTipoQuarto(){
        assertEquals("Quarto básico", quarto.getTipo());
    }

    @Test
    void deveSimularValorEstadia(){
        Integer dias = 30;
        assertEquals(750.0, quarto.simularEstadia(dias));
    }

    @Test
    void deveRetornarInformacoes(){
        quarto.setNumero("505");
        String respostaEsperada =
                "{\n" +
                        "   numero: 505,\n" +
                        "   diaria: 25.0,\n" +
                        "   tipo: Quarto básico\n" +
                        "}";

        assertEquals(respostaEsperada, quarto.getInfo());
    }
}
