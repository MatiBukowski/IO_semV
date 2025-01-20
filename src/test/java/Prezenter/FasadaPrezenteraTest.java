package Prezenter;
import Model.*;
import Widok.*;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@Tag("Fasada")
class FasadaPrezenteraTest {
    private FasadaPrezentera fasadaPrezentera;
    private FasadaWidoku fasadaWidoku;
    private FasadaZwracaniaPojazdu fasadaZwracaniaPojazdu;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        fasadaWidoku = mock(FasadaWidoku.class);
//        fasadaZwracaniaPojazdu = new FasadaZwracaniaPojazdu();
        fasadaZwracaniaPojazdu = mock(FasadaZwracaniaPojazdu.class);
        fasadaPrezentera = new FasadaPrezentera(fasadaWidoku, fasadaZwracaniaPojazdu);
    }

    @org.junit.jupiter.api.Test
    void dodajOferte() {
        Formularz formularz = mock(Formularz.class);
//        doNothing().when(fasadaZwracaniaPojazduMock).DodajPojazd(formularz);
        fasadaPrezentera.DodajOferte(formularz);

        verify(fasadaZwracaniaPojazdu, times(1)).DodajPojazd(formularz);
    }

    @org.junit.jupiter.api.Test
    void usunOferte() {
        int idSprzetu = 10;
        fasadaPrezentera.UsunOferte(idSprzetu);
        verify(fasadaZwracaniaPojazdu, times(1)).UsunPojazd(idSprzetu);
    }

    @org.junit.jupiter.api.Test
    void wyswietlOferty() {
    }

    @org.junit.jupiter.api.Test
    void zarezerwujOferte() {
        Pojazd pojazd = mock(Pojazd.class);
        when(pojazd.getStatus_dostepnosci()).thenReturn(true);

        WeryfikacjaDostepnosci weryfikacjaDostepnosci = mock(WeryfikacjaDostepnosci.class);
        WeryfikacjaDokumentow weryfikacjaDokumentow = mock(WeryfikacjaDokumentow.class);
//        doReturn(false).when(weryfikacjaDokumentow).Obsluz(pojazd);
//        doNothing().when(weryfikacjaDokumentow).ZweryfikujDokumenty();

        weryfikacjaDokumentow.SetFasadaWidoku(fasadaWidoku);
        weryfikacjaDostepnosci.SetNastepnik(weryfikacjaDokumentow);

        //when(weryfikacjaDostepnosci.Obsluz(pojazd)).thenReturn(true);
        boolean wynik = weryfikacjaDostepnosci.Obsluz(pojazd);
        //assertTrue(wynik);

//        fasadaPrezentera.ZarezerwujOferte(pojazd);

        verify(weryfikacjaDostepnosci, times(1)).Obsluz(pojazd);
    }
}