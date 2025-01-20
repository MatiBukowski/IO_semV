package Prezenter;

import Model.Pojazd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import mockit.*;

public class WeryfikacjaTrzezwosciCapturingTest {


    @Tested
    private WeryfikacjaTrzezwosci weryfikacjaTrzezwosci;

    @Injectable
    private Pojazd pojazd;

    @Capturing
    private Powiadomienie powiadomienie; // Przechwyci wszystkie instancje Powiadomienie i ich podklasy

    @Test
    public void testObsluz_KierowcaTrzezwy() {
        // Konfiguracja stanu klasy
        new mockit.Expectations() {{
//            powiadomienie.PowiadomOTrzezwosci(true); // Mockowanie zachowania
            weryfikacjaTrzezwosci.AnalizaPomiaru();  // Symulujemy trzeźwego kierowcę
            result = false;  // Kierowca jest trzeźwy
        }};

        boolean decyzja = weryfikacjaTrzezwosci.Obsluz(pojazd);

        // Weryfikacja przechwycenia
        new Verifications() {{
            powiadomienie.PowiadomOTrzezwosci(true); // Weryfikacja, że metoda została wywołana z true
        }};

        assertTrue(decyzja, "Kierowca powinien być trzeźwy, więc decyzja powinna być true");
    }
}
