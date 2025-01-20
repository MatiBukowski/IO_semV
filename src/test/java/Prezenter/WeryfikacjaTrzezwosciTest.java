package Prezenter;

import Model.Pojazd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import mockit.*;

class WeryfikacjaTrzezwosciTest {
    @Tested
    private WeryfikacjaTrzezwosci weryfikacjaTrzezwosci;  // Obiekt testowany

    @Injectable
    private Pojazd pojazd;  // Wstrzykiwana zależność

    @Mocked
    private Powiadomienie powiadomienieOTrzezwosci;  // Mock dla powiadomienia

    @Test
    public void testObsluz_KierowcaTrzezwy() {
        // Konfiguracja stanu klasy (np. symulacja trzeźwości kierowcy)
        new mockit.Expectations() {{
            weryfikacjaTrzezwosci.ZweryfikujTrzezwosc();  // Symulujemy trzeźwego kierowcę
            result = true;  // Kierowca jest trzeźwy
        }};

        boolean decyzja = weryfikacjaTrzezwosci.Obsluz(pojazd);

        // Weryfikacja zachowania
        new mockit.Verifications() {{
            powiadomienieOTrzezwosci.PowiadomOTrzezwosci(true);  // Powiadomienie o trzeźwości
        }};

        // Sprawdzenie wyniku
        assertTrue(decyzja, "Kierowca powinien być trzeźwy, więc decyzja powinna być true");
    }

}