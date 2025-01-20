package Prezenter;

import Widok.*;
import Model.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class WeryfikacjaDokumentowTest {
    @Mock
    private KontekstPowiadomienia kontekstMock;

    @Mock
    private Powiadomienie powiadomienieOWeryfikacji;
    @Mock
    private FasadaWidoku fasadaWidoku;
//    @Mock
//    private Powiadomienie powiadomienieOWeryfikacji;
    @Mock
    private Formularz formularzDanychKlienta;

    @Spy
    @InjectMocks
    private WeryfikacjaDokumentow weryfikacja;                              // wstrzykiwanie zależności

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);         // inicjalizacja mocków
    }

//    @org.junit.jupiter.api.Test
    @Test
    public void testObsluzDokumentyPoprawne() {
//        WeryfikacjaDokumentow weryfikacja = new WeryfikacjaDokumentow();
        weryfikacja.SetFasadaWidoku(fasadaWidoku);

//        when(weryfikacja.WyslijDokumentyDoSprawdzenia(formularzDanychKlienta)).thenReturn(true);
        doReturn(true).when(weryfikacja).WyslijDokumentyDoSprawdzenia(formularzDanychKlienta);
        doAnswer(invocation -> {System.out.println("Formularz został wyświetlony"); return null;}).when(fasadaWidoku).WyswietlFormularz(any(Formularz.class));
        doAnswer(invocation -> {System.out.println("Wysłano powiadomienie"); return null;}).when(powiadomienieOWeryfikacji).PowiadomOPoprawnosciDok(true);


        weryfikacja.WyslijFormularz(formularzDanychKlienta);

//        // Assercja: sprawdzamy, czy dokumentyPoprawne zostały ustawione na true
//        Field dokumentyPoprawneField = WeryfikacjaDokumentow.class.getDeclaredField("dokumentyPoprawne");
//        dokumentyPoprawneField.setAccessible(true);
//        boolean dokumentyPoprawneValue = (boolean) dokumentyPoprawneField.get(weryfikacja);

//        assertTrue(dokumentyPoprawneValue, "Dokumenty powinny być poprawne.");

        boolean wynik = weryfikacja.Obsluz(new Pojazd());

        assertTrue(wynik, "Dokumenty powinny być poprawne");
    }

//    @Test
//    public void testObsluzDokumentyNiepoprawne() {
//        // Przygotowanie: tworzymy instancję WeryfikacjaDokumentow i wstrzykujemy zależności
//        WeryfikacjaDokumentow weryfikacja = new WeryfikacjaDokumentow();
//        weryfikacja.SetFasadaWidoku(fasadaWidokuMock);
//
//        // Mockowanie zachowań: zakładamy, że dokumenty są niepoprawne
//        new Expectations() {{
//            fasadaWidokuMock.WyswietlFormularz((Formularz) any); result = null;
//            powiadomienieOWeryfikacjiMock.PowiadomOPoprawnosciDok(false); result = null;
//        }};
//
//        // Działanie: wywołanie metody testowanej
//        boolean wynik = weryfikacja.Obsluz(new Pojazd());
//
//        // Assercja: sprawdzenie, czy metoda zwróciła prawidłowy wynik, gdy dokumenty są niepoprawne
//        assertFalse(wynik, "Dokumenty powinny być niepoprawne");
//    }

}