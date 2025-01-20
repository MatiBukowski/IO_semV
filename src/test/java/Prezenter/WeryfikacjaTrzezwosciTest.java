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

    @Capturing
    private boolean capturedTrzezwoscStatus;

    @Test
    public void testObsluz_KierowcaTrzezwy() {
        new mockit.Expectations() {{
            weryfikacjaTrzezwosci.ZweryfikujTrzezwosc();
            result = true;
            capturedTrzezwoscStatus = true;
        }};

        boolean decyzja = weryfikacjaTrzezwosci.Obsluz(pojazd);

        new mockit.Verifications() {{
            powiadomienieOTrzezwosci.PowiadomOTrzezwosci(capturedTrzezwoscStatus);
        }};

        assertTrue(decyzja, "Kierowca powinien być trzeźwy, więc decyzja powinna być true");
        assertTrue(capturedTrzezwoscStatus, "Status powiadomienia powinien być true, ponieważ kierowca jest trzeźwy");
    }

}