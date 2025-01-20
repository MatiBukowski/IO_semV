package Prezenter;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("Powiadomienie")
class PowiadomienieTest {
    KontekstPowiadomienia kontekstPowiadomienia;
    Powiadomienie powiadomienie;
    boolean decyzja = true;
    @BeforeEach
    void setUp() {
        kontekstPowiadomienia = mock(KontekstPowiadomienia.class);
        powiadomienie = new Powiadomienie(kontekstPowiadomienia);
    }

    @ParameterizedTest
    @CsvSource({"true, Wybrany pojazd jest dostępny",
            "false, Wybrany pojazd jest niedostępny"})
    @Order(1)
    void PowiadomODostepnosci(boolean decyzja, String wiadomosc) {
        powiadomienie.PowiadomODostepnosci(decyzja);
        assertEquals(powiadomienie.getWiadomosc(), wiadomosc);
    }

    @ParameterizedTest
    @CsvSource({"true, Weryfikacja dokumentów zakończona sukcesem",
            "false, Weryfikacja dokumentów zakończona niepowodzeniem - niepoprawne dokumenty"})
    @Order(2)
    void PowiadomOPoprawnosciDok(boolean decyzja, String wiadomosc) {
        powiadomienie.PowiadomOPoprawnosciDok(decyzja);
        assertEquals(powiadomienie.getWiadomosc(), wiadomosc);
    }

//    @Test
    @ParameterizedTest
    @CsvSource({"true, Klient jest trzeźwy - sprzęt odblokowany",
            "false, Klient jest nietrzeźwy - sprzęt zablokowany"})
    @Order(4)
    void powiadomOTrzezwosci(boolean decyzja, String wiadomosc) {
        powiadomienie.PowiadomOTrzezwosci(decyzja);
        assertEquals(powiadomienie.getWiadomosc(), wiadomosc);
    }


    @ParameterizedTest
    @MethodSource("daneTestowe")
    @Order(3)
    void powiadomOTrzezwosci2(boolean decyzja, String wiadomosc) {
        powiadomienie.PowiadomOTrzezwosci(decyzja);
        assertEquals(powiadomienie.getWiadomosc(), wiadomosc);
    }

    static Stream<Arguments> daneTestowe() {
        return Stream.of(
                Arguments.of(true, "Klient jest trzeźwy - sprzęt odblokowany"),
                Arguments.of(false, "Klient jest nietrzeźwy - sprzęt zablokowany")
        );
    }
}