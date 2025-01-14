package Prezenter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

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
    void PowiadomODostepnosci(boolean decyzja, String wiadomosc) {
        powiadomienie.PowiadomODostepnosci(decyzja);
        assertEquals(powiadomienie.getWiadomosc(), wiadomosc);
    }

    @ParameterizedTest
    @CsvSource({"true, Weryfikacja dokumentów zakończona sukcesem",
            "false, Weryfikacja dokumentów zakończona niepowodzeniem - niepoprawne dokumenty"})
    void PowiadomOPoprawnosciDok(boolean decyzja, String wiadomosc) {
        powiadomienie.PowiadomOPoprawnosciDok(decyzja);
        assertEquals(powiadomienie.getWiadomosc(), wiadomosc);
    }

//    @Test
    @ParameterizedTest
    @CsvSource({"true, Klient jest trzeźwy - sprzęt odblokowany",
            "false, Klient jest nietrzeźwy - sprzęt zablokowany"})
    void powiadomOTrzezwosci(boolean decyzja, String wiadomosc) {
        powiadomienie.PowiadomOTrzezwosci(decyzja);
        assertEquals(powiadomienie.getWiadomosc(), wiadomosc);
    }
}